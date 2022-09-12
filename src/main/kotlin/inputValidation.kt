fun validateInput(inputList: List<String>): Boolean {
    if (inputList == listOf("")) {
        println("You must enter at least one piece!")
        return false
    }
    return checkDirectory(inputList)
}


fun checkDirectory(input: List<String>): Boolean {
    for (piece in input) {
        if (!(checkPieceType(piece[0].toUpperCase()) &&
                    checkX(piece[1].toLowerCase()) && checkY(piece[2])
                    )
        ) {
            println("Inputs are not valid!")
            return false
        }
    }
    return true
}


private fun pieceList(): List<Char> {
    return listOf('P', 'R', 'B', 'Q', 'N', 'K')
}

private fun xList(): List<Char> {
    return listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
}

private fun yList(): List<Char> {
    return listOf('1', '2', '3', '4', '5', '6', '7', '8')
}

private fun checkPieceType(pieceType: Char): Boolean {
    return checkCharDir(pieceType, pieceList())
}

private fun checkX(X: Char): Boolean {
    return checkCharDir(X, xList())
}

private fun checkY(Y: Char): Boolean {
    return checkCharDir(Y, yList())
}

private fun checkCharDir(pieceType: Char, library: List<Char>): Boolean {
    for (piece in library)
        if (pieceType == piece) {
            return true
        }
    return false
}