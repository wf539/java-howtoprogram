// EmployeeTest.java
// Employee constructor used to specify the employee's first name, last name and salary 
// when each Employee object is created.
// import java.util.Scanner;

public class EmployeeTest
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
	  
      // create Employee object
      Employee firstTestEmployee = new Employee( "Galvin", "Willis", 50000.00, );
      Employee secondTestEmployee = new Employee( "Porter", "Spencer", 150000.00, );

      // display initial values of test employee
      System.out.printf( "test Employee 1's given name is: %s\n", firstTestEmployee.getEmployeeFirstname() );
      System.out.printf( "test Employee 1's last name is: %s\n", firstTestEmployee.getEmployeeLastname() );
      System.out.printf( "test Employee 1's salary is: %s\n", firstTestEmployee.getEmployeeSalary() );
      System.out.printf( "test Employee 2's given name is: %s\n", secondTestEmployee.getEmployeeFirstname() );
      System.out.printf( "test Employee 2's last name is: %s\n", secondTestEmployee.getEmployeeLastname() );
      System.out.printf( "test Employee 2's salary is: %s\n", secondTestEmployee.getEmployeeSalary() );
      System.out.printf( "test Employee 2's salary after a raise is: %.2f\n", secondTestEmployee.getEmployeeSalary() *  );
   } // end main

} // end class EmployeeTest


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
