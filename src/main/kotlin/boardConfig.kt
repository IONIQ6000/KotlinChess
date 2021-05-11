fun createBoard(): Array<Array<String>> {
    return Array(8) { Array(8) { "emps" } }
}

fun printBoard(board: Array<Array<String>>) {
    println()
    board.forEach { spaces ->
        spaces.forEach { print("$it ") }
        println()
    }
    println()
}

fun charMap(): Map<Char, Int> {
    return mapOf('A' to 0, 'B' to 1, 'C' to 2, 'D' to 3, 'E' to 4, 'F' to 5, 'G' to 6, 'H' to 7)
}

fun convertSecondCharToNum(char: Char): Int {
    return charMap().getValue(char)
}

private fun translateX(piece: String): Int {
    return convertSecondCharToNum(piece[1].toUpperCase())
}

private fun translateY(piece: String): Int {
    return piece[2].toString().toInt() - 1
}

fun String.addCharAtIndex(char: Char, index: Int) =
    StringBuilder(this).apply { insert(index, char) }.toString()

fun insertPieceType(piece: String, char: Char): String {
    return piece.addCharAtIndex(char, 1)
}

fun convertBoardPieces(ChessInput: List<String>, board: Array<Array<String>>, pieceType: Char): Array<Array<String>> {
    if (ChessInput != listOf("")) {
        for (piece in ChessInput) {
            board[translateX(piece)][translateY(piece)] = insertPieceType(piece, pieceType)
        }
    }
    return board
}