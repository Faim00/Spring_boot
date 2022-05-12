package com.java;

import java.util.*;
public class DaysConvert
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfDays, year, month, week, days;

        System.out.print("Enter Number of Days: ");
        noOfDays = input.nextInt();

        year = noOfDays/365;
        noOfDays=noOfDays%365;

        month = noOfDays/30;
        noOfDays=noOfDays%30;

        week = noOfDays/7;
        noOfDays=noOfDays%7;


        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Week: " + week);
        System.out.println("Day: " + noOfDays);
    }
}