import java.util.Scanner;

/*En esta clase se centran todo tipo de seleccion en menus*/
public class Menu{
	Scanner scanner = new Scanner(System.in);
	
	public Menu(){}
	
	//Opciones para el menu de Inicio de sesi�n
	public int getOpMainMenu(){
		boolean comprobar=false;
		int op=0;
		
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Escoga c�mo desea iniciar sesi�n: ");
		System.out.println("1.Como paciente.");
		System.out.println("2.Como doctor.");
		System.out.println("3.Cancelar inicio de sesi�n.");
		
		try{
			op = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return op;
	}
	
	//Opciones de menu Lobby para paciente
	public int getOpcionParaPaciente(){
		boolean comprobar=false;
		int opcion=0;
		
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("--------------------------------------");
		System.out.println("�Qu� desea realizar? Escoga una opci�n.");
		System.out.println("--------------------------------------");
		System.out.println("1.Ver mi informacion registrada en el hospital.");
		System.out.println("2.Programar una cita.");
		System.out.println("3.Cerrar sesi�n.");
	
		try{
			opcion = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return opcion;
	}
	
	//Opciones de menu Lobby para doctor
	public int getOpcionParaDoctor(){
		boolean comprobar=false;
		int opcion=0;
		
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("--------------------------------------");
		System.out.println("�Qu� desea realizar? Escoga una opci�n.");
		System.out.println("--------------------------------------");
		System.out.println("1.Ver mi informacion registrada en el hospital.");
		System.out.println("2.Programar una cita con el �rea de inform�tica.");
		System.out.println("3.Ver mis citas asignadas.");
		System.out.println("4.Cerrar sesi�n.");
	
		try{
			opcion = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return opcion;
	}
	
	//Menu para la realizaci�n de otra opcion
	public int replayMenu(){
		int replay=0;
		boolean comprobar=false;
		do{
				do{ 
				comprobar=false;
				System.out.println("\n");
				System.out.println("�Desea realizar otra acci�n?");
				System.out.println("Presione 1 para S� o 2 para No y Cerrar sesi�n.");
				try{
				replay = Integer.parseInt(scanner.nextLine());
				}catch(java.lang.NumberFormatException e){
				System.out.println("Opci�n inv�lida. Intente de nuevo.");
				comprobar=true;
				}
				}while(comprobar);
				
				if(replay!=1 & replay!=2){
				System.out.println("Opci�n inv�lida. Intente de nuevo.");	
				}
				
		}while(replay!=1 & replay!=2);
		
		if(replay==2){
			System.out.println("Cerrando sesi�n...");
			System.out.println("Que pase buen dia.");
		}

		return replay;
	}
	
	//Menu de opciones para citas iguales
	public int continuacionCita(){
		int replay=0;
		boolean comprobar=false;
		do{
				do{ 
				comprobar=false;
				System.out.println("\n");
				System.out.println("Si desde empezar desde cero la cita, presione 1, \nsi desde volver a escoger otra hora presione 2, \nsi desea cancelar la programaci�n de la cita presione 3.");
				try{
				replay = Integer.parseInt(scanner.nextLine());
				}catch(java.lang.NumberFormatException e){
				System.out.println("Opci�n inv�lida. Intente de nuevo.");
				comprobar=true;
				}
				}while(comprobar);
				
				if(replay!=1 & replay!=2 & replay!=3){
				System.out.println("Opci�n inv�lida. Intente de nuevo.");	
				}
				
		}while(replay!=1 & replay!=2 & replay!=3);

		return replay;
	}
	
	//Menu para escoger una hora
	public int escogerHora(){
		int hora=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignaci�n de hora (hrs.) a su cita.");
		System.out.println("Cosidere: Horario de atenci�n: 10:00 - 13:00 hrs./ 14:00 - 17:00 hrs.");
		System.out.println("Ingrese �nicamente el n�mero de la hora(no minutos) que desea su cita.");
	
		try{ 
		hora = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(hora==13 | (hora>=0 & hora<10) | (hora>=17 & hora<=24)){
			System.out.println("Opci�n inv�lida. La hora no se encuentra dentro del horario de atenci�n.");
			comprobar=true;
		}
		
		if(hora<0 | hora>24){
			System.out.println("Opci�n inv�lida. Esta hora es inexistente. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		return hora;
	}
	
	//Menu para escoger los minutos de la hora
	public int escogerMinutos(){
		int minutos=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignaci�n de hora(minutos) a su cita");
		System.out.println("Unicamente atendemos citas en horario en punto, o con 30 minutos del inicio de la hora.");
		System.out.println("Ingrese 00 si desea que su hora sea en punto \n30 si desea que su cita sea tras 30 minutos de la hora escogida.");
		
		try{
		minutos = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if((minutos>0 & minutos<30) | (minutos>30 & minutos<=59)){
			System.out.println("Opci�n inv�lida. Los minutos no se encuentran dentro del horario de atenci�n.");
			comprobar=true;
		}
		
		if(minutos<0 | minutos>=60){
			System.out.println("Opci�n inv�lida. No est� ingresando n�meros v�lidos para minutos.");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return minutos;
	}
	
	//Menu para escoger una fecha(numeral de d�a)
	public int escogerFecha(){
		int fecha=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignaci�n de fecha del d�a de su cita.");
		System.out.println("�nicamente atendemos citas programadas los primeros 29 d�as del mes.");
		System.out.println("Ingrese la fecha (�nicamente el numeral del d�a) que desea realizar la cita.");
		
		try{
		fecha = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(fecha>29 & fecha<=31){
			System.out.println("Opci�n inv�lida. En esta fecha no podemos atenderle.");
			comprobar=true;
		}
		
		if(fecha<=0 | fecha>31){
			System.out.println("Opci�n inv�lida. Fecha inexistente");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return fecha;
	}
	
	//Menu para escoger un a�o
	public int escogerA�o(){
		int a�o=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignaci�n del a�o de su cita.");
		System.out.println("Ingrese el a�o en que desea realizar la cita.");
		System.out.println("Unicamente apartamos citas hasta el a�o 2020.");

		try{
		a�o = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(a�o<2018){
			System.out.println("Opci�n inv�lida. Este a�o ya ha transcurrido. Intente de nuevo.");
			comprobar=true;
		}
		if(a�o>2020){
			System.out.println("Opci�n inv�lida. No apartamos citas desp�es del a�o 2020. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		return a�o;
	}
	
	//Menu para escoger un mes
	public String escogerMes(int a�o){
		int op=0;
		String mes=null;
		boolean comprobar=false;
		
		do{
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignaci�n del mes de su cita.");
		System.out.println("Escoga el mes que desea tener la cita.");
		System.out.println("1.Enero.");
		System.out.println("2.Febrero.");
		System.out.println("3.Marzo.");
		System.out.println("4.Abril.");
		System.out.println("5.Mayo.");
		System.out.println("6.Junio.");
		System.out.println("7.Julio.");
		System.out.println("8.Agosto.");
		System.out.println("9.Septiembre.");
		System.out.println("10.Octubre.");
		System.out.println("11.Noviembre.");
		System.out.println("12.Diciembre.");
		
		try{
		op = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
		System.out.println("Opci�n inv�lida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
		
		switch(op){
			case 1: 
					mes = "Enero";
					break;
			case 2: 
					mes = "Febrero";
					break;
			case 3: 
					mes = "Marzo";
					break;
			case 4: 
					mes = "Abril";
					break;
			case 5: 
					mes = "Mayo";
					break;
			case 6: 
					mes = "Junio";
					break;
			case 7: 
					mes = "Julio";
					break;
			case 8: 
					mes = "Agosto";
					break;
			case 9: 
					mes = "Septiembre";
					break;
			case 10: 
					mes = "Octubre";
					break;
			case 11: 
					mes = "Noviembre";
					break;
			case 12: 
					mes = "Diciembre";
					break;

			default:
				System.out.println("Opci�n inv�lida. Intente de nuevo.");
				comprobar = true;
				break;
		}
		if(a�o==2018){
			if(op<=9){
				System.out.println("Opci�n inv�lida. Este mes ya ha transcurrido. Intente de nuevo.");
				comprobar=true;
			}
		}
		}while(comprobar);
		return mes;
	}
	
	//Menu para escoger el �rea de la cita(pacientes)
	public int programarArea(){

	boolean comprobar=false;
	int op=0;

		do{
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("�En qu� �rea desea programar su nueva cita?");
		System.out.println("1.�rea de inform�tica.");
		System.out.println("2.�rea de atenci�n m�dica.");
		try{
		op = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
		System.out.println("Opci�n inv�lida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
	
		if(op!=1 & op!=2){
		System.out.println("Opci�n inv�lida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
	
		return op;
	}
	
	//Menu para escoger un a�o para la visualizaci�n de citas
	public int a�oCitaAsignada(){
		int a�o=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> A�o de sus citas.");
		System.out.println("Ingrese el a�o de la(s) cita(s) que quiere revisar.");
		System.out.println("Unicamente apartamos citas hasta el a�o 2020.");

		try{
		a�o = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(a�o<2018){
			System.out.println("Opci�n inv�lida. Este a�o ya ha transcurrido. Intente de nuevo.");
			comprobar=true;
		}
		if(a�o>2020){
			System.out.println("Opci�n inv�lida. No apartamos citas desp�es del a�o 2020. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		return a�o;
	}
	
	//Menu para escoger un mes para la visualizaci�n de citas
	public String mesCitaAsignada(int a�o){
		int op=0;
		String mes=null;
		boolean comprobar=false;
		
		do{
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Mes de sus citas.");
		System.out.println("Escoga el mes de la(s) cita(s) que desea revisar.");
		System.out.println("1.Enero.");
		System.out.println("2.Febrero.");
		System.out.println("3.Marzo.");
		System.out.println("4.Abril.");
		System.out.println("5.Mayo.");
		System.out.println("6.Junio.");
		System.out.println("7.Julio.");
		System.out.println("8.Agosto.");
		System.out.println("9.Septiembre.");
		System.out.println("10.Octubre.");
		System.out.println("11.Noviembre.");
		System.out.println("12.Diciembre.");
		
		try{
		op = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
		System.out.println("Opci�n inv�lida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
		
		switch(op){
			case 1: 
					mes = "Enero";
					break;
			case 2: 
					mes = "Febrero";
					break;
			case 3: 
					mes = "Marzo";
					break;
			case 4: 
					mes = "Abril";
					break;
			case 5: 
					mes = "Mayo";
					break;
			case 6: 
					mes = "Junio";
					break;
			case 7: 
					mes = "Julio";
					break;
			case 8: 
					mes = "Agosto";
					break;
			case 9: 
					mes = "Septiembre";
					break;
			case 10: 
					mes = "Octubre";
					break;
			case 11: 
					mes = "Noviembre";
					break;
			case 12: 
					mes = "Diciembre";
					break;

			default:
				System.out.println("Opci�n inv�lida. Intente de nuevo.");
				comprobar = true;
				break;
		}
		if(a�o==2018){
			if(op<=9){
				System.out.println("Opci�n inv�lida. Este mes ya ha transcurrido. Intente de nuevo.");
				comprobar=true;
			}
		}
		}while(comprobar);
		return mes;
	}
	
	//Menu para escoger visualizar una cita en concreto o un grupo de citas
	public int verTipoDeCita(){
		int opcion=0;
		boolean comprobar=false;
		do{
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("Si desea revisar una cita con una fecha espec�fica, presione 1.");
		System.out.println("O bien si desea ver todas las citas del mes del a�o seleccionado, presione 2.");
		
		try{
		opcion = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
		System.out.println("Opci�n inv�lida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
		if(opcion!=1 & opcion!=2){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
		}
		}while(opcion!=1 & opcion!=2);
		
		return opcion;
	}
	
	//Menu para escoger una fecha concreta para la visualizaci�n de la(s) cita(s)
	public int fechaCitaAsignada(){
		int fecha=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Fecha de sus citas.");
		System.out.println("�nicamente atendemos citas programadas los primeros 29 d�as del mes.");
		System.out.println("Ingrese la fecha (�nicamente el numeral del d�a)de la(s) cita(s) que desea revisar.");
		
		try{
		fecha = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opci�n inv�lida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(fecha>29 & fecha<=31){
			System.out.println("Opci�n inv�lida. En esta fecha no podemos atenderle.");
			comprobar=true;
		}
		
		if(fecha<=0 | fecha>31){
			System.out.println("Opci�n inv�lida. Fecha inexistente");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return fecha;
	}
	
}