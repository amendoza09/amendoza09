//Name: Antonio Mendoza
//PantehrID: 002-54-0550
//Due Date: June 29
//================================
import java.util.*;
public class TicTac {
    //method to draw the tic tac toe board
    public static void board(char [][] a) {
        for (int col = 0; col < 3; col++){
            System.out.println("-------------");
            for (int row = 0; row < 3; row++) {
                System.out.print(": " + a[col][row] + " ");
            }
            System.out.println(":");
        }
        System.out.println("-------------");
    }

    public static void main (String [] args) {
        //initiates scanner
        Scanner scan = new Scanner(System.in);
        //gives each spot in the array a value
        char [][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };


        System.out.println("Welcome to play TicTacToe game! We have the following 3x3 empty board.");
        //initiates variables used throughout the program
        int round = 0; int player = 1; int moves = 9;
        char x = 'x'; char o = 'o';

        board(board);
        //starts the game and ends once there is a winner or a draw
        while (round < 1) {
            //lets player make a move
            if (player == 1) {
                System.out.print("Enter the row index: ");
                int oneR = scan.nextInt();
                System.out.print("Enter the column index: ");
                int oneC = scan.nextInt();
                board[oneR][oneC] = x;
                board(board);
                player = 2;
                moves--;
            }
            //lets player 2 make a move
            else if (player == 2) {
                System.out.print("Enter the row index: ");
                int oneR = scan.nextInt();
                System.out.print("Enter the column index: ");
                int oneC = scan.nextInt();
                board[oneR][oneC] = o;
                board(board);
                player = 1;
                moves--;
            }
            //checks for a winner through vertical lines
            for(int row = 0; row < 3; row++) {
                if (board[row][0] == x && board[row][1] == x && board[row][2] == x) {
                    System.out.print("Player 1 wins! Congrats!");
                    round++;
                }
                else if (board[row][0] == o && board[row][1] == o && board[row][2] == o) {
                    System.out.print("Player 2 wins! Congrats!");
                    round++;
                }
            }
            //checks for a winner through horizontal line
            for(int col = 0; col < 3; col++) {
                if (board[0][col] == x && board[1][col] == x && board[2][col] == x) {
                    System.out.print("Player 1 wins! Congrats!");
                    round++;
                }
                else if (board[0][col] == o && board[1][col] == o && board[2][col] == o) {
                    System.out.print("Player 2 wins! Congrats!");
                    round++;
                }
            }
            //checks for a winner through diagnals
            if(board[0][0] == x && board[1][1] == x && board[2][2] == x) {
                System.out.print("Player 1 wins! Congrats!");
                round++;
            }
            else if(board[0][0] == o && board[1][1] == o && board[2][2] == o) {
                System.out.print("Player 2 wins! Congrats!");
                round++;
            }
            else if (board[0][2] == x && board[1][1] == x && board[2][0] == x) {
                System.out.print("Player 1 wins! Congrats!");
                round++;
            }
            else if (board[0][2] == o && board[1][1] == o && board[2][0] == o) {
                System.out.print("Player 2 wins! Congrats!");
                round++;
            }
            //if there are no more moves left the game ends in a draw
            else if(moves == 0) {
                System.out.print("Draw!");
                round++;
            }
        }
    }
}
