import java.util.Scanner;

public class Program
{
	static Double value, percentage;
	static int auxid;
	static int id = 0;
	static int idsind = 0;
	static String[] name = new String[50];
	static String[] address = new String[50];
	static String[] type = new String[50];
	static String[] payway = new String[50];
	static String[] sind = new String[50]; // sind is yes or no
	static Double[] sindfee = new Double[50];
	static Double[] salary = new Double[50];
	static String[] date = new String[50]; 
	static Double[] hours = new Double[50];
	// for(i=1;i<=50;i++){
	// 	salary[i] = 0;
	// }

	static Scanner input = new Scanner(System.in);

	static void addEmployee()
	{
		id++;
		System.out.printf("Please type the name and press enter:");
		name[id] = input.nextLine();
		System.out.printf("Please type the address and press enter:");
		address[id] = input.nextLine();
		System.out.printf("Please type the type and press enter:");
		type[id] = input.nextLine();
		System.out.printf("Please type the payway and press enter:");
		payway[id] = input.nextLine();
		System.out.printf("Please type yes if the employee want to be part of the sindicate and press enter:");
		sind[id] = input.nextLine();
		System.out.printf("Please type the sindical fee and press enter:");
		sindfee[id] = input.nextDouble();
		// if(sindic == "yes")//DANDO ERRADO
		// {
		// 	idsind++;
		// 	System.out.printf("Seu id no sindicato sera %d",idsind);
		// }
		// if(sindic!="yes")
		// {
		// 	System.out.printf("Voce nao faz parte do sindicato!");
		// }
		System.out.printf("Seu id sera %d",id);
		//System.out.printf("Seu id sera %s",type[id]);
	}

	// public String getName()
	// {
	// 	return name;
	// }

	// public String getType()
	// {
	// 	return type;
	// }

	// public int getId()
	// {
	// 	return id;
	// }

	static void frequencyCard()
	{
		System.out.printf("Please type the date and press enter:");
		date[id] = input.nextLine();
		System.out.printf("Please type the id and press enter:");
		auxid = input.nextInt();
		System.out.printf("Please type the amount of hours worked and press enter:");
		hours[auxid] = input.nextDouble();		
		if(hours[auxid] > 8)
		{
			salary[auxid] = 400 + (hours[auxid]-8)*75; //consauxidering 50 reals per worked hour
		} else {
			salary[auxid] = 50*hours[auxid];
		}
		System.out.printf("Seu salario ate agora e %.2f",salary[auxid]);
	}

	static void seller()
	{
		System.out.printf("Please type the id and press enter:");
		auxid = input.nextInt();
		System.out.printf("Please type the date and press enter:\n");
		date[auxid] = input.nextLine();
		System.out.printf("Please type the value of the selling and press enter:");
		value = input.nextDouble();
		System.out.printf("Please type the percentage and press enter:");
		percentage = input.nextDouble();
		salary[auxid]+=(value*percentage/100);
	}

	// public void extraFee(int id, double extrafee)
	// {
	// 	return;
	// }

	// public void changedata(String name, String address, String type, String payway, String sindic, double sindfee)
	// {
	// 	return;
	// }

	// public void paysheet(String date)
	// {
	// 	return;
	// }

	// public void undo()
	// {
	// 	return;
	// }

	// public void redo()
	// {
	// 	return;
	// }

	// public void defineAgenda(int id, String paytime)
	// {
	// 	return;
	// }

	// public void newAgenda(String newpaytime)
	// {
	// 	return;
	// }
	public static void main(String[] args)
	{
		
		int option;

		System.out.printf("Please type 1 and press enter to add an employee:");
		option = input.nextInt();

		if(option == 1)
		{	
			addEmployee();
		}
		if(option == 3)
		{
			frequencyCard();
		}
		if(option == 4)
		{
			seller();
		}

	}
}
