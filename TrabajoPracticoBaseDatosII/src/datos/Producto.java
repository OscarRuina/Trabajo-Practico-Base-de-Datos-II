package datos;

public class Producto {
	
	private int codigo;
	private String tipoProducto;
	private String descripcion;
	private Laboratorio laboratorio;
	private float precio;
	
	public Producto(int codigo, String tipoProducto, String descripcion, Laboratorio laboratorio, float precio) {
		super();
		this.codigo = codigo;
		this.tipoProducto = tipoProducto;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
