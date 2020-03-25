// ThreeIntegerProduct.java
// Calculates the product of three integers
import java.util.Scanner; // program uses class Scanner

public class ThreeIntegerProduct
{
	// main method begins execution of Java application
	public static void main( String args[] )
	{
		// Create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		int x, y, z, result;
	
		System.out.print( "Enter first integer: " ); // prompt
		x = input.nextInt(); // read first number from user
		
		System.out.print( "Enter second integer: " ); // prompt
		y = input.nextInt(); // read second number from user
	
		System.out.print( "Enter third integer: " ); // prompt
		z = input.nextInt(); // read third number from user
		
		result = x * y * z;
	
		System.out.printf( "Product is: %d\n", result ); // output result
	
	} // end method main
	
} // end class ThreeIntegerProduct
