package employeeassignment;

import java.util.Scanner;

public class EmployeeMain 
{
	public static void main(String args[])
	{
		AddEmployee employee = new AddEmployee();
		employee.addEmployee(1, "Srivalli", "Hyderabad");
        employee.addEmployee(2, "Rakesh Kumar", "Visakhapatnam");
        employee.addEmployee(3, "Jahnavi", "Chennai");
        employee.addEmployee(4, "Aadhya", "Banglore");
        employee.addEmployee(5, "Minnu", "Pune");
        employee.addEmployee(6, "Jyothsna", "Lucknow");
        employee.addEmployee(7, "Teena", "Patna");
        employee.addEmployee(8, "Sruthi", "Assam");
        employee.addEmployee(9, "Tushara", "Delhi");
        employee.addEmployee(10, "Vinay", "Mumbai");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee ID:");
        try 
        {
	        Employee emp = employee.getEmployee(scan.nextInt());
	        if (emp != null) 
	        {
	            System.out.println("Employee found: " + emp.getName() + ", " + emp.getCity());
	        }
        } 
        catch(Exception e) 
        {
            System.out.println("Employee not found.");
		
        }
	}
}
