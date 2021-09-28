/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex25;
import java.util.Scanner;
import java.util.*;

public class App {

    public static int passwordValidator(String password){

        int val = 0; //estimatable value
        Boolean[] vals = new Boolean[4]; //0 is numbers, 1 is letters, 2 is special chars, 3 is > 7
        Arrays.fill(vals, Boolean.FALSE);

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                vals[0] = true;
            }
            if(Character.isLetter(c)){
                vals[1] = true;
            }
            if(!Character.isLetterOrDigit(c)){
                vals[2] = true;
            }
        }
        if(password.length() > 7){
            vals[3] = true;
        }

        for(boolean x : vals){
            if(x){
                val++;
            }
        }
        if(val == 1 && Character.isLetter(password.charAt(0))){
            val = 2;
        }

        return val;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        int val = passwordValidator(password);
        String[] codes = {"very weak", "weak", "strong", "very strong"};
        System.out.format("The password \'%s\' is a %s password",password, codes[val-1]);

    }
}
