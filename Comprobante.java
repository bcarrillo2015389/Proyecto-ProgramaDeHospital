import java.util.Scanner;
import java.util.ArrayList;

/*Aquí se corrobora si el usuario y la contraseña son correctos*/
public class Comprobante{
	
	Scanner scanner = new Scanner(System.in);
	public static ArrayList<Doctores> ListaDoctores = new ArrayList<Doctores>();
	public static ArrayList<Pacientes> ListaPacientes = new ArrayList<Pacientes>();
	
	public static Pacientes pacienteActual = new Pacientes();
	public static Doctores doctorActual = new Doctores();
	
	//Constructor
	public Comprobante(){}
	
	//Verificar el usuario paciente
	public boolean verificarUsuarioPaciente(ArrayList<Pacientes> ListaPacientes){
		this.ListaPacientes = ListaPacientes;
	
		int oportunidades = 3;
		String us = null;
		int contador=0;
		boolean verificacion=false;
	
	System.out.println("Usted ha escogido ingresar como paciente.");
	
	do{
	contador=0;
	System.out.println("\n");
	System.out.println("Ingrese su usuario.");
	us = scanner.nextLine();
	
	for(int i=0;i<this.ListaPacientes.size();i++){
		
		if(us.equals(this.ListaPacientes.get(i).usuario)){
			System.out.println("Nombre de usuario correcto.");
			this.pacienteActual = this.ListaPacientes.get(i);
			verificacion=true;
		}else if(!us.equals(this.ListaPacientes.get(i).usuario)){
			++contador;
		}
	}
		--oportunidades;
	
	if(contador == this.ListaPacientes.size()){
	System.out.println("Nombre de usuario incorrecto.");
		if(oportunidades!=0){
		System.out.println("Intente de nuevo.");
		}
	verificacion=false;
	}
	}while(contador!=0 & oportunidades!=0 & verificacion==false);
	
	return verificacion;
	}
	
	//Verificar el usuario doctor
	public boolean verificarUsuarioDoctor(ArrayList<Doctores> ListaDoctores){
		this.ListaDoctores = ListaDoctores;
		
		int oportunidades = 3;
		String us = null;
		int contador=0;
		boolean verificacion=false;
	
	System.out.println("Usted ha escogido ingresar como médico.");
	
	do{
	contador=0;
	System.out.println("\n");
	System.out.println("Ingrese su usuario.");
	us = scanner.nextLine();
	
	for(int i=0;i<this.ListaDoctores.size();i++){
		
		if(us.equals(this.ListaDoctores.get(i).usuario)){
			System.out.println("Nombre de usuario correcto.");
			this.doctorActual = this.ListaDoctores.get(i);
			verificacion=true;
		}else if(!us.equals(this.ListaDoctores.get(i).usuario)){
			++contador;
		}
	}
	--oportunidades;
	if(contador==ListaDoctores.size()){
	System.out.println("Nombre de usuario incorrecto.");
		if(oportunidades!=0){
			System.out.println("Intente de nuevo.");
		}
	verificacion=false;
	}
	}while(contador!=0 & oportunidades!=0 & verificacion==false);
	
	return verificacion;	
	}
	
	//Verificar la contraseña ingresada con el tipo de usuario
	public boolean verificarContraseña(int op){
		
	int oportunidades = 3;
	String us = null;
	boolean verificacion=false;
	
	do{
	--oportunidades;
	if(op==1){
		System.out.println("\n");
		System.out.println("Ingrese su contraseña.");
			us = scanner.nextLine();
		if(us.equals(this.pacienteActual.contraseña)){
			System.out.println("Contraseña correcta.");
			verificacion = true;
		}else if(!us.equals(this.pacienteActual.contraseña)){
			System.out.println("Contraseña incorrecta.");
			verificacion=false;
			if(oportunidades!=0){
			System.out.println("Intente de nuevo.");
			}
		}
		
	}else if(op==2){
		System.out.println("\n");
		System.out.println("Ingrese su contraseña.");
		us = scanner.nextLine();
		if(us.equals(this.doctorActual.contraseña)){
			System.out.println("Contraseña correcta.");
			verificacion = true;
		}else if(!us.equals(this.doctorActual.contraseña)){
			System.out.println("Contraseña incorrecta.");
			verificacion=false;
			if(oportunidades!=0){
			System.out.println("Intente de nuevo.");
			}
		}
	}
	
	}while(verificacion==false & oportunidades!=0);
	
	return verificacion;
	}
}