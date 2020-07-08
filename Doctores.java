/*Subclase Doctores*/
public class Doctores extends Personas{
	public String matricula;
	public int noClinica;
	
	//Constructor sin parametros
	public Doctores(){
		super();
	}
	
	//Constructor parametrizado
	public Doctores(String nombre,int edad,String nacionalidad,String sexo,String areaDeAtencion,String usuario,String contraseña,String matricula,int noClinica){
		super(nombre,edad,nacionalidad,sexo,areaDeAtencion,usuario,contraseña);
		this.matricula=matricula;
		this.noClinica=noClinica;
	}
	
	public void showInformacion(){
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Su información registrada en el hospital es la siguiente: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad+" años");
		System.out.println("Nacionalidad: "+nacionalidad);
		System.out.println("Sexo: "+sexo);
		System.out.println("Area de atencion: "+areaDeAtencion);
		System.out.println("Matricula: "+matricula);
		System.out.println("Número de clínica asignada para citas: "+noClinica);
		System.out.println("\n");
		System.out.println("Si desea realizar un cambio o actualización de datos, \ndebe realizar un cita previa con el área de Informática del hospital.");
		System.out.println("Dicha cita la puede realizar por este medio o abocandose al área de informática.");
		System.out.println("---------------------------------------------------------------------------");
	}
}