/*En esta clase comienza el programa*/
public class ProgramaHospital{
	
	public static void main(String args[]){
		
		Menu menu = new Menu();
		Usuarios usuario = new Usuarios();
		
		//Activaci�n de la simulaci�n de bases de datos
		Usuarios.activarBaseDeDatos();
		AreaDeInformatica.activarBaseDeDatos();
		Clinicas.activarBaseDeDatos();
		
		boolean sesion=true;
		
		int op=0;
		boolean verificacion = true;
		
		System.out.println("\n");
		System.out.println("Programa de informaci�n y asignaci�n de citas.");
		System.out.println("\n");
		System.out.println("Hospital Nacional de Guatemala Dr.Aldo Casta�eda.");
		System.out.println("Trabajando por el desarollo de la salud y la medicina...");
		
		do{
		System.out.println("\n");
		System.out.println("----------------");
		System.out.println("Inicio de sesi�n.");
		System.out.println("----------------");
		op = menu.getOpMainMenu();
		
		switch(op){
			case 1:
					//Verificar que el usuario y la contrase�a sean correctos
					verificacion = usuario.selectUsuario(op);
					if(verificacion==true){
					//Si son correctos, continuar con el programa
					sesion=usuario.goToUsuario(op);
					}
					break;
					
			case 2: 
					//Verificar que el usuario y la contrase�a sean correctos
					verificacion = usuario.selectUsuario(op);
					if(verificacion==true){
					//Si son correctos, continuar con el programa
					sesion=usuario.goToUsuario(op);
					}
					break;
			case 3:
					//Cancelar inicio de sesi�n y cerrar programa
					System.out.println("Cancelando...");
					System.out.println("Que pase buen dia.");
					verificacion=true;
					sesion=true;
					break;
			
			default:
					System.out.println("Opci�n inv�lida. Intente de nuevo.");
					break;
		}	
		}while(op!=1&op!=2&op!=3 | verificacion==false | sesion==false);
	}
}