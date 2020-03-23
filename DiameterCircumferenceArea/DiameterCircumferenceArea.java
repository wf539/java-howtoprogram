// DiameterCircumferenceArea.java
// Calculates the diameter, circumference and area of a circle given the radius as user input.
import java.util.Scanner; // program uses class Scanner

public class DiameterCircumferenceArea
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      float radius;
	  double PI = 3.14159;

      System.out.print( "Enter radius of circle: " ); // prompt for radius
      radius = input.nextInt();

      System.out.printf( "Diameter is %f\n", 2 * radius); // display diameter
      System.out.printf( "Circumference is %f\n", 2 * PI * radius ); // display circumference
      System.out.printf( "Area is %f\n", PI * radius * radius ); // display area

   } // end method main

} // end class DiameterCircumferenceArea

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
