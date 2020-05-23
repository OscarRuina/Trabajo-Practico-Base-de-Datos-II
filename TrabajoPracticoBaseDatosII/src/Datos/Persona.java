package Datos;

public class Persona {

	protected 	int	 		dni;
	protected 	String 		nombre;
	protected	String		apellido;
	protected	Domicilio	domicilio;
	protected	ObraSocial	obrasocial;
	
	public Persona(int dni, String nombre, String apellido, Domicilio domicilio, ObraSocial obrasocial) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.obrasocial = obrasocial;
	}

	public Persona(int dni, String nombre, String apellido, Domicilio domicilio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		//this.obrasocial = obrasocial;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public ObraSocial getObrasocial() {
		return obrasocial;
	}

	public void setObrasocial(ObraSocial obrasocial) {
		this.obrasocial = obrasocial;
	}
	
	
}

