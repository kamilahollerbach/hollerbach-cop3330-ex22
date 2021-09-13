/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kamila Hollerbach
 */

package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int z = in.nextInt();


        if( x > y && x > z)
            System.out.println(x + " is the largest number.");

        else if (y > x && y > z)
            System.out.println(y + " is the largest number.");

        else
            System.out.println(z + " is the largest number.");

    }

}



