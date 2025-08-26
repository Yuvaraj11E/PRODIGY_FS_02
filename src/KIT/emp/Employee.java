package KIT.emp;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String des;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Employee(int id, String name, int salary, String des) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.des = des;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", des=" + des + "]";
	}
	

}
