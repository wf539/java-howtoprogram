// SeparateDigits.java
// Inserts spaces between a 5-digit number.
import java.util.Scanner; // program uses class Scanner

public class SeparateDigits
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
	  
	  int number;
	  int digit1, digit2, digit3, digit4, digit5;
	  int remainder2, remainder3, remainder4, remainder5;
	  
	  System.out.print( "Enter number: " ); // prompt for number
      number = input.nextInt();

	  digit1 = number / 10000;
	  digit2 = ( number - ( digit1 * 10000 ) ) / 1000 ;
	  digit3 = ( number - ( ( digit1 * 10000 ) + ( digit2 * 1000 ) ) ) / 100;
	  digit4 = ( number - ( ( digit1 * 10000 ) + ( digit2 * 1000 ) + ( digit3 * 100 ) ) ) / 10;
	  digit5 = number - ( ( digit1 * 10000 ) + ( digit2 * 1000 ) + ( digit3 * 100 ) + ( digit4 * 10 ) ) ;
	  
	  // digit2 = 10 % digit1;

      System.out.println( digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5 ); // separate the digits

   } // end method main

} // end class SeparateDigits

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
