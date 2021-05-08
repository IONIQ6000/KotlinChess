fun main() {

    val board = createBoard()
    printBoard(board)

    val whiteChessInput = whiteChessInput()
    val blackChessInput = blackChessInput()
    checkBothInputs(whiteChessInput, blackChessInput)
    confirmInput(whiteChessInput, blackChessInput)

    validateInput(whiteChessInput)

    convertBoardPieces(whiteChessInput, board, 'W')
    convertBoardPieces(blackChessInput, board, 'B')

    printBoard(board)

}