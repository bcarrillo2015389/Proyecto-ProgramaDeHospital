/*Subclase Doctores*/
public class Doctores extends Personas{
	public String matricula;
	public int noClinica;
	
	//Constructor sin parametros
	public Doctores(){
		super();
	}
	
	//Constructor parametrizado
	public Doctores(String nombre,int edad,String nacionalidad,String sexo,String areaDeAtencion,String usuario,String contrase�a,String matricula,int noClinica){
		super(nombre,edad,nacionalidad,sexo,areaDeAtencion,usuario,contrase�a);
		this.matricula=matricula;
		this.noClinica=noClinica;
	}
	
	public void showInformacion(){
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Su informaci�n registrada en el hospital es la siguiente: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad+" a�os");
		System.out.println("Nacionalidad: "+nacionalidad);
		System.out.println("Sexo: "+sexo);
		System.out.println("Area de atencion: "+areaDeAtencion);
		System.out.println("Matricula: "+matricula);
		System.out.println("N�mero de cl�nica asignada para citas: "+noClinica);
		System.out.println("\n");
		System.out.println("Si desea realizar un cambio o actualizaci�n de datos, \ndebe realizar un cita previa con el �rea de Inform�tica del hospital.");
		System.out.println("Dicha cita la puede realizar por este medio o abocandose al �rea de inform�tica.");
		System.out.println("---------------------------------------------------------------------------");
	}
}