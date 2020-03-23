// SumAvProdMinMaxThreeInt.java
// Compare three integers using if statements, relational operators 
// and equality operators.
import java.util.Scanner; // program uses class Scanner

public class SumAvProdMinMaxThreeInt
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int number1; // first number to manipulate/compare
      int number2; // second number to manipulate/compare
      int number3; // third number to manipulate/compare

      System.out.print( "Enter first integer: " ); // prompt 
      number1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = input.nextInt(); // read second number from user 
      
      System.out.print( "Enter third integer: " ); // prompt 
      number3 = input.nextInt(); // read third number from user

      System.out.printf( "%s %d\n", "The sum of the integers are: ", number1 + number2 + number3 );
      System.out.printf( "%s %d\n", "The mean of the integers are: ", (number1 + number2 + number3)/3 ) ;
      System.out.printf( "%s %d\n", "The product of the integers are: ", number1 * number2 * number3 ) ;

      if (( number1 < number2 ) && ( number1 < number3 )){
				   System.out.printf( "%s %d\n", "The smallest number is: ", number1 );
	  }

      else if (( number2 < number1 ) && ( number2 < number3 )){
				   System.out.printf( "%s %d\n", "The smallest number is: ", number2 );
	  }

      else {
	  System.out.printf( "%s %d\n", "The smallest number is: ", number3 );
      }

      if (( number1 > number2 ) && ( number1 > number3 )){
				   System.out.printf( "%s %d\n", "The largest number is: ", number1 );
	  }

      else if (( number2 > number1 ) && ( number2 > number3 )){
				   System.out.printf( "%d %d\n", "The largest number is: ", number2 );
	  }

      else {
	  System.out.printf( "%s %d\n", "The largest number is: ", number3 );
      }

   } // end method main

} // end class SumAvProdMinMaxThreeInt

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
