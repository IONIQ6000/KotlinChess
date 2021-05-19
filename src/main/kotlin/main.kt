fun main() {

    val board = createBoard()
    printBoard(board)

    val whiteChessInput = whiteChessInput()
    val blackChessInput = blackChessInput()
    checkIfEmptyInputs(whiteChessInput, blackChessInput)
    printInputs(whiteChessInput, blackChessInput)

    validateInput(whiteChessInput)
    validateInput(blackChessInput)

    convertBoardPieces(whiteChessInput, board, 'W')
    convertBoardPieces(blackChessInput, board, 'B')

    printBoard(board)

    val input = pieceMoveInput(board)
    println("Piece: $input")

}