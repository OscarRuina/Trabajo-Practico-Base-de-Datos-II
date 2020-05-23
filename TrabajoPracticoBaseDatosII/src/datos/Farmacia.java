package datos;

import java.util.List;

public class Farmacia {
	
	private int puntoVenta;//unico para cada sucursal
	private Domicilio domicilio;
	private List<Cliente> clientes;
	private List<Empleado> empleados;
	
	public Farmacia(int puntoVenta, Domicilio domicilio) {
		super();
		this.puntoVenta = puntoVenta;
		this.domicilio = domicilio;
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

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
