fun pieceMoveInput(board: Array<Array<String>>): String {
    var input : String
    do {
        input = pieceInput()
    } while (!checkFlags(input, board))
    return input
}

private fun translateX(piece: String): Int {
    return convertSecondCharToNum(piece[0].toUpperCase())
}

private fun translateY(piece: String): Int {
    return piece[1].toString().toInt() - 1
}

private fun checkLength(piece: String): Boolean {
    return (piece.length == 2)
}

private fun checkBoard(input: String, board: Array<Array<String>>): Boolean {
    return (board[translateX(input)][translateY(input)] == "emps")
}

private fun checkStrings(
    input: String,
    board: Array<Array<String>>
): Boolean {
    return ((checkX(input[0].toLowerCase()) && checkY(input[1]) && (checkBoard(
        input,
        board
    )))
            )
}

private fun checkStringsFlags(input: String, board: Array<Array<String>>): Boolean {
    if (input[0].isLetter() && input[1].isDigit()) {
        return checkStrings(input, board)
    }
    return false
}

private fun checkFlags(input: String, board: Array<Array<String>>): Boolean {
    if (checkLength(input)) {
        if(!checkStringsFlags(input, board))
            return true
    }
    println("Invalid Input!")
    return false
}

private fun pieceInput(): String {
    println("Enter piece to move (coordinates only) : ")
    return input()
}


