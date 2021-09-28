/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */

package ex26;
import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = Double.parseDouble(input.nextLine());

        System.out.println("What is the APR on the card(as a percent)?");
        double apr = Double.parseDouble(input.nextLine());

        System.out.println("What is the monthly payment you can make?");
        double mpay = Double.parseDouble(input.nextLine());

        double months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, mpay);
        System.out.format("It will take you %d months to pay off this card.", Math.round(months));
    }
}

class PaymentCalculator{
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double mpay){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        int months;

        double daily = apr / 365/100;

        //System.out.format("%d %f %d %f", balance, apr, mpay, daily);

        months = (int) Math.ceil(-(1.0/30.0) * Math.log(1 + (balance/mpay * (1 - Math.pow(1 + daily,30)))) / Math.log(1+daily));

        return months;
    }
}