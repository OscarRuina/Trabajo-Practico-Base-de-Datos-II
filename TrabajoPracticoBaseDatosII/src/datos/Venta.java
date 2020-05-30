package datos;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import datos.Persona;

public class Venta {
	
	private String numeroTicket;
	private int totalVentas;
	private LocalDate fecha;
	private int formaPago; //1 efectivo, 2 credito , 3 debito
	private List<Producto> productos;
	private float precioTotal;
	private Persona vendedor;
	private Persona cobrador;
	private Farmacia sucursal;
	
	public Venta(String numeroTicket, int totalVentas, LocalDate fecha, int formaPago, float precioTotal,
			Persona vendedor, Persona cobrador, Farmacia sucursal) {
		super();
		this.numeroTicket = numeroTicket;
		this.totalVentas = totalVentas;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.precioTotal = precioTotal;
		this.vendedor = vendedor;
		this.cobrador = cobrador;
		this.sucursal = sucursal;
		this.productos = new ArrayList<Producto>();
	}

	public String getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(String numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public int getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(int formaPago) {
		this.formaPago = formaPago;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Persona getVendedor() {
		return vendedor;
	}

	public void setVendedor(Persona vendedor) {
		this.vendedor = vendedor;
	}

	public Persona getCobrador() {
		return cobrador;
	}

	public void setCobrador(Persona cobrador) {
		this.cobrador = cobrador;
	}

	public Farmacia getSucursal() {
		return sucursal;
	}

	public void setSucursal(Farmacia sucursal) {
		this.sucursal = sucursal;
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	
	
}
