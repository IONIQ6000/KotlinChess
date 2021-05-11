fun pieceInput(): String {
    println("Enter piece to move (coordinates only) : ")
    return input()
}

private fun translateX(piece: String): Int {
    return convertSecondCharToNum(piece[0].toUpperCase())
}

private fun translateY(piece: String): Int {
    return piece[1].toString().toInt() - 1
}

fun checkBoard(input:String,board: Array<Array<String>>):Boolean{
    var boo = true
    if (board[translateX(input)][translateY(input)] == "emps"){
        boo = false
    }
    return boo
}

fun pieceMoveInput(board: Array<Array<String>>) :String {
    var input = pieceInput()
    while (!(checkBoard(input,board))) {
        println("Empty space!")
        input = pieceInput()
    }
    return input
}