// Fig 2.15: Comparison.java
// Compare integers using if statements, relational operators
// and equality operators.
import java.util.Scanner; // program uses class Scanner

public class Comparison
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
	
		if ( number1 == number2 )
			System.out.printf( "%d == %d\n", number1, number2 );
	
		if ( number1 != number2 )
			System.out.printf( "%d != %d\n", number1, number2 );
	
		if ( number1 < number2 )
			System.out.printf( "%d < %d\n", number1, number2 );
	
		if ( number1 > number2 )
			System.out.printf( "%d > %d\n", number1, number2 );
	
		if ( number1 <= number2 )
			System.out.printf( "%d <= %d\n", number1, number2 );
	
		if ( number1 >= number2 )
			System.out.printf( "%d >= %d\n", number1, number2 );
	
	} // end method main
	
} // end class Comparison
