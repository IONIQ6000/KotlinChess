fun main() {

    val board = createBoard()
    printBoard(board)

    val whiteChessInput = whiteChessInput()
    val blackChessInput = blackChessInput()
    checkBothInputs(whiteChessInput, blackChessInput)
    confirmInput(whiteChessInput, blackChessInput)

}