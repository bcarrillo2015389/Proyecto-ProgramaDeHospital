/*Subclase Pacientes*/
public class Pacientes extends Personas{
	public String carnet;
	public String fechaDeIngreso;
	
	//Constructor sin parametros
	public Pacientes(){
		super();
	}
	
	//Constructor parametrizado
	public Pacientes(String nombre,int edad,String nacionalidad,String sexo,String areaDeAtencion,String usuario,String contrase�a,String carnet,String fechaDeIngreso){
		super(nombre,edad,nacionalidad,sexo,areaDeAtencion,usuario,contrase�a);
		this.carnet=carnet;
		this.fechaDeIngreso=fechaDeIngreso;
	}
	
	public void showInformacion(){
		System.out.println("\n");				
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Su informaci�n registrada en el hospital es la siguiente: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad+" a�os");
		System.out.println("Nacionalidad: "+nacionalidad);
		System.out.println("Sexo: "+sexo);
		System.out.println("Area de atencion asignada: "+areaDeAtencion);
		System.out.println("Carnet: "+carnet);
		System.out.println("Fecha De Ingreso: "+fechaDeIngreso);
		System.out.println("\n");
		System.out.println("Si desea realizar un cambio o actualizaci�n de datos, \ndebe realizar un cita previa con el �rea de Inform�tica del hospital.");
		System.out.println("Dicha cita la puede realizar por este medio o v�a telef�nica al 2233-8990.");
		System.out.println("---------------------------------------------------------------------------");
	}
}