package com.arc.randprob;

//A small Dice game have been demonstrated below in which a 6-mark
// Dice is thrown by 2 players, person securing 30 points 1st, wins.

import java.util.Random;

/**
 * @author Anuran RC
 */
public class DiceGame2players {
    static Random ran = new Random();

    static public class Player{
        private int sum;
        //private int count;
        public Player(int sum){
            this.sum = sum;
            //this.count = count;
        }
    }

    public static void main(String[] args) {
        simulateDiceGame();
    }


    private static void simulateDiceGame(){
        Player player1 = new Player(0 );
        Player player2 = new Player(0);

        int turn = 0;
        int flag;

        while (true) {
            if (turn % 2 == 0) {

                int p1 = ran.nextInt(6)+1;
                player1.sum += p1;
                System.out.printf("Player 1 after turn %d is : %d\n", turn, player1.sum);
            }
            else {

                int p2 = ran.nextInt(6)+1;
                player2.sum += p2;
                System.out.printf("Player 2 after turn %d is : %d\n", turn, player2.sum);
            }
            if (player1.sum >= 30) {
                flag = 1;
                break;
            }
            if (player2.sum >= 30) {
                flag = 2;
                break;
            }
            turn++;
        }
        if (flag == 1)
            System.out.println("\nPlayer 1 WON!!");
        else
            System.out.println("\nPlayer 2 WON!!");

    }
}


