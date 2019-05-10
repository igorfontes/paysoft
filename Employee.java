public class Employee
{
	public String name, address, type, payway, salary;
	public double sindfee;
	public int id = 0;
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

	public void addEmployee(String name, String address, String type, String salary) //String payway, String sindic, double sindfee)
	{
		id++;
		// if(sindic == "yes")
		// {
		// 	idsind++;
		// 	//fazer algo pra printar no data set ambos ids
		// }
		System.out.printf("Seu id sera %d",getId());//sind;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}

	public int getId()
	{
		return id;
	}

	public double frequencyCard(int id, double hours)
	{
		//make some way to calculate the work time
		return hours;
	}

	public void seller(int id, String date, double value, double percentage)
	{
		return;
	}

	public void extraFee(int id, double extrafee)
	{
		return;
	}

	public void changedata(String name, String address, String type, double salary, String payway, String sindic, double sindfee)
	{
		return;
	}

	public void paysheet(String date)
	{
		return;
	}

	public void undo()
	{
		return;
	}

	public void redo()
	{
		return;
	}

	public void defineAgenda(int id, String paytime)
	{
		return;
	}

	public void newAgenda(String newpaytime)
	{
		return;
	}

}