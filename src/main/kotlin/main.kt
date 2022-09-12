fun main() {

    val board = createBoard()
    printBoard(board)
    var whiteChessInput : List<String>
    var blackChessInput : List<String>

    do {
        whiteChessInput = chessInput("White")
    } while (!validateInput(whiteChessInput))

    do {
        blackChessInput = chessInput("Black")
    } while (!validateInput(blackChessInput))


    displayInputs(whiteChessInput, blackChessInput)


    convertBoardPieces(whiteChessInput, board, 'W')
    convertBoardPieces(blackChessInput, board, 'B')

    printBoard(board)

    pieceMoveInput(board)

}