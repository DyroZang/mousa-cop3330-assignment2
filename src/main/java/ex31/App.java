/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */


package ex31;
import java.util.*;

//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

public class App {

    public static void printHR(double restingHR, double age){
        System.out.format("Resting Pulse: %d \t Age: %d\n", (int)restingHR, (int)age);

        System.out.format("Intensity    | Rate\n-------------|-----\n");
        for(double intensity = 55; intensity < 100; intensity += 5){
            String inten = String.valueOf(intensity) + "%";
            int bpm = (int)Math.round((((220.0 - age) - restingHR) * (intensity/100.0)) +restingHR);
            System.out.format("%-12s | %-3d bpm\n",inten,bpm );
        }


    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double restingHR;
        double age;


        do {
            try {
                System.out.println("Enter your resting pulse: ");
                restingHR = Double.parseDouble(input.nextLine());

                System.out.println("Please enter your age: ");
                age = Double.parseDouble(input.nextLine());
                break;
            }catch(Exception e){

            }


        } while(true);

        printHR(restingHR, age);
    }
}
