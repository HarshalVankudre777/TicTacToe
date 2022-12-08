
public class TicTacToe {
    static int player1pos;
    static int player2pos;
    public static void printBoard(char[][] gameboard){
        for (char[] row : gameboard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static boolean isValidMove(){

                if (player1pos<0 || player1pos>8){
                    System.out.println("False Move");
                    return false;
                } else if (player2pos<0 || player2pos>8) {
                    System.out.println("false Move");
                    return false;

                }
                return true;
            }

    public static void placePiece(char[][] gameBoard, int position, String user){
        char symbol = ' ';
        if (user.equals("player1")){
            symbol = 'x';
            player1pos = position;
        }
        else if (user.equals("player2")){
            symbol = 'o';
            player2pos = position;
        }

        switch (position){
            case 0:
                gameBoard[0][0] = symbol;
                printBoard(gameBoard);
                break;
            case 1:
                gameBoard[0][1] = symbol;
                printBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = symbol;
                printBoard(gameBoard);
                break;
            case 3:
                gameBoard[1][0] = symbol;
                printBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][1] = symbol;
                printBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = symbol;
                printBoard(gameBoard);
                break;
            case 6:
                gameBoard[2][0] = symbol;
                printBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][1] = symbol;
                printBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = symbol;
                printBoard(gameBoard);
                break;
            default:
                break;

        }

    }

    public static boolean checkWinner(char[][] gameboard) {

            // Horizontal win
            if(gameboard[0][0] == 'x'&& gameboard[0][1] == 'x' && gameboard [0][2] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[0][0] == 'o'&& gameboard[0][1] == 'o' && gameboard [0][2] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            if(gameboard[1][0] == 'x'&& gameboard[1][1] == 'x' && gameboard [1][2] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[1][0] == 'o'&& gameboard[1][1] == 'o' && gameboard [1][2] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            if(gameboard[2][0] == 'x'&& gameboard[2][1] == 'x' && gameboard [2][2] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[2][0] == 'o'&& gameboard[2][1] == 'o' && gameboard [2][2] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            // Verical win
            if(gameboard[0][0] == 'x'&& gameboard[1][0] == 'x' && gameboard [2][0] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[0][0] == 'o'&& gameboard[1][0] == 'o' && gameboard [2][0] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            if(gameboard[0][1] == 'x'&& gameboard[1][1] == 'x' && gameboard [1][2] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[0][1] == 'o'&& gameboard[1][1] == 'o' && gameboard [1][2] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            if(gameboard[0][2] == 'x'&& gameboard[1][2] == 'x' && gameboard [2][2] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[0][2] == 'o'&& gameboard[1][2] == 'o' && gameboard [2][2] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            //Diagonal wins
            if(gameboard[0][0] == 'x'&& gameboard[1][1] == 'x' && gameboard [2][2] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[0][0] == 'o'&& gameboard[1][1] == 'o' && gameboard [2][2] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            if(gameboard[2][0] == 'x'&& gameboard[1][1] == 'x' && gameboard [0][2] == 'x' ){
                System.out.println("Sieger: x");
                return true;
            }
            if(gameboard[2][0] == 'o'&& gameboard[1][1] == 'o' && gameboard [0][2] == 'o' ) {
                System.out.println("Sieger: o");
                return true;
            }
            return false;

    }

    public static void checkTie() {

    }

    public static void computerMove(){

    }
}
