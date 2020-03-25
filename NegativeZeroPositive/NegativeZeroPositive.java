// NegativeZeroPositive.java
// Calculates the product of three integers
import java.util.Scanner; // program uses class Scanner

public class NegativeZeroPositive
{
	// main method begins execution of Java application
	public static void main( String args[] )
	{
		// Create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		int first, second, third, fourth, fifth;
		int countPositiveIntegers = 0;
		int countZeroIntegers = 0; 
		int countNegativeIntegers = 0;
	
		System.out.print( "Enter first integer: " ); // prompt
		first = input.nextInt(); // read first number from user
		
		if ( first < 0 ) {
			countNegativeIntegers = countNegativeIntegers + 1;
		}
		
		else if ( first > 0 ) {
			countPositiveIntegers = countPositiveIntegers + 1;
		}
		
		else {
			countZeroIntegers = countZeroIntegers + 1;
		}
		
		System.out.print( "Enter second integer: " ); // prompt
		second = input.nextInt(); // read second number from user
		
		if ( second < 0 ) {
			countNegativeIntegers = countNegativeIntegers + 1;
		}
		
		else if ( second > 0 ) {
			countPositiveIntegers = countPositiveIntegers + 1;
		}
		
		else {
			countZeroIntegers = countZeroIntegers + 1;
		}
	
		System.out.print( "Enter third integer: " ); // prompt
		third = input.nextInt(); // read third number from user
		
		if ( third < 0 ) {
			countNegativeIntegers = countNegativeIntegers + 1;
		}
		
		else if ( third > 0 ) {
			countPositiveIntegers = countPositiveIntegers + 1;
		}
		
		else {
			countZeroIntegers = countZeroIntegers + 1;
		}
		
		System.out.print( "Enter fourth integer: " ); // prompt
		fourth = input.nextInt(); // read fourth number from user
		
		if ( fourth < 0 ) {
			countNegativeIntegers = countNegativeIntegers + 1;
		}
		
		else if ( fourth > 0 ) {
			countPositiveIntegers = countPositiveIntegers + 1;
		}
		
		else {
			countZeroIntegers = countZeroIntegers + 1;
		}
	
		System.out.print( "Enter fifth integer: " ); // prompt
		fifth = input.nextInt(); // read fifth number from user
		
		if ( fifth < 0 ) {
			countNegativeIntegers = countNegativeIntegers + 1;
		}
		
		else if ( fifth > 0 ) {
			countPositiveIntegers = countPositiveIntegers + 1;
		}
		
		else {
			countZeroIntegers = countZeroIntegers + 1;
		}
	
		System.out.println( countNegativeIntegers + " negative integers were input" ); // output number of negative integers
		System.out.println( countZeroIntegers + " zeroes were input" ); // output number of zeroes
		System.out.println( countPositiveIntegers + " positive integers were input" ); // output number of positive integers
	
	} // end method main
	
} // end class NegativeZeroPositive
