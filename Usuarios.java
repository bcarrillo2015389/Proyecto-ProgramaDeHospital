import java.util.ArrayList;
/*Aquí se centran los datos de los usuarios registrados*/
public class Usuarios{
	
	Comprobante	comprobante = new Comprobante();
	public static ArrayList<Doctores> ListaDoctores  = new ArrayList<Doctores>();
	public static ArrayList<Pacientes> ListaPacientes = new ArrayList<Pacientes>();
	Lobby lobby = new Lobby();
	boolean verificacion=false;
	
	//Simulación base de datos
	
	//Creacion de los medicos
	public static Doctores doctor1 = new Doctores("John McDanields",35,"Canadiense","Masculino","Cardiología","drJMacDanields","uIPtyIop","0201-13",1);
	public static Doctores doctor2 = new Doctores("Andrea Herrera",27,"Guatemalteca","Femenino","Medicina general","draAHerrera","iuY690g2","0201-10",2);
	public static Doctores doctor3 = new Doctores("Gabriela Carrillo",21,"Guatemalteca","Femenino","Gastrología","draGCarrillo","hst67Gnb","0201-33",3);
	public static Doctores doctor4 = new Doctores("Juan Silva",54,"Mexicano","Masculino","Odontología","drJSilva","a56Yhgdt","0201-77",4);
	
	//Creacion de los pacientes
	public static Pacientes paciente1 = new Pacientes("Manuel Funes",20,"Guatemalteco","Masculino","Cardiología","ptMFunes0911","yT987Jki","0202-20","12/10/2011");
	public static Pacientes paciente2 = new Pacientes("Juana Bautista",34,"Salvadoreña","Femenino","Medicina general","ptJBautista8012","asE879dj","0202-01","04/03/2018");
	public static Pacientes paciente3 = new Pacientes("Carlos Cabello",44,"Cubano","Masculino","Gastrología","ptCCabello9070","1a3SD45t","0202-56","22/11/2013");
	public static Pacientes paciente4 = new Pacientes("Jorge Sanchez",32,"Guatemalteco","Masculino","Odontología","ptJSanchez8769","as6hUi0o","0202-90","13/12/2017");
	
	
	//Constructor
	public Usuarios(){}

	//Metodo para activar la simulación de base de datos
	public static void activarBaseDeDatos(){
		ListaDoctores.add(doctor1);
		ListaDoctores.add(doctor2);
		ListaDoctores.add(doctor3);
		ListaDoctores.add(doctor4);
		
		ListaPacientes.add(paciente1);
		ListaPacientes.add(paciente2);
		ListaPacientes.add(paciente3);
		ListaPacientes.add(paciente4);
	}
	
	//Metodo selectUsuario
	public boolean selectUsuario(int op){
	
	if(op==1){
		//Verificar el usuario ingresado
		this.verificacion = comprobante.verificarUsuarioPaciente(this.ListaPacientes);
	
	if(this.verificacion==true){
		//Verificar la contraseña ingresada
		this.verificacion = comprobante.verificarContraseña(op);
	}
	//Si falla el inicio de sesion
	if(this.verificacion==false){
		System.out.println("\n");
		System.out.println("Usted ha excedido el máximo de intentos permitos.");
		System.out.println("Corrobore que su usuario y contraseña sean los correctos \ny vuelva a intentar iniciar sesión.");	
	}
	
	}else if(op==2){
		//Verificar el usuario ingresado
		this.verificacion = comprobante.verificarUsuarioDoctor(this.ListaDoctores);
	
	if(this.verificacion==true){
		//Verificar la contraseña ingresada
		this.verificacion = comprobante.verificarContraseña(op);
	}
	if(this.verificacion==false){
		//Si falla el inicio de sesion
		System.out.println("\n");
		System.out.println("Usted ha excedido el máximo de intentos permitos.");
		System.out.println("Corrobore que su usuario y contraseña sean los correctos \ny vuelva a intentar iniciar sesión.");
	}
	}
		return this.verificacion;
	}
	
	//Metodo para ir a Lobby
	public boolean goToUsuario(int op){
		boolean sesion=true;
		if(op==1){
			sesion=lobby.goToPaciente(comprobante.pacienteActual);
		}else if(op==2){
			sesion=lobby.goToDoctor(comprobante.doctorActual);
		}
		return sesion;
	}
}