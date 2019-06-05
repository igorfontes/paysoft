import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Program
{
	static int i;
	static Double extrafee;
	static int contfriday = 0;
	static int year, month, day;
	static LocalDate localdate, auxdate; //= LocalDate.now();
	static Double value, percentage;
	static int auxid, lastday;
	static Double auxsalary;
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
	static Double[] salaryperhour = new Double[50];
	static String[] date = new String[50]; 
	static Double[] hours = new Double[50];
	static String[] agendainterval = new String[50];
	static int[] agendaday = new int[50];
	static String[] agendadayweek = new String[50];
	static int contaseg=0;
	static int contater=0;
	static int contaqua=0;
	static int contaqui=0;
	static int contasex=0;

	static Scanner input = new Scanner(System.in);

	static void addEmployee()
	{
		id++;
		System.out.print("Please type the name and press enter:");
		input.nextLine();
		name[id] = input.nextLine();
		System.out.printf("Please type the address and press enter:");
		address[id] = input.nextLine();
		System.out.printf("Please type the type(hourly, salaried or comissioned) and press enter:");
		type[id] = input.nextLine();
		if(type[id].equals("hourly")){
			agendainterval[id]="semanalmente"; //padrao as sextas
			System.out.printf("Por favor digite o valor do salario por hora trabalhada e pressione enter:");
			salary[id] = 0.0;
			salaryperhour[id] = input.nextDouble();
			input.nextLine();
		}
		if(type[id].equals("salaried")){
			agendainterval[id]="mensalmente"; //padrao no ultimo dia util
			System.out.printf("Por favor digite o valor do salario fixo para 2 semanas e pressione enter:");
			salary[id] = input.nextDouble();
			auxsalary = salary[id]; // o salario fixo e o mesmo para todos
			input.nextLine();
		}
		if(type[id].equals("comissioned")){
			agendainterval[id]="bi-semanalmente"; //padrao as sextas
			System.out.printf("Por favor digite o valor do salario fixo para 2 semanas e pressione enter:");
			salary[id] = input.nextDouble();
			auxsalary = salary[id];
			input.nextLine();
		}
		System.out.printf("Please type the payment method(chequeemmaos, chequeporcorreio, deposito) and press enter:");
		payway[id] = input.nextLine();
		System.out.printf("Please type 1 if the employee want to be part of the sindicate else 0 and press enter:");
		sind[id] = input.nextInt();
		if(sind[id] == 1){
			System.out.printf("Please type the sindical fee(usando virgula) and press enter:");
			sindfee[id] = input.nextDouble();
			auxidsind++;
			idsind[id] = auxidsind;
			System.out.printf("Seu id no sindicato sera %d\n",idsind[id]);
		}
		System.out.printf("Seu id na empresa sera %d\n\n",id);
		//System.out.printf("Seu id  sera %s",type[id]);
	}

	static void frequencyCard()
	{
		System.out.println("Please type the current year:");
		year = input.nextInt();
		System.out.println("Please type the current month:");
		month = input.nextInt();
		System.out.println("Please type the current day:");
		day = input.nextInt();
		localdate = LocalDate.of(year,month,day);
		System.out.printf("Please type the id and press enter:");
		auxid = input.nextInt();
		System.out.printf("Please type the amount of hours worked and press enter:");
		hours[auxid] = input.nextDouble();		
		if(hours[auxid] > 8)
		{
			salary[auxid]+=(salaryperhour[auxid]*8.0+(hours[auxid]-8)*1.5*salaryperhour[auxid]);
		} else {
			salary[auxid]+=(salaryperhour[auxid]*hours[auxid]);
		}
		System.out.printf("Seu salario ate agora e %.2f\n\n",salary[auxid]);
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

	static void extraFee()
	{
		System.out.printf("Please type the id and press enter:");
		auxid = input.nextInt();
		System.out.printf("Please type the service fee and press enter:");
		extrafee = input.nextDouble();
		salary[auxid]-=extrafee;
	}

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

	static void paysheet()
	{
		System.out.println("Please type the current year:");
		year = input.nextInt();
		System.out.println("Please type the current month:");
		month = input.nextInt();
		System.out.println("Please type the current day:");
		day = input.nextInt();
		localdate = LocalDate.of(year,month,day);
		auxdate = localdate.withMonth(month).with(TemporalAdjusters.lastDayOfMonth());
		lastday = auxdate.getDayOfWeek().ordinal();
		while(lastday==5 || lastday==6){ //set the auxdate to be the last util day
			auxdate = auxdate.minusDays(1); 
			lastday--;
		}
		for(i=1;i<=id;i++){

			if(agendainterval[i].equals("mensal$") || agendainterval[i].equals("mensalmente")){
				if(auxdate.isEqual(localdate)){ 
					if(sind[i]==1){
						salary[i]-=sindfee[i];
					}
					System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
					if(type[i].equals("hourly")){ 
						salary[i] = 0.0;
					}
					if(type[i].equals("salaried") || type[i].equals("comissioned")){
						salary[i] = 2 * auxsalary;
					}
				}
			}

			if(agendainterval[i].equals("mensal")){

				//FALTA DOS OUTROS DIAS
				if(agendadayweek[i].equals("terca")){
					if(localdate.getDayOfWeek().ordinal()==1){
						contasex++;
						if(contasex%agendaday[i] == agendaday[i]){
							if(sind[i]==1){
								salary[i]-=sindfee[i];
							}
							System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
							if(type[i].equals("hourly")){
								salary[i] = 0.0;
							}
							if(type[i].equals("salaried") || type[i].equals("comissioned")){
								salary[i] = (agendaday[i]*auxsalary/2);
							}
						}
					}
				}

				if(agendadayweek[i].equals("quarta")){
					if(localdate.getDayOfWeek().ordinal()==2){
						contasex++;
						if(contasex%agendaday[i] == agendaday[i]){
							if(sind[i]==1){
								salary[i]-=sindfee[i];
							}
							System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
							if(type[i].equals("hourly")){
								salary[i] = 0.0;
							}
							if(type[i].equals("salaried") || type[i].equals("comissioned")){
								salary[i] = (agendaday[i]*auxsalary/2);
							}
						}
					}
				}

				if(agendadayweek[i].equals("quinta")){
					if(localdate.getDayOfWeek().ordinal()==3){
						contasex++;
						if(contasex%agendaday[i] == agendaday[i]){
							if(sind[i]==1){
								salary[i]-=sindfee[i];
							}
							System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
							if(type[i].equals("hourly")){
								salary[i] = 0.0;
							}
							if(type[i].equals("salaried") || type[i].equals("comissioned")){
								salary[i] = (agendaday[i]*auxsalary/2);
							}
						}
					}
				}

				if(agendadayweek[i].equals("sexta")){
					if(localdate.getDayOfWeek().ordinal()==4){
						contasex++;
						if(contasex%agendaday[i] == agendaday[i]){
							if(sind[i]==1){
								salary[i]-=sindfee[i];
							}
							System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
							if(type[i].equals("hourly")){
								salary[i] = 0.0;
							}
							if(type[i].equals("salaried") || type[i].equals("comissioned")){
								salary[i] = (agendaday[i]*auxsalary/2);
							}
						}
					}
				}

			}

			if(agendainterval[i].equals("semanal")){

				if(agendaday[i] == day){
					if(sind[i]==1){
						salary[i]-=sindfee[i];
					}
					System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
					if(type[i].equals("hourly")){
						salary[i] = 0.0;
					}
					if(type[i].equals("salaried") || type[i].equals("comissioned")){
						salary[i] = 2 * auxsalary;
					}
				}

			}

			if(agendainterval[i].equals("semanalmente") || agendainterval[i].equals("bi-semanalmente")){

				if(localdate.getDayOfWeek().ordinal() == 4){ // if it is friday, time to pay
					contfriday++;
					for(i=1;i<=id;i++){

						if(agendainterval[i].equals("semanalmente")){
							if(sind[i]==1){
								salary[i]-=sindfee[i];
							}
							System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
							if(type[i].equals("hourly")){
								salary[i] = 0.0;
							}
							if(type[i].equals("salaried") || type[i].equals("comissioned")){
								salary[i] = auxsalary/2;
							}
						}

						if(agendainterval[i].equals("bi-semanalmente")){
							if(contfriday%2 == 0)
							{
								if(sind[i]==1){
									salary[i]-=sindfee[i];
								}
								System.out.printf("The employee with id %d received %.2f reals today\n", i, salary[i]);
								if(type[i].equals("hourly")){
									salary[i] = 0.0;
								}
								if(type[i].equals("salaried") || type[i].equals("comissioned")){
									salary[i] = auxsalary;
								}
							}
						}

					}
			}
		}
			
		}
		return;
		//the number 4 is for friday
		//System.out.println(auxdate.getDayOfWeek().name());
		//System.out.println(auxdate.getDayOfWeek().ordinal());
	}

	static void removeEmployee()
	{
		name[id] = null;
		address[id] = null;
		type[id] = null;
		payway[id] = null;
		//sind[id] = null;
		//idsind[id] = null;
	}

	// public void undo()
	// {
	// 	return;
	// }

	// public void redo()
	// {
	// 	return;
	// }

	static void defineAgenda()//o empregado tem conhecimento das novas agendas tbm
	{
		System.out.printf("Please type the id and press enter:\n");
		auxid = input.nextInt();
		System.out.printf("Please type the payment interval(semanal, mensal ou mensal$ to receive at the last util day of the month) and press enter:\n");
		agendainterval[auxid] = input.nextLine();
		if(agendainterval[auxid].equals("mensal")){
			System.out.printf("Please type the payment day(the number of the day at the month) and press enter:\n");
			agendaday[auxid] = input.nextInt();
		}
		if(agendainterval[auxid].equals("semanal")){
			System.out.printf("Please type the payment day(the number of the day at the month) and press enter:\n");
			agendaday[auxid] = input.nextInt();
			System.out.printf("Please type the payment day of the week and press enter:\n");
			agendadayweek[auxid] = input.nextLine();
		}

		return;
	}

	// public void newAgenda(String newpaytime)
	// {
	// 	return;
	// }
	public static void main(String[] args)
	{
		
		int option = 1;

		while(true){

			System.out.printf("Please type one of the options below:\n1 - add employee\n2 - remove employee\n3 - set frequency card\n4 - add a selling\n5 - add a service fee\n6 - change data of an employee\n7 - update paysheet and pay employees\n8 - undo\n9 - redo\n10 - set up payment agenda\n11 - create new agenda\n12 - exit\n");
		
			option = input.nextInt();

			if(option == 1)
			{	
				addEmployee();
			}
			if(option == 2)
			{	
				removeEmployee();
			}
			if(option == 3)
			{
				frequencyCard();
			}
			if(option == 4)
			{
				seller();
			}
			if(option == 5)
			{
				extraFee();
			}
			if(option == 6)
			{
				changeData();
			}
			if(option == 7)
			{
				paysheet();
			}
			if(option == 10)
			{
				defineAgenda();
			}
			if(option == 12)
			{
				break;
			}

		}

	}
}
