
import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissors_GAME {
    public static void main(String[] args) {

        System.out.println("STONE PAPER SCISSOR GAME .....");
        System.out.println("---------------------------------------------");
        System.out.println("|         STONE       |         1           |");
        System.out.println("---------------------------------------------");
        System.out.println("|         PAPER       |         2           |");
        System.out.println("---------------------------------------------");
        System.out.println("|      SCISSOR        |         3           |");
        System.out.println("---------------------------------------------");

        int round = 1;
        int youwin = 0;
        int compwin = 0;

        while (round<6){
            Scanner Sc = new Scanner (System.in);
            System.out.println("ROUND "+round);
            System.out.print("ENTER YOUR CHOICE : ");
            int you = Sc.nextInt();

            Random Ran = new Random();
            int comp =Ran.nextInt(1,4);

            switch (you) {
                case 1:
                    System.out.println("YOU CHOICE STONE .... ");
                    break;
                case 2:
                    System.out.println("YOU CHOICE PAPER .... ");
                    break;
                case 3:
                    System.out.println("YOU CHOICE SCISSOR .... ");
                    break;
                default:
                    System.out.println("INVALID CHOICE !!!! ");

            }
            switch (comp) {
                case 1 :
                    System.out.println("COMPUTER CHOICE STONE .... ");
                    break;
                case 2 :
                    System.out.println("COMPUTER CHOICE PAPER .... ");
                    break;
                case 3 :
                    System.out.println("COMPUTER CHOICE SCISSOR .... ");
                    break;
                default:
                    System.out.println("INVALID CHOICE !!!! ");
            }


//                if (you == 1 && comp == 1) {
//                    System.out.println("THE GAME IS DRAW .... ");
//                } else if (you == 2 && comp == 2) {
//                    System.out.println("THE GAME IS DRAW .... ");
//                } else if (you == 3 && comp == 3) {
//                    System.out.println("THE GAME IS DRAW .... ");
//                } else if (you == 1 && comp == 2) {
//                    System.out.println("COMPUTER WON .... ");
//                } else if (you == 2 && comp == 3) {
//                    System.out.println("COMPUTER WON .... ");
//                } else if (you == 3 && comp == 1) {
//                    System.out.println(" COMPUTER WON .... ");
//                } else if (you == 2 && comp == 1) {
//                    System.out.println("YOU WON .... ");
//                } else if (you == 3 && comp == 2) {
//                    System.out.println("YOU WON .... ");
//                } else if (you == 1 && comp == 3) {
//                    System.out.println("YOU WON .... ");
//                } else {
//                    System.out.println(" INVALID CHOICE !!!! ");
//                }
           if (you == 1 && comp == 1 || you == 2 && comp == 2 ||you == 3 && comp == 3 ){
               System.out.println("IT'S A DRAW ....");
               System.out.println("-----------------------------");
               System.out.println("|        SCORE BOARD        |");
               System.out.println("-----------------------------");
               System.out.println("|     YOU     |   COMPUTER  |");
               System.out.println("-----------------------------");
               System.out.printf("|     %d       |     %d       |\n",youwin,compwin);
               System.out.println("-----------------------------");
           }
           else if (you == 1 && comp == 2 || you == 2 && comp == 3 ||you == 3 && comp == 1 ){
               System.out.println("COMPUTER WIN ....");
               compwin += 1;
               System.out.println("-----------------------------");
               System.out.println("|        SCORE BOARD        |");
               System.out.println("-----------------------------");
               System.out.println("|     YOU     |   COMPUTER  |");
               System.out.println("-----------------------------");
               System.out.printf("|     %d       |     %d       |\n",youwin,compwin);
               System.out.println("-----------------------------");
           }
           else if (you == 2 && comp == 1 || you == 3 && comp == 2 ||you == 1 && comp == 3 ){
               System.out.println("YOU WIN ....");
               youwin += 1;
               System.out.println("-----------------------------");
               System.out.println("|        SCORE BOARD        |");
               System.out.println("-----------------------------");
               System.out.println("|     YOU     |   COMPUTER  |");
               System.out.println("-----------------------------");
               System.out.printf("|     %d       |     %d       |\n",youwin,compwin);
               System.out.println("-----------------------------");
           }

                round++;
        }

        if (youwin == compwin){
            System.out.println("IT'S A DRAW ....");
        }
        else if (youwin > compwin) {
            System.out.println("YOU WINS THE GAME ....");
        }
        else if (youwin < compwin) {
            System.out.println("COMPUTER WINS THE GAME ....");
        }

        System.out.println("-----------------------------");
        System.out.println("|     FINAL SCORE BOARD     |");
        System.out.println("-----------------------------");
        System.out.println("|     YOU     |   COMPUTER  |");
        System.out.println("-----------------------------");
        System.out.printf("|     %d       |     %d       |\n",youwin,compwin);
        System.out.println("-----------------------------");

    }
}
