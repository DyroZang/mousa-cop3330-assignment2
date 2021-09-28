
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */
package ex32;
import java.util.*;


public class App {

    public static int genNum(int diff){
        int num = 0;

        if(diff ==1){
            num = (int)Math.floor(Math.random() *(10-1+1)+1);
        }
        else if(diff == 2){
            num = (int) Math.floor(Math.random()*(100)+1);
        }
        else{
            num = (int) Math.floor(Math.random()*1001);
        }

        return num;
    }

    public static void runGame(){
        Scanner input = new Scanner(System.in);
        int diff = 0;

        do{
            try{
                System.out.println("Enter the difficulty level (1,2, or 3): ");
                diff = Integer.parseInt(input.nextLine());
            }catch(Exception e){

            }
        }while(diff == 0);


        int num = genNum(diff);
        int guessNum = 0;
        int guessCount = 0;

        System.out.println("I have my number. What's your guess?");

        while(guessNum != num){
            guessCount++;
            guessNum = Integer.parseInt(input.nextLine());

            if(guessNum > num){
                System.out.println("Too high.");
            }else if (guessNum < num){
                System.out.println("Too low.");
            }else{
                System.out.format("You got it in %d guesses!\n", guessCount);
            }
        }


    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String play_again = "n";


        do{
            System.out.println("Let play Guess the Number!");
            runGame();
            System.out.println("Do you want to play again?(y/n) ");
            play_again = input.nextLine();
        }while(play_again.equalsIgnoreCase("y"));
    }
}
