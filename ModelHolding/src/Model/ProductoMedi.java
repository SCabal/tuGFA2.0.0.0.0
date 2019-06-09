package Model;

import java.util.Date;

public class ProductoMedi extends Producto {
	public final static String VIGENTE="Vigente";
	public final static String NO_RENOVADO="No renovado";
	
	private String regSanitario;
	private String estado;
	private Date vencimiento;
	private ModaliadMedi modalidad;
	
	
	
	public ProductoMedi(String nombre, String codigo, double aguaLitros, int cantidadInventario, String regSanitario,
			String estado, Date vencimiento, ModaliadMedi modalidad) {
		super(nombre, codigo, aguaLitros, cantidadInventario);
		this.regSanitario = regSanitario;
		this.estado = estado;
		this.vencimiento = vencimiento;
		this.modalidad = modalidad;
	}
	public String getRegSanitario() {
		return regSanitario;
	}
	public void setRegSanitario(String regSanitario) {
		this.regSanitario = regSanitario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
	public ModaliadMedi getModalidad() {
		return modalidad;
	}
	public void setModalidad(ModaliadMedi modalidad) {
		this.modalidad = modalidad;
	}
	
	
	
}
