import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		int id = 0;
		int idsind = 0;
		int option;
		String auxname, auxaddress, auxtype, auxsalary, auxsind;
		double auxsindfee;

		Scanner input = new Scanner(System.in);

		//Employee employee = new Employee("Igor", "Clim", "hourl", "total");
		Employee[] employeeArray = new Employee[100];

		System.out.printf("Please type 1 and press enter to add an employee:");
		option = input.nextInt();

		if(option == 1)
		{
			System.out.printf("Please type the name and press enter:");
			auxname = input.nextLine();
			System.out.printf("Please type the address and press enter:");
			auxaddress = input.nextLine();
			System.out.printf("Please type the type and press enter:");
			auxtype = input.nextLine();
			System.out.printf("Please type the salary and press enter:");
			auxsalary = input.nextLine();
			System.out.printf("Please type yes if the employee want to be part of the sindicate and press enter:");
			auxsind = input.nextLine();
			System.out.printf("Please type the sindical fee and press enter:");
			auxsindfee = input.nextDouble();
			employeeArray[id] = new Employee(auxname, auxaddress, auxtype, auxsalary, auxsind, auxsindfee);
			System.out.printf("the employee %s", employeeArray[id].getType());
			employeeArray[id].addEmployee(auxname, auxaddress, auxtype, auxsalary, auxsind, auxsindfee);
		}

		// Employee[1] = input.nextLine();

		// System.out.println("Please enter the type of Employee:");
		// Employee[2] = input.nextLine();

		// System.out.println("Please enter the salary condition:");
		// Employee[3] = input.nextLine();

	}
}
