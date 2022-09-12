fun createBoard(): Array<Array<String>> {
    return Array(8) { Array(8) { "emps" } }
}

fun printBoard(board: Array<Array<String>>) {
    board.forEach { spaces ->
        spaces.forEach { print("$it ") }
        println()
    }
}

fun chessInput(pieceType: String): List<String> {
    println("Enter $pieceType: ")
    return userInput()
}



fun displayInputs(whiteChessInput: List<String>, blackChessInput: List<String>) {
    println(
        "You entered: \nWhite: " + whiteChessInput.joinToString(separator = ":")
                + "\nBlack: " + blackChessInput.joinToString(separator = ":")
    )
}

private fun input(): String {
    return readLine()!!
}

private fun removeSpaces(string: String): String {
    return string.replace("\\s".toRegex(), "")
}

private fun toListCommaSeparated(string: String): List<String> = string.split(",")

private fun userInput(): List<String> {
    return capitalizeFirstLetter(toListCommaSeparated(removeSpaces(input())))
}

private fun capitalizeFirstLetter(string: List<String>): List<String> {
    val wordList: MutableList<String> = mutableListOf()
    for (word in string) {
        wordList.add(word.capitalize())
    }
    return wordList
}