package KIT.emp;
import  java.util.Scanner;

import KIT.emp.Employee;
public class Main 
{
	public static void main(String []args)
	{
		EmployeeService  service = new EmployeeService();
		Scanner s=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n--- Employee Management System---");
			System.out.println("1.Add Employee");
			System.out.println("2.View Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			s.nextLine();
			
			switch(choice) {
			case 1 -> {
				System.out.println("Enter ID:");
				int id=s.nextInt();
				s.nextLine();
				System.out.println("Enter Employee Name:");
				String name=s.nextLine();
				System.out.println("Enter Salary:");
				int salary=s.nextInt();
				s.nextLine();
				System.out.println("Enter Designation:");
				String des=s.nextLine();
				service.addEmployee(new Employee(id,name,salary,des));
			}
		
			case 2 -> service.view();
			case 3 ->{
				System.out.println("Enter ID to update:");
				int id=s.nextInt();
				s.nextLine();
				System.out.println("Enter new name:");
				String newName=s.nextLine();
				System.out.println("Enter new Salary:");
				int newSalary=s.nextInt();
				s.nextLine();
				System.out.println("Enter new Designation:");
				String newdes=s.nextLine();
				service.update(id, newName, newSalary, newdes);
			}
			case 4 ->{
				System.out.println("Enter ID to delete");
				int id=s.nextInt();
				service.delete(id);
			}
			case 0 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid Choice.");
			}
		}while (choice !=0);
		
	}

}
			
