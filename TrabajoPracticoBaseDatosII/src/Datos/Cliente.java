package Datos;

public class Cliente extends Persona {

	//private String privado;
	
	public Cliente(int dni, String nombre, String apellido, Domicilio domicilio, ObraSocial obrasocial) {
		super(dni, nombre, apellido, domicilio, obrasocial);
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(int dni, String nombre, String apellido, Domicilio domicilio) {
		super(dni, nombre, apellido, domicilio);
		// TODO Auto-generated constructor stub
	}
}
