package Model;

import java.util.Date;

public abstract class PersonalidadJuridica {

	private String nombre;
	private int nit;
	private String direccionCorrespon;
	private int telContacto;
	private int cantidadEmpleados;
	private int valorPesosActivos;
	private Date fechaConstitucion;
	private TiposOrganizacion tipoConsti;
	private String nombreRepreLegal;
	private Cubiculo[][][] edificio;
	
	
	public PersonalidadJuridica(String nombre, int nit, String direccionCorrespon, int telContacto,
			int cantidadEmpleados, int valorPesosActivos, Date fechaConstitucion, TiposOrganizacion tipoConsti,
			String nombreRepreLegal, Cubiculo[][][] edificio) {
		this.nombre = nombre;
		this.nit = nit;
		this.direccionCorrespon = direccionCorrespon;
		this.telContacto = telContacto;
		this.cantidadEmpleados = cantidadEmpleados;
		this.valorPesosActivos = valorPesosActivos;
		this.fechaConstitucion = fechaConstitucion;
		this.tipoConsti = tipoConsti;
		this.nombreRepreLegal = nombreRepreLegal;
		this.edificio = edificio;
		inicializarEdificio();
	}
	

	private void inicializarEdificio() {
		for (int piso = 0; piso < edificio.length; piso++) {
			for (int i = 0; i < edificio[0].length; i++) {
				for (int j = 0; j < edificio[0][0].length; j++) {
					edificio[piso][i][j]=new Cubiculo(piso+"-"+i+"-"+j);
				}
			}
		}
		
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getDireccionCorrespon() {
		return direccionCorrespon;
	}
	public void setDireccionCorrespon(String direccionCorrespon) {
		this.direccionCorrespon = direccionCorrespon;
	}
	public int getTelContacto() {
		return telContacto;
	}
	public void setTelContacto(int telContacto) {
		this.telContacto = telContacto;
	}
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
	public int getValorPesosActivos() {
		return valorPesosActivos;
	}
	public void setValorPesosActivos(int valorPesosActivos) {
		this.valorPesosActivos = valorPesosActivos;
	}
	public Date getFechaConstitucion() {
		return fechaConstitucion;
	}
	public void setFechaConstitucion(Date fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}
	public TiposOrganizacion getTipoConsti() {
		return tipoConsti;
	}
	public void setTipoConsti(TiposOrganizacion tipoConsti) {
		this.tipoConsti = tipoConsti;
	}
	public String getNombreRepreLegal() {
		return nombreRepreLegal;
	}
	public void setNombreRepreLegal(String nombreRepreLegal) {
		this.nombreRepreLegal = nombreRepreLegal;
	}
	public Cubiculo[][][] getEdificio() {
		return edificio;
	}
	public void setEdificio(Cubiculo[][][] edificio) {
		this.edificio = edificio;
	}
	
	
}

