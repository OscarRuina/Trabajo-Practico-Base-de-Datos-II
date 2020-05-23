package datos;

public class Laboratorio {
	
	private int id;// ver despues
	private String nombre;
	private Domicilio domicilio;
	
    public Laboratorio(String nombre, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
    
    public int getId() {
		return id;
	}
    
    public void setId(int id) {
		this.id = id;
	}
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
	

}
