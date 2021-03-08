package ticTacTie;
import java.util.Arrays;
import java.util.Scanner;

public class KrestikiNoliki {
    public static void krestikiNoliki() {
        char[][] field = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        Scanner stepScanner = new Scanner(System.in);
        char player = 'X';
        printField(field);

        System.out.println("X begins. Start the game");

        for(int i =0; i < field.length; i++){
            for (int a = 0; a< field[i].length; a++){
                System.out.println( player +" Make your selection");
                System.out.println("enter row number");
                int row = stepScanner.nextInt()-1;
                if(row >2 || row < 0 ){
                    System.out.println(" Wrong value");
                    a--;
                    continue;
                }
                System.out.println("enter column number");
                int column = stepScanner.nextInt()-1;
                if(column > 2 || column < 0){
                    System.out.println(" Wrong value");
                    a--;
                    continue;
                }
                if (field[row][column] != ' '){
                    System.out.println(" Impossible move. Try again!");
                    a--;
                    continue;
                }


                field[row][column] = player;
                printField(field);


                if (field[row][0] == player && field[row][1] == player && field[row][2] == player ){
                    System.out.println("Victory " +  player + " Won");
                    return;
                }
                if(field[0][column] == player && field[1][column] == player && field[2][column]==player){
                    System.out.println("Victory " +  player + " Won");
                    return;
                }
                if (field[0][0] == player && field[1][1] == player && field[2][2] == player){
                    System.out.println("Victory " +  player + " Won");
                    return;
                }
                if (field[0][2] == player && field[1][1] == player && field[2][0] == player){
                    System.out.println("Victory " +  player + " Won");
                    return;
                }
                player = player == 'X' ? 'O' : 'X';
            }
        }
        System.out.println(" Spare");


    }

    public static void printField(char[][] positionsInput) {
        System.out.println();
        for (int i = 0; i < positionsInput.length; i++) {
            System.out.println( (i+1) + Arrays.toString(positionsInput[i]));
            System.out.println(" " + " - - - - ");
        }
        System.out.println("  " +  "1" + "  " + "2" + "  " + "3" + "  ");


    }
}
