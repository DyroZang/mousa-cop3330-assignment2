/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex24;
import java.util.Scanner;
import java.util.*;

public class App {

    public static void isAnagram(String first, String second){

        if(first.length() == second.length()){
            char[] cfirst = first.toCharArray();
            char[] csecond = second.toCharArray();

            Arrays.sort(cfirst);
            Arrays.sort(csecond);
            for(int i = 0; i < cfirst.length; i++){
                if(cfirst[i] != csecond[i]){
                    System.out.format("\"%s\" and \"%s\" are not anagrams", first, second);
                }
            }
            System.out.format("\"%s\" and \"%s\" are anagrams", first, second);
        }
        else{
            System.out.format("\"%s\" and \"%s\" are not anagrams", first, second);
        }


    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        String first = input.nextLine();
        System.out.println("Enter the second string: ");
        String second = input.nextLine();

        isAnagram(first, second);
    }
}
