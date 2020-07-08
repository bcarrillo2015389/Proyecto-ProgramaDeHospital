import java.util.Scanner;

/*En esta clase se determinan las acciones que pueden tomar los usuarios*/
public class Lobby{
	Scanner scanner = new Scanner(System.in);
	Pacientes pacienteActual = new Pacientes();
	Doctores doctorActual = new Doctores();
	Menu menuOpcion = new Menu();
	ProgramarCita nuevaCita = new ProgramarCita();
	
	public Lobby(){}
	
	//Opciones de realización para un paciente
	public boolean goToPaciente(Pacientes pacienteActual){
		int op=0;
		int replay=0;
		int area=0;
		int distinguidor=1;
		boolean sesion=true;
		
		this.pacienteActual = pacienteActual;
		if(this.pacienteActual.sexo.equals("Masculino")){
			System.out.println("\n");
			System.out.println("Ingresando...");
			System.out.println("-------------------------------------------------");
			System.out.println("Bienvenido: "+ this.pacienteActual.nombre + ", a su cuenta de usuario.");
		}else if(this.pacienteActual.sexo.equals("Femenino")){
			System.out.println("\n");
			System.out.println("Ingresando...");
			System.out.println("-------------------------------------------------");
			System.out.println("Bienvenida: "+ this.pacienteActual.nombre + ", a su cuenta de usuario.");
		}
		
		do{
		replay=0;
		op = menuOpcion.getOpcionParaPaciente();
		switch(op){
			case 1:
					pacienteActual.showInformacion();
					replay = menuOpcion.replayMenu();
					if(replay==2){
					sesion=false;
					}
					break;
			case 2: 
					System.out.println("\n");
					System.out.println("---------------------");
					System.out.println("Programación de citas.");
					System.out.println("---------------------");
					area = menuOpcion.programarArea();
					replay = nuevaCita.doNewCita(area,distinguidor);
					if(replay==0){
					replay = menuOpcion.replayMenu();
					if(replay==2){
						sesion=false;
					}
					}
			
					break;
			case 3:
					System.out.println("Cerrando sesión...");
					System.out.println("Que pase buen dia.");
					sesion=false;
					break;
			
			default:
					System.out.println("Opción inválida. Intente de nuevo.");
					break;
		}	
		}while(op!=1&op!=2&op!=3 | replay==1 | replay==3);
		
		return sesion;
	}
	
	
	//Opciones de realización para un paciente
	public boolean goToDoctor(Doctores doctorActual){
		int op=0;
		int replay=0;
		int distinguidor=2;
		boolean sesion=true;
		
		this.doctorActual = doctorActual;
		if(this.doctorActual.sexo.equals("Masculino")){
			System.out.println("Ingresando...");
			System.out.println("-------------------------------------------------");
			System.out.println("Bienvenido: Dr."+ this.doctorActual.nombre + " a su cuenta de usuario.");
		}else if(doctorActual.sexo.equals("Femenino")){
			System.out.println("Ingresando...");
			System.out.println("-------------------------------------------------");
			System.out.println("Bienvenida: Dra."+ this.doctorActual.nombre + " a su cuenta de usuario.");
		}
	
		do{
		op = menuOpcion.getOpcionParaDoctor();
		switch(op){
			case 1:
					doctorActual.showInformacion();
					replay = menuOpcion.replayMenu();
					if(replay==2){
						sesion=false;
					}
					break;
			case 2: 
					System.out.println("\n");
					System.out.println("---------------------");
					System.out.println("Programación de citas.");
					System.out.println("---------------------");
					replay = nuevaCita.doNewCita(1,distinguidor);
					if(replay==0){
					replay = menuOpcion.replayMenu();
					if(replay==2){
					sesion=false;
					}
					}
					break;
			case 3:
					replay = nuevaCita.showCitas();
					if(replay==0){
					replay = menuOpcion.replayMenu();
					if(replay==2){
					sesion=false;
					}
					}
					break;
					
			case 4:
					System.out.println("Cerrando sesión...");
					System.out.println("Que pase buen dia.");
					sesion=false;
					break;
			
			default:
					System.out.println("Opción inválida. Intente de nuevo.");
					break;
		}	
		}while(op!=1&op!=2&op!=3&op!=4 | replay==1);
		
		return sesion;
		
	}
}