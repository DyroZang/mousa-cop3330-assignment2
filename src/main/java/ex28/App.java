/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */
package ex28;
import java.util.*;
public class App {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            total += Integer.parseInt(input.nextLine());
        }
        System.out.format("The total is %d", total);
    }
}
