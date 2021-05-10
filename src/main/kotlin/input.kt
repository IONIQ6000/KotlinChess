import kotlin.system.exitProcess

fun createBoard(): Array<Array<String>> {
    return Array(8) { Array(8) { "emps" } }
}

fun printBoard(board: Array<Array<String>>) {
    board.forEach { spaces ->
        spaces.forEach { print("$it ") }
        println()
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
    val wordList: MutableList<String> = mutableListOf()
    for (word in string) {
        wordList.add(word.capitalize())
    }
    return wordList
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
        exitProcess(1)
    }
}

fun confirmInput(whiteChessInput: List<String>, blackChessInput: List<String>) {
    println(
        "You entered: \nWhite: " + whiteChessInput.joinToString(separator = ":")
                + "\nBlack: " + blackChessInput.joinToString(separator = ":")
    )
}

