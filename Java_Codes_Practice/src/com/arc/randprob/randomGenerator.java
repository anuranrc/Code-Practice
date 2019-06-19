package com.arc.randprob;

import java.util.Random;

/**
 * @author Anuran RC
 */
public class randomGenerator {
    static Random rand = new Random();

    public static void main(String[] args) {
        randomGen();
    }


    private static void randomGen(){

        System.out.println("Using Random object:" + "\n");

        for(int i=0; i< 5; i++){
            int randInt = rand.nextInt();
            System.out.println(randInt);
        }

        System.out.println("Using Math.random method:" +"\n");
        //this generates random number between 0.0 to 1.0
        for(int i=0; i< 5; i++){
            double randInt = Math.random();
            System.out.println(+randInt);
        }


        System.out.println("Using Math.random method to generate random Integer in a range:" +"\n");
        //this generates random number integer
        for(int i=0; i< 5; i++){
            int randInt = (int)(Math.random()*7+11);
            System.out.println(+randInt);
        }

        // Generates random integer
        System.out.println("Using Random object to generate random Integer in a range:" +"\n");
        for(int i=0; i< 5; i++){
            int randInt = rand.nextInt(9)+11;
            System.out.println(+randInt);
        }

    }





}
