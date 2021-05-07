fun charMap(): Map<Char, Int> {
    return mapOf('A' to 0, 'B' to 1, 'C' to 2, 'D' to 3, 'E' to 4, 'F' to 5, 'G' to 6, 'H' to 7)
}

fun convertSecondCharToNum(char: Char): Int {
    return charMap().getValue(char)
}

fun translateX(piece: String): Int {
    return convertSecondCharToNum(piece[1].toUpperCase())
}

fun translateY(piece: String): Int {
    return piece[2].toString().toInt() - 1
}

fun String.addCharAtIndex(char: Char, index: Int) =
    StringBuilder(this).apply { insert(index, char) }.toString()

fun insertPieceType(piece: String, char: Char): String {
    return piece.addCharAtIndex(char, 1)
}

fun convertBoardPieces(ChessInput: List<String>, board: Array<Array<String>>, pieceType: Char): Array<Array<String>> {
    var boardX: Int
    var boardY: Int
    for (piece in ChessInput) {
        boardX = translateX(piece)
        boardY = translateY(piece)
        board[boardX][boardY] = insertPieceType(piece, pieceType)

    }
    return board
}