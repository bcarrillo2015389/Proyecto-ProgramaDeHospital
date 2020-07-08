import java.util.Scanner;

/*En esta clase se centran todo tipo de seleccion en menus*/
public class Menu{
	Scanner scanner = new Scanner(System.in);
	
	public Menu(){}
	
	//Opciones para el menu de Inicio de sesión
	public int getOpMainMenu(){
		boolean comprobar=false;
		int op=0;
		
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Escoga cómo desea iniciar sesión: ");
		System.out.println("1.Como paciente.");
		System.out.println("2.Como doctor.");
		System.out.println("3.Cancelar inicio de sesión.");
		
		try{
			op = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
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
		System.out.println("¿Qué desea realizar? Escoga una opción.");
		System.out.println("--------------------------------------");
		System.out.println("1.Ver mi informacion registrada en el hospital.");
		System.out.println("2.Programar una cita.");
		System.out.println("3.Cerrar sesión.");
	
		try{
			opcion = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
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
		System.out.println("¿Qué desea realizar? Escoga una opción.");
		System.out.println("--------------------------------------");
		System.out.println("1.Ver mi informacion registrada en el hospital.");
		System.out.println("2.Programar una cita con el área de informática.");
		System.out.println("3.Ver mis citas asignadas.");
		System.out.println("4.Cerrar sesión.");
	
		try{
			opcion = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return opcion;
	}
	
	//Menu para la realización de otra opcion
	public int replayMenu(){
		int replay=0;
		boolean comprobar=false;
		do{
				do{ 
				comprobar=false;
				System.out.println("\n");
				System.out.println("¿Desea realizar otra acción?");
				System.out.println("Presione 1 para Sí o 2 para No y Cerrar sesión.");
				try{
				replay = Integer.parseInt(scanner.nextLine());
				}catch(java.lang.NumberFormatException e){
				System.out.println("Opción inválida. Intente de nuevo.");
				comprobar=true;
				}
				}while(comprobar);
				
				if(replay!=1 & replay!=2){
				System.out.println("Opción inválida. Intente de nuevo.");	
				}
				
		}while(replay!=1 & replay!=2);
		
		if(replay==2){
			System.out.println("Cerrando sesión...");
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
				System.out.println("Si desde empezar desde cero la cita, presione 1, \nsi desde volver a escoger otra hora presione 2, \nsi desea cancelar la programación de la cita presione 3.");
				try{
				replay = Integer.parseInt(scanner.nextLine());
				}catch(java.lang.NumberFormatException e){
				System.out.println("Opción inválida. Intente de nuevo.");
				comprobar=true;
				}
				}while(comprobar);
				
				if(replay!=1 & replay!=2 & replay!=3){
				System.out.println("Opción inválida. Intente de nuevo.");	
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
		System.out.println("-> Asignación de hora (hrs.) a su cita.");
		System.out.println("Cosidere: Horario de atención: 10:00 - 13:00 hrs./ 14:00 - 17:00 hrs.");
		System.out.println("Ingrese únicamente el número de la hora(no minutos) que desea su cita.");
	
		try{ 
		hora = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(hora==13 | (hora>=0 & hora<10) | (hora>=17 & hora<=24)){
			System.out.println("Opción inválida. La hora no se encuentra dentro del horario de atención.");
			comprobar=true;
		}
		
		if(hora<0 | hora>24){
			System.out.println("Opción inválida. Esta hora es inexistente. Intente de nuevo.");
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
		System.out.println("-> Asignación de hora(minutos) a su cita");
		System.out.println("Unicamente atendemos citas en horario en punto, o con 30 minutos del inicio de la hora.");
		System.out.println("Ingrese 00 si desea que su hora sea en punto \n30 si desea que su cita sea tras 30 minutos de la hora escogida.");
		
		try{
		minutos = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if((minutos>0 & minutos<30) | (minutos>30 & minutos<=59)){
			System.out.println("Opción inválida. Los minutos no se encuentran dentro del horario de atención.");
			comprobar=true;
		}
		
		if(minutos<0 | minutos>=60){
			System.out.println("Opción inválida. No está ingresando números válidos para minutos.");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return minutos;
	}
	
	//Menu para escoger una fecha(numeral de día)
	public int escogerFecha(){
		int fecha=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignación de fecha del día de su cita.");
		System.out.println("Únicamente atendemos citas programadas los primeros 29 días del mes.");
		System.out.println("Ingrese la fecha (únicamente el numeral del día) que desea realizar la cita.");
		
		try{
		fecha = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(fecha>29 & fecha<=31){
			System.out.println("Opción inválida. En esta fecha no podemos atenderle.");
			comprobar=true;
		}
		
		if(fecha<=0 | fecha>31){
			System.out.println("Opción inválida. Fecha inexistente");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return fecha;
	}
	
	//Menu para escoger un año
	public int escogerAño(){
		int año=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignación del año de su cita.");
		System.out.println("Ingrese el año en que desea realizar la cita.");
		System.out.println("Unicamente apartamos citas hasta el año 2020.");

		try{
		año = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(año<2018){
			System.out.println("Opción inválida. Este año ya ha transcurrido. Intente de nuevo.");
			comprobar=true;
		}
		if(año>2020){
			System.out.println("Opción inválida. No apartamos citas despúes del año 2020. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		return año;
	}
	
	//Menu para escoger un mes
	public String escogerMes(int año){
		int op=0;
		String mes=null;
		boolean comprobar=false;
		
		do{
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Asignación del mes de su cita.");
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
		System.out.println("Opción inválida. Intente de nuevo.");
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
				System.out.println("Opción inválida. Intente de nuevo.");
				comprobar = true;
				break;
		}
		if(año==2018){
			if(op<=9){
				System.out.println("Opción inválida. Este mes ya ha transcurrido. Intente de nuevo.");
				comprobar=true;
			}
		}
		}while(comprobar);
		return mes;
	}
	
	//Menu para escoger el área de la cita(pacientes)
	public int programarArea(){

	boolean comprobar=false;
	int op=0;

		do{
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("¿En qué área desea programar su nueva cita?");
		System.out.println("1.Área de informática.");
		System.out.println("2.Área de atención médica.");
		try{
		op = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
		System.out.println("Opción inválida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
	
		if(op!=1 & op!=2){
		System.out.println("Opción inválida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
	
		return op;
	}
	
	//Menu para escoger un año para la visualización de citas
	public int añoCitaAsignada(){
		int año=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Año de sus citas.");
		System.out.println("Ingrese el año de la(s) cita(s) que quiere revisar.");
		System.out.println("Unicamente apartamos citas hasta el año 2020.");

		try{
		año = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(año<2018){
			System.out.println("Opción inválida. Este año ya ha transcurrido. Intente de nuevo.");
			comprobar=true;
		}
		if(año>2020){
			System.out.println("Opción inválida. No apartamos citas despúes del año 2020. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		return año;
	}
	
	//Menu para escoger un mes para la visualización de citas
	public String mesCitaAsignada(int año){
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
		System.out.println("Opción inválida. Intente de nuevo.");
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
				System.out.println("Opción inválida. Intente de nuevo.");
				comprobar = true;
				break;
		}
		if(año==2018){
			if(op<=9){
				System.out.println("Opción inválida. Este mes ya ha transcurrido. Intente de nuevo.");
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
		System.out.println("Si desea revisar una cita con una fecha específica, presione 1.");
		System.out.println("O bien si desea ver todas las citas del mes del año seleccionado, presione 2.");
		
		try{
		opcion = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
		System.out.println("Opción inválida. Intente de nuevo.");
		comprobar=true;
		}
		}while(comprobar);
		if(opcion!=1 & opcion!=2){
			System.out.println("Opción inválida. Intente de nuevo.");
		}
		}while(opcion!=1 & opcion!=2);
		
		return opcion;
	}
	
	//Menu para escoger una fecha concreta para la visualización de la(s) cita(s)
	public int fechaCitaAsignada(){
		int fecha=0;
		boolean comprobar = false;
		
		do{ 
		do{
		comprobar=false;
		System.out.println("\n");
		System.out.println("-> Fecha de sus citas.");
		System.out.println("Únicamente atendemos citas programadas los primeros 29 días del mes.");
		System.out.println("Ingrese la fecha (únicamente el numeral del día)de la(s) cita(s) que desea revisar.");
		
		try{
		fecha = Integer.parseInt(scanner.nextLine());
		}catch(java.lang.NumberFormatException e){
			System.out.println("Opción inválida. Intente de nuevo.");
			comprobar=true;
		}
		}while(comprobar);
		
		if(fecha>29 & fecha<=31){
			System.out.println("Opción inválida. En esta fecha no podemos atenderle.");
			comprobar=true;
		}
		
		if(fecha<=0 | fecha>31){
			System.out.println("Opción inválida. Fecha inexistente");
			comprobar=true;
		}
		
		}while(comprobar);
		
		return fecha;
	}
	
}