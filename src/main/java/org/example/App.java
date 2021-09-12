/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal=input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double interestInput=input.nextDouble();
        System.out.print("Enter the number of years: ");
        double years=input.nextDouble();

        double interest=interestInput/100;
        double total=principal*(1+interest*years);

        System.out.printf("After %.0f years at %.01f%%, the investment will be worth $%.0f",years,interestInput,total);

    }
}
