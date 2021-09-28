/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */
package ex37;

import java.util.*;
public class App {
    public static void genPass(int length, int spec, int nums){

        String password = "";

        ArrayList<Character> chars = new ArrayList<Character>();
        chars.add('@');
        chars.add('#');
        chars.add('!');
        chars.add('.');

        Random r = new Random();
        String alphabet = "abcdefghijklmnopqrstuvxyz";

        for(int i = 0; i < (length-spec-nums); i++){
            password += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        for(int i = 0; i < spec; i++){
            password += chars.get(r.nextInt(4));
        }
        for(int i = 0; i < nums; i++){
            password += r.nextInt(9);
        }

        System.out.format("Your password is %s", password);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length  = 0, spec = 0, nums = 0;


        do{
            System.out.format("What's the minimum length? ");
            length = Integer.parseInt(input.nextLine());
            System.out.format("How many special characters? ");
            spec = Integer.parseInt(input.nextLine());
            System.out.format("How many numbers? ");
            nums = Integer.parseInt(input.nextLine());

        }while(length < (spec+nums)*2);

        genPass(length, spec, nums);
    }
}
