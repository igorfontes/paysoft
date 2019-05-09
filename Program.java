import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		int id = 0;
		int idsind = 0;
		int option;

		Scanner input = new Scanner(System.in);

		Employee employee = new Employee("Igor", "Clim", "hourl", "total");

		System.out.println("Please type 1 and press enter to add an employee:");
		//option = input.nextInt();

		System.out.printf("the employee %s", employee.getName());
		// Employee[1] = input.nextLine();

		// System.out.println("Please enter the type of Employee:");
		// Employee[2] = input.nextLine();

		// System.out.println("Please enter the salary condition:");
		// Employee[3] = input.nextLine();

	}
}
