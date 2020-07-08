import java.util.Random;
import java.math.BigInteger;

/*Clase CitaMedica (modelo de cita)*/
public class CitaMedica extends Citas{
	Random rand = new Random();
	BigInteger numTrans = new BigInteger(50, rand);
	
	public String nombreDoctor;
	public String nombrePaciente;
	public int noClinica;
	
	public CitaMedica(){
		super();
	}

	public CitaMedica(int hora,int minutos,String area,String mes,int a�o,int fecha,String nombreDoctor,int noClinica,String nombrePaciente){
		super(hora,minutos,area,mes,a�o,fecha);
		this.nombreDoctor=nombreDoctor;
		this.noClinica=noClinica;
		this.nombrePaciente=nombrePaciente;
	}
	
	public void showInformacion(){
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("-> Cita programada correctamente. no de serie: "+numTrans);
		System.out.println("");
		System.out.println("A continuaci�n se presenta la informaci�n referente:");
		System.out.println("Persona quien solicit� la cita: "+nombrePaciente);
		if(minutos==0){
		System.out.println("Hora: "+hora+":"+ minutos + minutos +" hrs.");
		}else if(minutos==30){
		System.out.println("Hora: "+hora+":"+ minutos +" hrs.");
		}
		System.out.println("Area de atenci�n: "+area);
		System.out.println("N�mero de cl�nica para la cita: "+ noClinica);
		System.out.println("Medico que le atendera: "+ nombreDoctor);
		System.out.println("Fecha: "+fecha+" de " + mes + " del a�o "+ a�o);
		System.out.println("Debe presentarse como m�nimo 15 minutos antes de la hora de su cita en el �rea de informaci�n del hospital.");
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
}