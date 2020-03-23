// IsIntegerAMultiple.java
// Determine whether one integer is a multiple of the other.
import java.util.Scanner; // program uses class Scanner

public class IsIntegerAMultiple
{
	// main method begins execution of Java application
	public static void main( String args[] )
	{
		// Create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		int number1;
		int number2;
	
		System.out.print( "Enter first integer: " ); // prompt
		number1 = input.nextInt(); // read first number from user
		
		System.out.print( "Enter second integer: " ); // prompt
		number2 = input.nextInt(); // read second number from user
	
		if ( (number2 % number1) == 0 ){
			System.out.println( number1 +  " is a multiple of " + number2 );
		}

		else {
		    System.out.println( number1 +  " is not a multiple of " + number2 );
		}
	
	} // end method main
	
} // end class IsIntegerAMultiple

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
