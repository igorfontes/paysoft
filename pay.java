import java.util.Scanner;

public class Employee
{
	public String name, address, type;
	public double salary;
	public int id;
	//public String entry_time;
	//public String exit_time;
	public double hours;


	public Employee(String name, String address, String type, String salary)
	{
		this.name = name;
		this.address = address;
		this.type = type;
		this.salary = salary;
	}

	public int addEmployee(String name, String address, String type, double salary, String payway, String sindic, double sindfee)
	{
		this.name = name;
		this.address = address;
		this.type = type;
		this.salary = salary;
		id++;
		if(sindic == 'yes')
		{
			idsind++;
			//fazer algo pra printar no data set ambos ids
		} 
		else 
		{
			//fazer algo pra printar no data set so o id normal
		}
	}

	public double frequencyCard(int id, double hours)
	{
		//make some way to calculate the work time
		return hours;
	}

	public double seller(int id, String date, double value, double percentage)
	{

	}

	public extraFee(int id, double extrafee)
	{
		return;
	}

	public changedata(String name, String address, String type, double salary, String payway, String sindic, double sindfee)
	{

	}

	public paysheet(String date)
	{

	}

	public undo()
	{

	}

	public redo()
	{

	}

	public defineAgenda(int id, String paytime)
	{

	}

	public newAgenda(String newpaytime)
	{

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

		System.out.println("Please enter the type of employee:");
		employee[2] = input.nextLine();

		System.out.println("Please enter the salary condition:");
		employee[3] = input.nextLine();

	}
}