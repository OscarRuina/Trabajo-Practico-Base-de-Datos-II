package Datos;

public class ObraSocial {

	private		String		nombre;
	private		int			NroAfi;
	
	public ObraSocial(String nombre, int nroAfi) {
		super();
		this.nombre = nombre;
		NroAfi = nroAfi;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroAfi() {
		return NroAfi;
	}

	public void setNroAfi(int nroAfi) {
		NroAfi = nroAfi;
	}
	
	
	
}
