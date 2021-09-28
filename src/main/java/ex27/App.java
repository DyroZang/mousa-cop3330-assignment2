/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex27;
import java.util.*;


public class App {

    public static String validateID(char[] empid){
        String ret = "";

        if(!Character.isLetter(empid[0]) || !Character.isLetter(empid[1])){
            ret = "The employee ID must be in the format of AA-1234.\n";
        }
        if(empid[2] != '-'){
            ret = "The employee ID must be in the format of AA-1234.\n";
        }
        for(int i = 3; i < 7; i++){
            if(!Character.isDigit(empid[i])){
                ret = "The employee ID must be in the format of AA-1234.\n";
            }
        }

        return ret;
    }

    public static String validateZip(String zip){
        String ret = "";

        for(char x : zip.toCharArray()){
            if(!Character.isDigit(x)){
                ret = "The zipcode must be a 5 digit number.\n";
            }
        }
        if(zip.length() != 5){
            ret = "The zipcode must be a 5 digit number.\n";
        }

        return ret;
    }

    public static String validateLast(String lastname){
        String ret = "";

        if(lastname.length() < 2){
            ret += "The last name must be at least 2 characters long.\n";
        }
        if(lastname == ""){
            ret += "The last name must be filled in.\n";
        }

        return ret;
    }

    public static String validateFirst(String firstname){
        String ret = "";

        if(firstname.length() < 2){
            ret += "The first name must be at least 2 characters long.\n";
        }
        if(firstname == ""){
            ret += "The first name must be filled in.\n";
        }

        return ret;
    }

    public static void validateInput(String firstname, String lastname, String zip, char[] empid){
        String first = validateFirst(firstname);
        String last = validateLast(lastname);
        String zipcode = validateZip(zip);
        String employee = validateID(empid);

        if(first == "" && last == "" && zipcode == "" && employee == ""){
            first = "There were no errors found.";
        }
        System.out.format("%s%s%s%s", first,last,employee,zipcode);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstname = input.nextLine();

        System.out.println("Enter the last name: ");
        String lastname = input.nextLine();

        System.out.println("Enter the zipcode: ");
        String zip = input.nextLine();

        System.out.println("Enter the employee ID: ");
        char[] empid = input.nextLine().toCharArray();

        validateInput(firstname, lastname, zip, empid);
    }

}
