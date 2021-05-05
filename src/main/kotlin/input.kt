fun createBoard(): Array<IntArray> {
    return Array(8) { IntArray(8) }
}

fun printBoard(board: Array<IntArray>) {
    for (row in board) {
        println(row.contentToString())
    }
}

fun input(): String {
    return readLine()!!
}

fun removeSpaces(string: String): String {
    return string.replace("\\s".toRegex(), "")
}

fun toListCommaSeparated(string: String): List<String> = string.split(",")

fun userInput(): List<String> {
    return capitalizeFirstLetter(toListCommaSeparated(removeSpaces(input())))
}

fun capitalizeFirstLetter(string: List<String>): List<String> {
    for (word in string) {
        string[0].capitalize()
    }
    return string
}

fun whiteChessInput(): List<String> {
    println("Enter White: ")
    return userInput()
}

fun blackChessInput(): List<String> {
    println("Enter Black: ")
    return userInput()
}

fun checkBothInputs(firstString: List<String>, secondString: List<String>) {
    if ((firstString == listOf("")) && ((secondString == listOf("")))) {
        println("You must enter at least one piece!")
    }
}

fun confirmInput(whiteChessInput: List<String>, blackChessInput: List<String>) {
    println("You entered: \nWhite: " + whiteChessInput.joinToString(separator = ":")
                + "\nBlack: " + blackChessInput.joinToString(separator = ":"))
}