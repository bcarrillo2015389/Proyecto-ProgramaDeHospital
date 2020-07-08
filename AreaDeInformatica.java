/*En esta clase se crean las citas en el �rea de inform�tica, se verifica que no concuerde con otras*/
public class AreaDeInformatica{
	Menu menuOp = new Menu();
	
	//Simulaci�n base de datos
	public static CitaInformatica cita1 = new CitaInformatica(15,30,"Informatica","Octubre",2018,23,"Carlos Cabello");
	public static CitaInformatica cita2 = new CitaInformatica(16,0,"Informatica","Enero",2019,9,"Juan Silva");
	public CitaInformatica cita;
	
	public AreaDeInformatica(){}
	
	//Metodo para activar la simulaci�n de base de datos
	public static void activarBaseDeDatos(){
		ProgramarCita.CitasInformaticas.add(cita1);
		ProgramarCita.CitasInformaticas.add(cita2);
	}
	
	//Creaci�n de los argumentos para la cita 
	public int citaInformatica(int distinguidor){
		String area="Informatica";
		boolean comprobar=false;
		int hora;
		int minutos;
		int fecha;
		String mes;
		String nombre=null;
		int a�o;
		int replay;
		
		CitaInformatica citaActual;

		System.out.println("Usted ha escogido programar un cita con el �rea de inform�tica. ");

		do{
		replay=0;
		
			if(distinguidor==1){
				nombre=Comprobante.pacienteActual.nombre;
			}else if(distinguidor==2){
			nombre=Comprobante.doctorActual.nombre;
			}
			
		a�o = this.menuOp.escogerA�o();
		mes = this.menuOp.escogerMes(a�o);
		fecha = this.menuOp.escogerFecha();
		
		do{
		replay=0;
		comprobar=false;
		hora = this.menuOp.escogerHora();
		minutos = this.menuOp.escogerMinutos();
		for(int i=0;i<ProgramarCita.CitasInformaticas.size();i++){
			if(a�o==ProgramarCita.CitasInformaticas.get(i).a�o & fecha==ProgramarCita.CitasInformaticas.get(i).fecha & hora == ProgramarCita.CitasInformaticas.get(i).hora & minutos == ProgramarCita.CitasInformaticas.get(i).minutos & mes.equals(ProgramarCita.CitasInformaticas.get(i).mes)){
			System.out.println("!Lo sentimos!, pero los datos ingresados concuerdan con una cita ya programada por alguien m�s.");
			replay = this.menuOp.continuacionCita();
			i=ProgramarCita.CitasInformaticas.size();
			}
		}
		}while(replay==2);
		}while(replay==1);
		
		if(replay==0){
			citaActual = new CitaInformatica(hora,minutos,area,mes,a�o,fecha,nombre);
			this.cita=citaActual;
		}
		
		return replay;
	}
	
	//Devuelve la cita creada
	public CitaInformatica agregarCita(){
		return this.cita;
	}
}