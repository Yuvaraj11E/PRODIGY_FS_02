package KIT.emp;

import java.util.List;
import java.util.ArrayList;
public class EmployeeService 
{
	private final List<Employee>employees =new ArrayList<>();
	public void addEmployee(Employee e)
	{
		employees.add(e);
		System.out.println("Employee added successfully.");
	}
	public void view()
	{
		if(employees.isEmpty())
		{
			System.out.println("No Employees To Display");
		}
		else
		{
			employees.forEach(System.out::println);
		}
	}
	public void update(int id, String newName , int newSalary, String newDes)
	{
		for(Employee e : employees)
		{
		
			if(e.getId()==id) 
			{
				e.setName(newName);
				e.setSalary(newSalary);
				e.setDes(newDes);
				System.out.println("Employee updated.");
				return;
			}
		}
		System.out.println("Employee not found.");
	}
	public void delete(int id)
	{
		employees.removeIf(s->s.getId()==id);
		System.out.println("Employee deleted(if exisited).");
	}
}
