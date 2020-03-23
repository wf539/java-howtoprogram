// DateTest.java
// Date constructor used to specify 
// the month, day and year
// when each date object is created.

public class DateTest
{
   public static void main( String args[] )
   {
      // create Date object
      Date firstTestDate = new Date( 12, 31, 2050 );
      Date secondTestDate = new Date(  1, 1, 1900 );

      // display initial values of test Dates
      System.out.printf( "test Date 1's month is: %d\n", firstTestDate.getMonth() );
      System.out.printf( "test Date 1's day is: %d\n", firstTestDate.getDay() );
      System.out.printf( "test Date 1's year is: %d\n", firstTestDate.getYear() );
      System.out.printf( "test Date 1's date is: %s\n", firstTestDate.displayDate() );
      System.out.printf( "test Date 2's month is: %d\n", secondTestDate.getMonth() );
      System.out.printf( "test Date 2's day is: %d\n", secondTestDate.getDay() );
      System.out.printf( "test Date 2's year is: %d\n", secondTestDate.getYear() );
      System.out.printf( "test Date 2's date is: %s\n", secondTestDate.displayDate() );
   } // end main

} // end class DateTest


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
