package com.company;

import java.util.Scanner;            // Aliuddin Khaja

public class Test
{
               public static void main (String[] args)    {

                      Scanner keyboard = new Scanner(System.in);
                       System.out.print("enter a number ");

                       double guess=0;
//                       double i=0;
//                       guess=i+0;
                    do
                    {
                      if (guess>99) {               //will print prompt bellow as long as guess is > 100
                            System.out.print(" follow the rules you idiot and pick a number between 1 and 100");
                   return;
                    }
                      else {                  // will do this as long as the value of guess is below 100
                      guess++;
                      System.out.print("Is your number" + guess + "?");                   
                      System.out.print(" respond with a '0' if guess is correct, '" +     
                              "-1' if guess is too big , and'1' if guess is too low");
                      }
                    }while( keyboard.nextDouble() > 0);

                    System.out.print("I guessed you number right next time pick something harder to guess");



}}
