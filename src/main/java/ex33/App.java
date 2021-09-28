/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex33;
import java.util.*;

public class App {

    public static String response(){
        int num = (int) Math.floor(Math.random() * 4);

        ArrayList<String> responses = new ArrayList<String>();
        responses.add("Yes");
        responses.add("No");
        responses.add("Ask again later.");
        responses.add("Maybe.");
        return responses.get(num);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.format("What's your question?\n>");
        String something = input.nextLine();

        System.out.format("%s", response());

    }
}
