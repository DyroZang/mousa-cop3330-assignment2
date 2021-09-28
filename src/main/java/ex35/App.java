/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */
package ex35;

import java.util.*;

public class App {

    public static int pickWinner(int max){
        return (int) Math.floor(Math.random()*max);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        ArrayList<String> names = new ArrayList<String>();

        do{
            try {
                System.out.format("Enter a name: ");
                String name = input.nextLine();
                if (name == "") {
                    throw new Exception();
                }
                names.add(name);
                count++;
            }catch(Exception e){
                break;
            }
        }while(true);

        System.out.format("The winner is... %s", names.get(pickWinner(count)));
    }

}
