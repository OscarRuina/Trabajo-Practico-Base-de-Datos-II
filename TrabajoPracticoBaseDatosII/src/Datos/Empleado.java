package Datos;

public class Empleado extends Persona{

	private 	int		cuil;
	private		String	tipo;
	public Empleado(int dni, String nombre, String apellido, Domicilio domicilio, ObraSocial obrasocial, int cuil,
			String tipo) {
		super(dni, nombre, apellido, domicilio, obrasocial);
		this.cuil = cuil;	//crear procedimiento para sacar el cuil 
		this.tipo = tipo;
	}
	public int getCuil() {
		return cuil;
	}
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
