/*Superclase Citas de CitaInformatica y CitaMedica*/
public class Citas{
	public int hora;
	public int minutos;
	public String area;
	public String mes;
	public int año;
	public int fecha;
	
	public Citas(){}
	
	public Citas(int hora,int minutos,String area,String mes,int año,int fecha){
		this.hora=hora;
		this.minutos=minutos;
		this.area=area;
		this.mes=mes;
		this.año=año;
		this.fecha=fecha;
		
	}
}