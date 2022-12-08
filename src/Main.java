import java.util.Scanner;

public class Main {
   
    static  char[][] gameBoard = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}};
    public static void main(String[] args) {
        TicTacToe.printBoard(gameBoard);
        int i = 1;
while (true){
    Scanner scan = new Scanner(System.in);
    System.out.println(i + ". zug: " + "x");
    TicTacToe.player1pos = scan.nextInt();
    TicTacToe.isValidMove();
    TicTacToe.placePiece(gameBoard, TicTacToe.player1pos, "player1");
    if (TicTacToe.checkWinner(gameBoard)) break;
    i++;


    System.out.println(i + ". Zug: " + "o");
     TicTacToe.player2pos = scan.nextInt();
     System.out.println(TicTacToe.player2pos);
     TicTacToe.isValidMove();
    TicTacToe.placePiece(gameBoard, TicTacToe.player2pos, "player2");
    if (TicTacToe.checkWinner(gameBoard)) break;

}

    }
}