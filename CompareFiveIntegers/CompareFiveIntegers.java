// CompareFiveIntegers.java
// Compare five integers using if statements.
// Print the smallest ant the largest integers
import java.util.Scanner; // program uses class Scanner

public class CompareFiveIntegers
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int number1; // first number to compare
      int number2; // second number to compare
      int number3; // third number to compare
      int number4; // fourth number to compare
      int number5; // fifth number to compare

      System.out.print( "Enter first integer: " ); // prompt 
      number1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = input.nextInt(); // read second number from user 
      
      System.out.print( "Enter third integer: " ); // prompt 
      number3 = input.nextInt(); // read third number from user

      System.out.print( "Enter fourth integer: " ); // prompt 
      number4 = input.nextInt(); // read fourth number from user 
      
      System.out.print( "Enter fifth integer: " ); // prompt 
      number5 = input.nextInt(); // read fifth number from user

      if (( number1 > number2 ) && ( number1 > number3 ) && ( number1 > number4 ) && ( number1 > number5 )){
				   System.out.printf( "%s %d\n", "The largest number is: ", number1 );
	  }

      else if (( number2 > number1 ) && ( number2 > number3 ) && ( number2 > number4 ) && ( number2 > number5 )){
				   System.out.printf( "%s %d\n", "The largest number is: ", number2 );
	  }

      else if (( number3 > number1 ) && ( number3 > number2 ) && ( number3 > number4 ) && ( number3 > number5 )){
				   System.out.printf( "%s %d\n", "The largest number is: ", number3 );
	  }

      else if (( number4 > number1 ) && ( number4 > number2 ) && ( number4 > number3 ) && ( number4 > number5 )){
				   System.out.printf( "%s %d\n", "The largest number is: ", number4 );
	  }

      else {
	  System.out.printf( "%s %d\n", "The largest number is:", number5 );
      }

      if (( number1 < number2 ) && ( number1 < number3 ) && ( number1 < number4 ) && ( number1 < number5 )){
				   System.out.printf( "%s %d\n", "The smallest number is: ", number1 );
	  }

      else if (( number2 < number1 ) && ( number2 < number3 ) && ( number2 < number4 ) && ( number2 < number5 )){
				   System.out.printf( "%s %d\n", "The smallest number is: ", number2 );
	  }

      else if (( number3 < number1 ) && ( number3 < number2 ) && ( number3 < number4 ) && ( number3 < number5 )){
				   System.out.printf( "%s %d\n", "The smallest number is: ", number3 );
	  }

      else if (( number4 < number1 ) && ( number4 < number2 ) && ( number4 < number3 ) && ( number4 < number5 )){
				   System.out.printf( "%s %d\n", "The smallest number is: ", number4 );
	  }

      else {
	  System.out.printf( "%s %d\n", "The smallest number is:", number5 );
      }

   } // end method main

} // end class CompareFiveIntegers

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
