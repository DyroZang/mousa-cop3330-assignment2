/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex30;
import java.util.*;

public class App {
    public static void main(String[] args) {

        for(int i = 1; i < 13; i++){
            for(int x = 1; x < 13; x++){
                System.out.format("%,5d", x*i);
            }
            System.out.println("");
        }

    }
}