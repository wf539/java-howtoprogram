// GuiAddition.java
// Addition program that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner
import javax.swing.JOptionPane;  // import class JOptionPane

public class GuiAddition 
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2
	  
      // prompt user to enter first number
      String strNumber1 = JOptionPane.showInputDialog( "Enter first integer: " );
	  
      // prompt user to enter second number
      String strNumber2 = JOptionPane.showInputDialog( "Enter second integer: " );
	  
      // convert inputs to type int
      number1 = Integer.parseInt( strNumber1 );
      number2 = Integer.parseInt( strNumber2 );

      sum = number1 + number2; // add numbers
	  
      // create the message
      String result = String.format( "Sum is %d\n", sum );
	  
      // display sum
      JOptionPane.showMessageDialog( null, result );

   } // end method main

} // end class GuiAddition

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
