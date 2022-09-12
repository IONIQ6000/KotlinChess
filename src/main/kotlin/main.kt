fun main() {

    val board = createBoard()
    printBoard(board)

    val whiteChessInput = chessInput("White")
    val blackChessInput = chessInput("Black")
    checkIfEmpty(whiteChessInput)

    validateInput(whiteChessInput)

    displayInputs(whiteChessInput, blackChessInput)


    convertBoardPieces(whiteChessInput, board, 'W')
    convertBoardPieces(blackChessInput, board, 'B')

    printBoard(board)

}