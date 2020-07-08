/*En esta clase comienza el programa*/
public class ProgramaHospital{
	
	public static void main(String args[]){
		
		Menu menu = new Menu();
		Usuarios usuario = new Usuarios();
		
		//Activación de la simulación de bases de datos
		Usuarios.activarBaseDeDatos();
		AreaDeInformatica.activarBaseDeDatos();
		Clinicas.activarBaseDeDatos();
		
		boolean sesion=true;
		
		int op=0;
		boolean verificacion = true;
		
		System.out.println("\n");
		System.out.println("Programa de información y asignación de citas.");
		System.out.println("\n");
		System.out.println("Hospital Nacional de Guatemala Dr.Aldo Castañeda.");
		System.out.println("Trabajando por el desarollo de la salud y la medicina...");
		
		do{
		System.out.println("\n");
		System.out.println("----------------");
		System.out.println("Inicio de sesión.");
		System.out.println("----------------");
		op = menu.getOpMainMenu();
		
		switch(op){
			case 1:
					//Verificar que el usuario y la contraseña sean correctos
					verificacion = usuario.selectUsuario(op);
					if(verificacion==true){
					//Si son correctos, continuar con el programa
					sesion=usuario.goToUsuario(op);
					}
					break;
					
			case 2: 
					//Verificar que el usuario y la contraseña sean correctos
					verificacion = usuario.selectUsuario(op);
					if(verificacion==true){
					//Si son correctos, continuar con el programa
					sesion=usuario.goToUsuario(op);
					}
					break;
			case 3:
					//Cancelar inicio de sesión y cerrar programa
					System.out.println("Cancelando...");
					System.out.println("Que pase buen dia.");
					verificacion=true;
					sesion=true;
					break;
			
			default:
					System.out.println("Opción inválida. Intente de nuevo.");
					break;
		}	
		}while(op!=1&op!=2&op!=3 | verificacion==false | sesion==false);
	}
}