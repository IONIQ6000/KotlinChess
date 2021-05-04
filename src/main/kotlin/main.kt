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

fun Input(): String {
    return readLine()!!
}

fun removeSpaces(string: String): String {
    return string.replace("\\s".toRegex(), "")
}

fun toArray(string: String): Array<String>{
    return string.split(",").toTypedArray()
}

fun userChessInput(): Array<String> {
    return toArray(removeSpaces(Input()))
}

fun whiteInput(): Array<String> {
    println("Enter White : ")
    return userChessInput()
}

fun blackInput(): Array<String> {
    println("Enter Black : ")
    return userChessInput()
}

fun toList(string: Array<String>): String{
    return string.joinToString(separator = ":")
}

fun whiteUserOutput() {
    if (!(whiteInput().isEmpty())) {
         + toList(whiteInput()))
    }
}

fun main() {

    val board = createBoard()
    printBoard(board)
    whiteUserOutput()
    blackUserOutput()


}


