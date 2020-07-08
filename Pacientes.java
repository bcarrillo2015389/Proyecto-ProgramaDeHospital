/*Subclase Pacientes*/
public class Pacientes extends Personas{
	public String carnet;
	public String fechaDeIngreso;
	
	//Constructor sin parametros
	public Pacientes(){
		super();
	}
	
	//Constructor parametrizado
	public Pacientes(String nombre,int edad,String nacionalidad,String sexo,String areaDeAtencion,String usuario,String contraseña,String carnet,String fechaDeIngreso){
		super(nombre,edad,nacionalidad,sexo,areaDeAtencion,usuario,contraseña);
		this.carnet=carnet;
		this.fechaDeIngreso=fechaDeIngreso;
	}
	
	public void showInformacion(){
		System.out.println("\n");				
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Su información registrada en el hospital es la siguiente: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad+" años");
		System.out.println("Nacionalidad: "+nacionalidad);
		System.out.println("Sexo: "+sexo);
		System.out.println("Area de atencion asignada: "+areaDeAtencion);
		System.out.println("Carnet: "+carnet);
		System.out.println("Fecha De Ingreso: "+fechaDeIngreso);
		System.out.println("\n");
		System.out.println("Si desea realizar un cambio o actualización de datos, \ndebe realizar un cita previa con el área de Informática del hospital.");
		System.out.println("Dicha cita la puede realizar por este medio o vía telefónica al 2233-8990.");
		System.out.println("---------------------------------------------------------------------------");
	}
}