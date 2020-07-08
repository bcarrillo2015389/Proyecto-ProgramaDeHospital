/*En esta clase se crean las citas medicas, se verifica que no concuerde con otras*/
public class Clinicas{

	Menu menuOp = new Menu();
	Comprobante comprobar = new Comprobante();
	public CitaMedica cita;
	public int noClinica;
	
	//Simulaci�n base de datos
		public static CitaMedica cita1 = new CitaMedica(15,30,"Cardiolog�a","Octubre",2018,23,"John McDanields",1,"Manuel Funes");
		public static CitaMedica cita2 = new CitaMedica(16,0,"Gastrolog�a","Enero",2019,9,"Gabriela Carrillo",2,"Carlos Cabello");
		public static CitaMedica cita3 = new CitaMedica(10,30,"Odontolog�a","Diciembre",2019,12,"Juan Silva",3,"Jorge Sanchez");
		public static CitaMedica cita4 = new CitaMedica(15,0,"Medicina general","Noviembre",2018,23,"Andrea Herrera",4,"Juana Bautista");
		public static CitaMedica cita5 = new CitaMedica(11,0,"Cardiolog�a","Enero",2019,13,"John McDanields",1,"Manuel Funes");
		public static CitaMedica cita6 = new CitaMedica(16,30,"Gastrolog�a","Noviembre",2018,28,"Gabriela Carrillo",2,"Carlos Cabello");
		public static CitaMedica cita7 = new CitaMedica(10,0,"Odontolog�a","Marzo",2019,11,"Juan Silva",3,"Jorge Sanchez");
		public static CitaMedica cita8 = new CitaMedica(14,30,"Medicina general","Diciembre",2018,17,"Andrea Herrera",4,"Juana Bautista");
	
	public Clinicas(){}
	
	//Metodo para activar la simulaci�n de base de datos
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
	
	//Creaci�n de los argumentos para la cita 
	public int citaMedica(){
		String area=null;
		boolean comprobar=false;
		int hora;
		int minutos;
		int fecha;
		String mes;
		int a�o;
		int replay;
		String nombreDoctor=null;
		String nombrePaciente=null;
		
		CitaMedica citaActual;
		
		System.out.println("Usted ha escogido programar un cita con el �rea de atenci�n m�dica. ");
		System.out.println("Por este medio �nicamente puede realizar citas a su �rea previamente asignada.");

		do{
		replay=0;
		nombrePaciente=Comprobante.pacienteActual.nombre;
		area = Comprobante.pacienteActual.areaDeAtencion;
		a�o = this.menuOp.escogerA�o();
		mes = this.menuOp.escogerMes(a�o);
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
			if(a�o==ProgramarCita.CitasMedicas.get(i).a�o & fecha==ProgramarCita.CitasMedicas.get(i).fecha & hora == ProgramarCita.CitasMedicas.get(i).hora & minutos == ProgramarCita.CitasMedicas.get(i).minutos & mes.equals(ProgramarCita.CitasMedicas.get(i).mes)& area.equals(ProgramarCita.CitasMedicas.get(i).area)){
			System.out.println("!Lo sentimos!, pero los datos ingresados concuerdan con una cita ya programada por alguien m�s.");
			replay = this.menuOp.continuacionCita();
			i=ProgramarCita.CitasMedicas.size();
			}
		}
		}while(replay==2);
		}while(replay==1);
		
		if(replay==0){
			citaActual = new CitaMedica(hora,minutos,area,mes,a�o,fecha,nombreDoctor,this.noClinica,nombrePaciente);
			this.cita=citaActual;
		}
		
		return replay;
	}
	
	//Devuelve la cita creada
	public CitaMedica agregarCita(){
		return this.cita;
	}
}