fun rows(): Int {
    return 8
}

fun cols(): Int {
    return 8
}

fun createBoard(): Array<IntArray> {
    return Array(rows()) { IntArray(cols()) }
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
    return toListCommaSeparated(removeSpaces(input()))
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

fun main() {

    val board = createBoard()
    printBoard(board)

    val whiteChessInput = whiteChessInput()
    val blackChessInput = blackChessInput()
    checkBothInputs(whiteChessInput, blackChessInput)
    println("You entered: \nWhite: $whiteChessInput\nBlack: $blackChessInput")

}







