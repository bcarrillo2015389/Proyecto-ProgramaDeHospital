import java.util.Random;
import java.math.BigInteger;

/*Clase CitaInformatica (modelo de cita)*/
public class CitaInformatica extends Citas{
	Random rand = new Random();
	BigInteger numTrans = new BigInteger(50, rand);
	
	public String nombre;
	
	public CitaInformatica(){
		super();
	}
	
	public CitaInformatica(int hora,int minutos,String area,String mes,int a�o,int fecha,String nombre){
		super(hora,minutos,area,mes,a�o,fecha);
		this.nombre=nombre;
	}
	
	public void showInformacion(){
		System.out.println("\n");		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("-> Cita programada correctamente. no de serie: "+numTrans);
		System.out.println("A continuaci�n se presenta la informaci�n referente:");
		System.out.println("Persona quien solicit� la cita: "+nombre);
		if(minutos==0){
		System.out.println("Hora: "+hora+":"+ minutos + minutos +" hrs.");
		}else if(minutos==30){
		System.out.println("Hora: "+hora+":"+ minutos +" hrs.");
		}
		System.out.println("Area de atencion: "+area);
		System.out.println("Fecha: "+fecha+" de " + mes + " del a�o "+ a�o);
		System.out.println("Debe presentarse como m�nimo 15 minutos antes de la hora de su cita en el �rea de informaci�n del hospital.");
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
}