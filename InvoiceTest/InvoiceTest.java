// InvoiceTest.java
// Invoice constructor used to specify the part number, part description, quantity and price per item at the time each Invoice object is created.
import java.util.Scanner;

public class InvoiceTest
{
   public static void main( String args[] )
   {
      /* String part; // part name
      String description; // part description
	  int number;
	  double cost;

	  Scanner partInput = new Scanner( System.in );
	  Scanner descriptionInput = new Scanner( System.in );
      Scanner quantityInput = new Scanner( System.in );
	  Scanner costInput = new Scanner( System.in );

      System.out.print( "Enter item name: " ); // prompt 
      partInput = part; // read part name from user
	  
	  System.out.print( "Enter item desription: " ); // prompt 
      descriptionInput = description; // read part name from user 
	  
	  System.out.print( "Enter item quantity: " ); // prompt 
      quantityInput = number; // read part quantity from user
	  
	  System.out.print( "Enter item cost: " ); // prompt 
      costInput = cost; // read part cost from user */
	  
	  // create Invoice object
      Invoice testInvoice = new Invoice( "CRM-PCE2460-ST001", "Result reference", 10, 3.59 ); 

      // display initial values of test invoice
      System.out.printf( "test Invoice part number is: %s\n", testInvoice.getPartNumber() );
      System.out.printf( "test Invoice part description is: %s\n", testInvoice.getPartDescription() );
	  System.out.printf( "test Invoice item quantity is: %s\n", testInvoice.getItemQuantity() );
	  System.out.printf( "test Invoice item price is: %.2f\n", testInvoice.getPricePerItem() );
      System.out.printf( "test Invoice invoice amount is: %.2f\n", testInvoice.getItemQuantity() * testInvoice.getPricePerItem() );
   } // end main

} // end class InvoiceTest


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
