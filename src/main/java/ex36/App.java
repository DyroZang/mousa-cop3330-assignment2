/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex36;

import java.util.*;

public class App {

    public static void average(ArrayList<Double> nums){
        double total = 0;
        double count = 0;

        for(double x : nums){
            total += x;
            count++;
        }

        System.out.format("The average is %.1f\n", total/count);
    }

    public static void max(ArrayList<Double> nums){
        double highest = Double.MIN_VALUE;
        for(double x: nums){
            highest = Math.max((int)x, (int)highest);
        }
        System.out.format("The maximum is %d\n", (int) highest);
    }

    public static void min(ArrayList<Double>nums){
        double lowest = Double.MAX_VALUE;

        for(double x : nums){
            lowest = Math.min((int)x, (int)lowest);
        }
        System.out.format("The minimum is %d\n", (int)lowest);
    }

    public static void std(ArrayList<Double>nums){
        double total = 0.0, stan = 0.0;
        int count = 0;

        for(double x : nums){
            count++;
            total += x;
        }

        double mean = total / count;

        for(double x :nums){
            stan += Math.pow(x-mean, 2);
        }

        System.out.format("The standard deviation is %.2f\n", Math.sqrt(stan/count));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean thing = true;
        ArrayList<Double> nums = new ArrayList<Double>();

        do{
            try{
                System.out.format("Enter a number: ");
                String temp = input.nextLine();

                if(temp.equals("done")){

                    thing = false;
                }
                nums.add(Double.parseDouble(temp));
            }catch(Exception e){

            }
        }while(thing);

        System.out.format("Numbers: ");
        for(double x : nums){
            System.out.format("%d ", (int) x);
        }
        System.out.format("\n");
        average(nums);
        min(nums);
        max(nums);
        std(nums);
    }

}
