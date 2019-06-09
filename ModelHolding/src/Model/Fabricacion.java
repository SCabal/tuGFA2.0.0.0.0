package Model;

import java.util.ArrayList;
import java.util.Date;

import Interfaces.IEmpresaFabricacion;

public class Fabricacion extends PersonalidadJuridica implements IEmpresaFabricacion {

	private ArrayList<Producto> productos;

	public Fabricacion(String nombre, int nit, String direccionCorrespon, int telContacto, int cantidadEmpleados,
			int valorPesosActivos, Date fechaConstitucion, TiposOrganizacion tipoConsti, String nombreRepreLegal, Cubiculo[][][] edificio) {
		super(nombre, nit, direccionCorrespon, telContacto, cantidadEmpleados, valorPesosActivos, fechaConstitucion,
				tipoConsti, nombreRepreLegal, edificio);
		this.productos = new ArrayList<Producto>();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
}
