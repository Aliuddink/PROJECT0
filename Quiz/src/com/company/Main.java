package com.company;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
{
    double InputNumber;
    double number2;
    double number3;
    double number4;
    double number5;


    Scanner keyboard = new Scanner(System.in);
    System.out.print("enter a number");
    InputNumber = keyboard.nextDouble();  // scanner

    if ((InputNumber % 7) < 1)       // if the number is divisible by 5 the modulus would be
        { number2 = 1;}             //0 and a value of one will be assigned to the operation
    else
        {number2 = 0;}

    if ((InputNumber % 5) < 1)       // if the number is divisible by 5 the modulus would be
        { number3 = 1;}             //0 and a value of one will be assigned to the operation
    else
        {number3 = 0;}

    if ((InputNumber % 3) < 1)      // if the number is divisible by 3 the modulus would be
        {number4 = 1;}             //0 and a value of one will be assigned to the operation
    else
        {number4 = 0;}

    number5 = (number2 + number3 + number4 );       // the number of correct divisibility determines the
    {                                               //word that will be used so adding the values assigned
        if (number5 == 0)  {System.out.print("plort");}     //in the operations of the if else statements
        if (number5 == 1)  {System.out.print("snizz");}     //will determine the # of correct divisibles
        if (number5 == 2)  {System.out.print("brang");}
        if (number5 == 3)  {System.out.print("zing");}
    }
}
}