// Employee.java
// Employee class with a constructor.

public class Employee
{
   private String employeeFirstName;
   private String employeeLastName;
   private double employeeSalary;
    // private double salaryRaise;	

   // constructor initializes Employee with names and salary supplied as argument
   public Employee( String firstName, String lastName, double salary )
   {
      employeeFirstName = firstName;
      employeeLastName = lastName;
      employeeSalary = salary;
	   
      if ( salary < 0 )
      employeeSalary = 0.0;
	  
   } // end constructor

   public void setEmployeeFirstName( String firstName )
   {
      employeeFirstName = firstName;
   } // end method setEmployeeFirstName

   public String getEmployeeFirstName()
   {
      return employeeFirstName;
   } // end method getEmployeeFirstName
   
   public void setEmployeeLastName( String lastName )
   {
      employeeLastName = lastName;
   } // end method setEmployeeLastName

   public String getEmployeeLastName()
   {
      return employeeLastName;
   } // end method getEmployeeLastName
   
   public void setEmployeeSalary( int salary )
   {
      employeeSalary = salary;
   } // end method setEmployeeSalary

   public double getEmployeeSalary()
   {
      return employeeSalary;
   } // end method getEmployeeSalary
   
} // end class Employee


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
