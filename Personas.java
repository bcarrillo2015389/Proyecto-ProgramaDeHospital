/*Superclase Personas de Pacientes y Doctores*/
public class Personas{
    public String nombre;
	public int edad;
	public String nacionalidad;
	public String sexo;
	public String areaDeAtencion;
	public String usuario;
	public String contrase�a;
	
	public Personas(){}
	
	public Personas(String nombre,int edad,String nacionalidad,String sexo,String areaDeAtencion,String usuario,String contrase�a){
		
		this.nombre=nombre;
		this.edad=edad;
		this.nacionalidad=nacionalidad;
		this.sexo=sexo;
		this.areaDeAtencion=areaDeAtencion;
		this.usuario=usuario;
		this.contrase�a=contrase�a;	
	}
}