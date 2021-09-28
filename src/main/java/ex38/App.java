/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex38;
import java.util.*;

public class App {
    public static int[] filterEvenNumbers(int[] nums){
        String evens = "";
        for(int x : nums){
            if(x % 2 == 0){
                evens += Integer.toString(x) + " ";
            }
        }

        String[] vars = evens.split(" ");
        int[] numbers = new int[vars.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(vars[i]);
        }
        return numbers;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.format("Enter a list of numbers, separated by spaces: ");
        String[] numbers = input.nextLine().split(" ");

        int[] nums = new int[numbers.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }

        int[] newnums = filterEvenNumbers(nums);

        System.out.format("The even numbers are ");
        for(int i = 0; i < newnums.length; i++){
            System.out.format("%d ", newnums[i]);
        }
    }
}
