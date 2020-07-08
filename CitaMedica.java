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

	public CitaMedica(int hora,int minutos,String area,String mes,int año,int fecha,String nombreDoctor,int noClinica,String nombrePaciente){
		super(hora,minutos,area,mes,año,fecha);
		this.nombreDoctor=nombreDoctor;
		this.noClinica=noClinica;
		this.nombrePaciente=nombrePaciente;
	}
	
	public void showInformacion(){
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("-> Cita programada correctamente. no de serie: "+numTrans);
		System.out.println("");
		System.out.println("A continuación se presenta la información referente:");
		System.out.println("Persona quien solicitó la cita: "+nombrePaciente);
		if(minutos==0){
		System.out.println("Hora: "+hora+":"+ minutos + minutos +" hrs.");
		}else if(minutos==30){
		System.out.println("Hora: "+hora+":"+ minutos +" hrs.");
		}
		System.out.println("Area de atención: "+area);
		System.out.println("Número de clínica para la cita: "+ noClinica);
		System.out.println("Medico que le atendera: "+ nombreDoctor);
		System.out.println("Fecha: "+fecha+" de " + mes + " del año "+ año);
		System.out.println("Debe presentarse como mínimo 15 minutos antes de la hora de su cita en el área de información del hospital.");
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
}