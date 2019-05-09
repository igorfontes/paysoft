import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		int id = 0;

		Scanner input = new Scanner(System.in);

		

		String[] employee = new String[4];

		System.out.println("Please enter the name:");
		employee[0] = input.nextLine();

		System.out.println("Please enter the address:");
		employee[1] = input.nextLine();

		System.out.println("Please enter the type of employee:");
		employee[2] = input.nextLine();

		System.out.println("Please enter the salary condition:");
		employee[3] = input.nextLine();

	}
}