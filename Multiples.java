//********************************************************************
//  Multiples.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a for loop.
//********************************************************************

import java.util.Scanner;

public class Multiples
{
   //-----------------------------------------------------------------
   //  Prints multiples of a user-specified number up to a user-
   //  specified limit.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
     
      int value, limit, mult;

      Scanner scan = new Scanner (System.in);

      System.out.print ("Enter a positive value: ");
      value = scan.nextInt();

      System.out.print ("Enter an upper limit: ");
      limit = scan.nextInt();

      System.out.println ();
      System.out.println ("The multiples of " + value + " between " +
                       value + " and " + limit + " (inclusive) are:");

      for (mult = value; mult <= limit; mult += value)
      {
         System.out.print (mult + "\t");

      }
   }
}
