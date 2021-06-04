/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "What is your name?" );

        Scanner input = new Scanner(System.in);

        String name = input.next();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
