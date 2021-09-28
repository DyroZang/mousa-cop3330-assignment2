/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex34;
import java.util.*;

public class App {

    public static void printAdjNames(String name){
        ArrayList<String> names = new ArrayList<String>();

        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        names.remove("Chris Jones");

        System.out.println("There are 4 employees:");
        for(int i = 0; i < 4; i++){
            System.out.format("%s\n", names.get(i));
        }
    }

    public static void main(String[] args){
        System.out.println("There are 5 employees: \nJohn Smith\nJackie Jackson\nChris Jones\nAmanda Cullen\nJeremy Goodwin");

        Scanner input = new Scanner(System.in);

        System.out.format("Enter an employee name to remove: ");
        String name = input.nextLine();

        printAdjNames(name);
    }
}
