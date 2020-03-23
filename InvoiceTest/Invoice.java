// Invoice.java
// Invoice class with a constructor.

public class Invoice
{
   private String partNumber; // Item part number
   private String partDescription; // Item part description
   private int itemQuantity;
   private double pricePerItem;
   private double invoiceAmount;	

   // constructor initializes Invoice with part number and description Strings supplied as argument
   public Invoice( String partNum, String partDesc, int quantity, double price )
   {
      partNumber = partNum;
	  partDescription = partDesc;
	  itemQuantity = quantity;
	  pricePerItem = price;
	   
	  if ( quantity < 0 )
	  itemQuantity = 0;
	  
	  if ( price < 0 )
	  pricePerItem = 0;
	  
   } // end constructor

   public void setPartNumber( String partNum )
   {
      partNumber = partNum;
   } // end method setPartNumber

   public String getPartNumber()
   {
      return partNumber;
   } // end method getPartNumber
   
   public void setPartDescription( String partDesc )
   {
      partDescription = partDesc;
   } // end method setPartDescription

   public String getPartDescription()
   {
      return partDescription;
   } // end method getPartDescription
   
   public void setItemQuantity( int quantity )
   {
      itemQuantity = quantity;
   } // end method setItemQuantity

   public int getItemQuantity()
   {
      return itemQuantity;
   } // end method getItemQuantity
   
   public double getPricePerItem()
   {
      return pricePerItem;
   } // end method getPricePerItem

} // end class Invoice


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
