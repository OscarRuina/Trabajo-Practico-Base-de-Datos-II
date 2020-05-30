package datos;

public class Persona {

	private  	int	 		dni;
	private 	String 		nombre;
	private	    String		apellido;
	private	    Domicilio	domicilio;
	private 	ObraSocial	obrasocial;
	private     boolean isEmpleado;
	
	public Persona(int dni, String nombre, String apellido, Domicilio domicilio, ObraSocial obrasocial,
			boolean isEmpleado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.obrasocial = obrasocial;
		this.isEmpleado = isEmpleado;
	}

	public Persona(int dni, String nombre, String apellido, Domicilio domicilio, boolean isEmpleado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.isEmpleado = isEmpleado;
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

	public boolean isEmpleado() {
		return isEmpleado;
	}

	public void setEmpleado(boolean isEmpleado) {
		this.isEmpleado = isEmpleado;
	}
	
	
	
	
}

