/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    static final double TAX_RATE = 0.055;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "Enter the price of item 1: " );
        double price1 = Integer.parseInt( scan.nextLine() );
        System.out.print( "Enter the quantity of item 1: " );
        int quantity1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Enter the price of item 2: " );
        double price2 = Integer.parseInt( scan.nextLine() );
        System.out.print( "Enter the quantity of item 2: " );
        int quantity2 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Enter the price of item 3: " );
        double price3 = Integer.parseInt( scan.nextLine() );
        System.out.print( "Enter the quantity of item 3: " );
        int quantity3 = Integer.parseInt( scan.nextLine() );

        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println( "Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println( "Tax: $" + String.format("%.2f", tax));
        System.out.println( "Total: $" + String.format("%.2f", total));
    }
}
