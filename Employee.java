package ctf01.java.collections;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;

	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position = "employee";
	}

	public void hello() {
		System.out.println("Hello " + this.firstname);
	}

	public int getSalary() {
		return salary;
	}
}
