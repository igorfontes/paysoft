import java.util.Scanner;

public class Employee
{
	public String name, address, type, salary;
	public int id;

	public Employee(String name, String address, String type, String salary)
	{
		this.name = name;
		this.address = address;
		this.type = type;
		this.salary = salary;
	}

	public int addEmployee(String name, String address, String type, String salary, int id)
	{
		this.name = name;
		this.address = address;
		this.type = type;
		this.salary = salary;
		return id;
	}

}

public class Program
{
	public static void main(String[] args)
	{
		int id = 0;

		Scanner input = new Scanner(System.in);

		String employee = new String[4];

		System.out.println("Please enter the name:");
		employee[0] = input.nextLine();

		System.out.println("Please enter the address:");
		employee[1] = input.nextLine();

		System.out.println("Please enter the type:");
		employee[2] = input.nextLine();

		System.out.println("Please enter the salary condition:");
		employee[3] = input.nextLine();

	}
}
