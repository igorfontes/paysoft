import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		//int id = 0;
		int idsind = 0;
		int option;
		String auxname, auxaddress, auxtype, auxsalary;

		Scanner input = new Scanner(System.in);

		//Employee employee = new Employee("Igor", "Clim", "hourl", "total");
		Employee[] employeeArray = new Employee[100];

		System.out.printf("Please type 1 and press enter to add an employee:");
		option = input.nextInt();

		if(option == 1)
		{
			System.out.println("Please type the name and press enter:");
			auxname = input.nextLine();
			System.out.printf("Please type the address and press enter:");
			auxaddress = input.nextLine();
			System.out.printf("Please type the type and press enter:");
			auxtype = input.nextLine();
			System.out.printf("Please type the salary and press enter:");
			auxsalary = input.nextLine();
			employeeArray[0] = new Employee(auxname, auxaddress, auxtype, auxsalary);
			System.out.printf("the employee %s", employeeArray[0].getType());
			employeeArray[0].addEmployee(auxname, auxaddress, auxtype, auxsalary);
		}

		// Employee[1] = input.nextLine();

		// System.out.println("Please enter the type of Employee:");
		// Employee[2] = input.nextLine();

		// System.out.println("Please enter the salary condition:");
		// Employee[3] = input.nextLine();

	}
}
