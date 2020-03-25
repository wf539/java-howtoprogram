// OddOrEven.java
// State whether number supplied by user is odd or even.
import java.util.Scanner; // program uses class Scanner

public class OddOrEven
{
	// main method begins execution of Java application
	public static void main( String args[] )
	{
		// Create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		int number;
	
		System.out.print( "Enter an integer: " ); // prompt
		number = input.nextInt(); // read number from user
	
		if ( (number % 2) == 0 ){
			System.out.println( "The input integer is even" );
		}

		else {
			System.out.println( "The input integer is odd" );
		}
	
	} // end method main
	
} // end class OddOrEven
