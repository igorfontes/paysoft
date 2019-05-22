import java.util.Scanner;
import java.time.LocalDate;

public class Program
{
	static LocalDate localdate;
	static Double value, percentage;
	static int auxid;
	static int auxoption;
	static int id = 0;
	static int auxidsind = 0;
	static String[] name = new String[50];
	static String[] address = new String[50];
	static String[] type = new String[50];
	static String[] payway = new String[50];
	static int[] sind = new int[50]; // sind is yes 1 or no 0
	static Double[] sindfee = new Double[50];
	static int[] idsind = new int[50];
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
		System.out.print("Please type the name and press enter:\n");
		name[id] = input.nextLine();
		System.out.printf("Please type the address and press enter:");
		address[id] = input.nextLine();
		System.out.printf("Please type the type and press enter:");
		type[id] = input.nextLine();
		System.out.printf("Please type the payway and press enter:");
		payway[id] = input.nextLine();
		System.out.printf("Please type 1 if the employee want to be part of the sindicate else 0 and press enter:");
		sind[id] = input.nextInt();
		if(sind[id] == 1){
			System.out.printf("Please type the sindical fee and press enter:");
			sindfee[id] = input.nextDouble();
			auxidsind++;
			idsind[id] = auxidsind;
			System.out.printf("Seu id no sindicato sera %d\n",idsind[id]);
		}
		System.out.printf("Seu id na empresa sera %d\n\n",id);
		//System.out.printf("Seu id  sera %s",type[id]);
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

	static void changeData()
	{
		System.out.printf("Please type the employee's id:");
		auxid = input.nextInt();
		auxoption = 1;
		while(auxoption != 8){
			System.out.printf("Please choose one of the options below:\n");
			System.out.printf("1 - change name\n2 - change address\n3 - change type of employee\n4 - change payway\n5 - change sindicate state\n6 - change sindicate id\n7 - change sindicate fee\n8 - exit");
			auxoption = input.nextInt();
			if(auxoption == 1){
				System.out.printf("Please type the new name:\n");
				name[id] = input.nextLine();
			}
			if(auxoption == 2){
				System.out.printf("Please type the new address:\n");
				address[id] = input.nextLine();
			}
			if(auxoption == 3){
				System.out.printf("Please type the new type of employee:\n");
				type[id] = input.nextLine();
			}
			if(auxoption == 4){
				System.out.printf("Please type the new payway:\n");
				payway[id] = input.nextLine();
			}
			if(auxoption == 5){
				System.out.printf("Please type the new sindicate state(type yes to include the employee to the sindicate and no to remove):\n");
				sind[id] = input.nextInt();
			}
			if(auxoption == 6){
				System.out.printf("Please type the new idsind:\n");
				name[id] = input.nextLine(); //AJEITAR ISSO AQUI, NAO ENTENDI
			}
			if(auxoption == 7){
				System.out.printf("Please type the new sindical fee:\n");
				sindfee[id] = input.nextDouble();
			}

		}
		return;
	}

	static void paysheet(int year, int month, int dayOfMonth)
	{
		localDate = LocalDate(year, month, dayOfMonth);
		if(localDate.getDayOfWeek().ordinal() == 4){
			return;
		}
		return;
	}

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
		
		int option = 1;
		System.out.println(localdate);

		while(true){

			System.out.printf("Please type one of the options below:\n1 - add employee\n2 - remove employee\n3 - set frequency card\n4 - add a selling\n5 - add a service fee\n6 - change data of an employee\n7 - update paysheet and pay employees\n8 - undo\n9 - redo\n10 - set up payment agenda\n11 - create new agenda\n12 - exit\n");
		
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
			if(option == 6)
			{
				changeData();
			}
			if(option == 12)
			{
				break;
			}

		}

	}
}
