/*En esta clase se crean las citas medicas, se verifica que no concuerde con otras*/
public class Clinicas{

	Menu menuOp = new Menu();
	Comprobante comprobar = new Comprobante();
	public CitaMedica cita;
	public int noClinica;
	
	//Simulación base de datos
		public static CitaMedica cita1 = new CitaMedica(15,30,"Cardiología","Octubre",2018,23,"John McDanields",1,"Manuel Funes");
		public static CitaMedica cita2 = new CitaMedica(16,0,"Gastrología","Enero",2019,9,"Gabriela Carrillo",2,"Carlos Cabello");
		public static CitaMedica cita3 = new CitaMedica(10,30,"Odontología","Diciembre",2019,12,"Juan Silva",3,"Jorge Sanchez");
		public static CitaMedica cita4 = new CitaMedica(15,0,"Medicina general","Noviembre",2018,23,"Andrea Herrera",4,"Juana Bautista");
		public static CitaMedica cita5 = new CitaMedica(11,0,"Cardiología","Enero",2019,13,"John McDanields",1,"Manuel Funes");
		public static CitaMedica cita6 = new CitaMedica(16,30,"Gastrología","Noviembre",2018,28,"Gabriela Carrillo",2,"Carlos Cabello");
		public static CitaMedica cita7 = new CitaMedica(10,0,"Odontología","Marzo",2019,11,"Juan Silva",3,"Jorge Sanchez");
		public static CitaMedica cita8 = new CitaMedica(14,30,"Medicina general","Diciembre",2018,17,"Andrea Herrera",4,"Juana Bautista");
	
	public Clinicas(){}
	
	//Metodo para activar la simulación de base de datos
	public static void activarBaseDeDatos(){
		ProgramarCita.CitasMedicas.add(cita1);
		ProgramarCita.CitasMedicas.add(cita2);
		ProgramarCita.CitasMedicas.add(cita3);
		ProgramarCita.CitasMedicas.add(cita4);
		ProgramarCita.CitasMedicas.add(cita5);
		ProgramarCita.CitasMedicas.add(cita6);
		ProgramarCita.CitasMedicas.add(cita7);
		ProgramarCita.CitasMedicas.add(cita8);
	}
	
	//Creación de los argumentos para la cita 
	public int citaMedica(){
		String area=null;
		boolean comprobar=false;
		int hora;
		int minutos;
		int fecha;
		String mes;
		int año;
		int replay;
		String nombreDoctor=null;
		String nombrePaciente=null;
		
		CitaMedica citaActual;
		
		System.out.println("Usted ha escogido programar un cita con el área de atención médica. ");
		System.out.println("Por este medio únicamente puede realizar citas a su área previamente asignada.");

		do{
		replay=0;
		nombrePaciente=Comprobante.pacienteActual.nombre;
		area = Comprobante.pacienteActual.areaDeAtencion;
		año = this.menuOp.escogerAño();
		mes = this.menuOp.escogerMes(año);
		fecha = this.menuOp.escogerFecha();
		
		for(int i=0;i<Usuarios.ListaDoctores.size();i++){
				if(area.equals(Usuarios.ListaDoctores.get(i).areaDeAtencion)){
					nombreDoctor = Usuarios.ListaDoctores.get(i).nombre;
					this.noClinica = Usuarios.ListaDoctores.get(i).noClinica;
					
					i=Usuarios.ListaDoctores.size();
				}
		}
		
		do{
		replay=0;
		comprobar=false;
		hora = this.menuOp.escogerHora();
		minutos = this.menuOp.escogerMinutos();
		for(int i=0;i<ProgramarCita.CitasMedicas.size();i++){
			if(año==ProgramarCita.CitasMedicas.get(i).año & fecha==ProgramarCita.CitasMedicas.get(i).fecha & hora == ProgramarCita.CitasMedicas.get(i).hora & minutos == ProgramarCita.CitasMedicas.get(i).minutos & mes.equals(ProgramarCita.CitasMedicas.get(i).mes)& area.equals(ProgramarCita.CitasMedicas.get(i).area)){
			System.out.println("!Lo sentimos!, pero los datos ingresados concuerdan con una cita ya programada por alguien más.");
			replay = this.menuOp.continuacionCita();
			i=ProgramarCita.CitasMedicas.size();
			}
		}
		}while(replay==2);
		}while(replay==1);
		
		if(replay==0){
			citaActual = new CitaMedica(hora,minutos,area,mes,año,fecha,nombreDoctor,this.noClinica,nombrePaciente);
			this.cita=citaActual;
		}
		
		return replay;
	}
	
	//Devuelve la cita creada
	public CitaMedica agregarCita(){
		return this.cita;
	}
}