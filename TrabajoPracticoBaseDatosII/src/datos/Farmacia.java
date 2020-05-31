package datos;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
	
	private int puntoVenta;//unico para cada sucursal
	private Domicilio domicilio;
	private List<Persona> personas;
	private List<Producto> productos;
	private List<Venta> ventas;
	
	public Farmacia(int puntoVenta, Domicilio domicilio) {
		super();
		this.puntoVenta = puntoVenta;
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
