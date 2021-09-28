/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex29;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean con = true;
        int rate = 0;
        while(con){
            try{
                System.out.println("What is the rate of return?");
                rate = Integer.parseInt(input.nextLine());
                if(rate == 0){
                    throw new Exception("");
                }
                con = false;
            } catch(Exception e) {
                System.out.println("Sorry that's not a valid input.");
            }
        }

        System.out.format("It will take %d years to double your initial investment.", (int)72/rate);

    }
}