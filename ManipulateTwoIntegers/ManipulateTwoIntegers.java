// ManipulateTwoIntegers.java
// Addition program that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner

public class ManipulateTwoIntegers
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2
      int product; // product of two integers
      int difference; // difference of two integers
      int quotient; // quotient of two integers

      System.out.print( "Enter first integer: " ); // prompt 
      number1 = input.nextInt(); // read first number from user

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = input.nextInt(); // read second number from user

      sum = number1 + number2; // add numbers
      product = number1 * number2; // multiply numbers
      difference = number1 - number2; // subtract numbers
      quotient = number1 / number2; // divide numbers

      System.out.printf( "Sum is %d\n", sum ); // display sum
      System.out.printf( "Product is %d\n", product ); // display product
      System.out.printf( "Difference is %d\n", difference ); // display difference
      System.out.printf( "Quotient is %d\n", quotient ); // display quotient

   } // end method main

} // end class ManipulateTwoIntegers

/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
