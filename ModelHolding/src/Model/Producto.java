package Model;

public class Producto {

	private String nombre;
	private String codigo;
	private double aguaLitros;
	private int cantidadInventario;
	
	
	public Producto(String nombre, String codigo, double aguaLitros, int cantidadInventario) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.aguaLitros = aguaLitros;
		this.cantidadInventario = cantidadInventario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getAguaLitros() {
		return aguaLitros;
	}
	public void setAguaLitros(double aguaLitros) {
		this.aguaLitros = aguaLitros;
	}
	public int getCantidadInventario() {
		return cantidadInventario;
	}
	public void setCantidadInventario(int cantidadInventario) {
		this.cantidadInventario = cantidadInventario;
	}
	
}
