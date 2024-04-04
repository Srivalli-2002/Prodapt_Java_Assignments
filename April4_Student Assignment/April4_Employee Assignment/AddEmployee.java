package employeeassignment;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	
	//Method to store list of employees
	public List<Employee> empList = new ArrayList<>();

	//Method to add a new employee
	public void addEmployee(int id, String name, String city) 
	{
        empList.add(new Employee(id, name, city));
    }
	
	public Employee getEmployee(int id)
	{
		for(Employee emp : empList)
		{
			if(emp.getId() == id)
			{
				return emp;
			}
		}
		return null;
	}
}
