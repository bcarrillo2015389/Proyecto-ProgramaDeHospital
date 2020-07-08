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
	
	public CitaInformatica(int hora,int minutos,String area,String mes,int año,int fecha,String nombre){
		super(hora,minutos,area,mes,año,fecha);
		this.nombre=nombre;
	}
	
	public void showInformacion(){
		System.out.println("\n");		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("-> Cita programada correctamente. no de serie: "+numTrans);
		System.out.println("A continuación se presenta la información referente:");
		System.out.println("Persona quien solicitó la cita: "+nombre);
		if(minutos==0){
		System.out.println("Hora: "+hora+":"+ minutos + minutos +" hrs.");
		}else if(minutos==30){
		System.out.println("Hora: "+hora+":"+ minutos +" hrs.");
		}
		System.out.println("Area de atencion: "+area);
		System.out.println("Fecha: "+fecha+" de " + mes + " del año "+ año);
		System.out.println("Debe presentarse como mínimo 15 minutos antes de la hora de su cita en el área de información del hospital.");
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
}