// Date.java
// Date class with a constructor.

public class Date
{
   private int monthPart;
   private int dayPart;
   private int yearPart;
   private String dateResult;
   
   // constructor initializes Date with month, day and year supplied as argument
   public Date( int month, int day, int year )
   {
      monthPart = month;
      dayPart = day;
      yearPart = year;
	   
      if ( month < 1 )
      monthPart = 1;
	  
      if ( day < 1 )
      monthPart = 1;
	  
	  if ( year < 1 )
      monthPart = 1;
	  
   } // end constructor

   public void setMonth( int month )
   {
      monthPart = month;
   } // end method setMonth

   public int getMonth()
   {
      return monthPart;
   } // end method getMonth
   
   public void setDay( int day )
   {
      dayPart = day;
   } // end method setDay

   public int getDay()
   {
      return dayPart;
   } // end method getDay
   
   public void setYear( int year )
   {
      yearPart = year;
   } // end method setYear

   public int getYear()
   {
      return yearPart;
   } // end method getYear
   
   public String displayDate()
   {
		dateResult = getMonth() + "/" + getDay() + "/" + getYear();
		return dateResult;
   } // end method displayDate

} // end class Date


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
