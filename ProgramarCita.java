import java.util.ArrayList;
import java.util.Scanner;

/*En esta clase se define la dirección de tipo de cita, dependiendo los parámetros*/
public class ProgramarCita{
	Scanner scanner = new Scanner(System.in);
	public static ArrayList<CitaMedica> CitasMedicas = new ArrayList<CitaMedica>();
	public static ArrayList<CitaInformatica> CitasInformaticas = new ArrayList<CitaInformatica>();

	Menu menuOp = new Menu();
	
	public ProgramarCita(){}
	
	//Metodo para crear citas
	public int doNewCita(int area,int distinguidor){

		int replay=0;
	
		AreaDeInformatica informatica = new AreaDeInformatica();
		Clinicas clinica = new Clinicas();
	
		CitaMedica citaMedica = new CitaMedica();
		CitaInformatica citaInformatica = new CitaInformatica();
	
	
	//ÁREA DE INFORMATICA
	if(area==1){
		
	replay=informatica.citaInformatica(distinguidor);
	
		if(replay==0){
		
		citaInformatica = informatica.agregarCita();
		System.out.println("Guardando cita...");
		this.CitasInformaticas.add(citaInformatica);
		citaInformatica.showInformacion();
	
		}else if(replay==3){
		System.out.println("Usted ha cancelado la programación de su cita.");
		}
		
	//ÁREA MÉDICA
	}else if(area==2){
	replay =clinica.citaMedica();
	
		if(replay==0){
		
		citaMedica = clinica.agregarCita();
		System.out.println("Guardando cita...");
		this.CitasMedicas.add(citaMedica);
		citaMedica.showInformacion();
	
		}else if(replay==3){
			System.out.println("Usted ha cancelado la programación de su cita.");
		}
	}
		
	return replay;
	}
	
	//Metodo para visualizar las citas de un doctor
	public int showCitas(){
		CitaMedica citaMedica = new CitaMedica();
		Clinicas clinica = new Clinicas();
		
		int año=0;
		String mes;
		int fecha=0;
		int opcion=0;
		int contador=0;
		int replay=0;
		
		System.out.println("Usted ha escogido ver sus citas asignadas.");
		año = menuOp.añoCitaAsignada();
		mes = menuOp.mesCitaAsignada(año);
		opcion = menuOp.verTipoDeCita();
		
		if(opcion==2){
		
		for(int i=0;i<this.CitasMedicas.size();i++){
			if(Comprobante.doctorActual.nombre.equals(this.CitasMedicas.get(i).nombreDoctor)& año==this.CitasMedicas.get(i).año & mes.equals(this.CitasMedicas.get(i).mes)){
				this.CitasMedicas.get(i).showInformacion();
			}else{
				contador++;
			}
		}
			if(contador==this.CitasMedicas.size()){
			System.out.println("Aun no tiene citas programadas previamente para el mes del año escogidos.");
			}
		
		}else if(opcion==1){
				fecha = menuOp.fechaCitaAsignada();
		for(int i=0;i<this.CitasMedicas.size();i++){
			if(Comprobante.doctorActual.nombre.equals(this.CitasMedicas.get(i).nombreDoctor) & año==this.CitasMedicas.get(i).año & mes.equals(this.CitasMedicas.get(i).mes) & fecha==this.CitasMedicas.get(i).fecha){
				this.CitasMedicas.get(i).showInformacion();
			}else{
				contador++;
			}
		}
		
		if(contador==this.CitasMedicas.size()){
			System.out.println("Aun no tiene ninguna cita programada previamente para esta fecha.");
		}
		}
		
		return replay;
	}
	
}