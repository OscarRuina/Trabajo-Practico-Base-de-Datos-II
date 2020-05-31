package datos;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
	
	private int puntoVenta;//unico para cada sucursal
	private String nombre;
	private Domicilio domicilio;
	private List<Persona> personas;
	private List<Producto> productos;
	private List<Venta> ventas;
	
	public Farmacia(int puntoVenta, String nombre,Domicilio domicilio) {
		super();
		this.puntoVenta = puntoVenta;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.personas = new ArrayList<Persona>();
		this.productos = new ArrayList<Producto>();
		this.ventas = new ArrayList<Venta>();
	}

	public int getPuntoVenta() {
		return puntoVenta;
	}

	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
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

	public List<Persona> getPersonas() {
		return personas;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public List<Venta> getVentas() {
		return ventas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
