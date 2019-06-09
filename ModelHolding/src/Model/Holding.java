package Model;

import java.util.ArrayList;
import java.util.Date;

import Interfaces.IEmpresaFabricacion;
import Interfaces.IEmpresaServicio;

public class Holding extends PersonalidadJuridica {
	private ArrayList<IEmpresaServicio> servicios;
	private ArrayList<IEmpresaFabricacion> fabricacion;

	public Holding(String nombre, int nit, String direccionCorrespon, int telContacto, int cantidadEmpleados,
			int valorPesosActivos, Date fechaConstitucion, TiposOrganizacion tipoConsti, String nombreRepreLegal, Cubiculo[][][] edificio) {
		super(nombre, nit, direccionCorrespon, telContacto, cantidadEmpleados, valorPesosActivos, fechaConstitucion,
				tipoConsti, nombreRepreLegal, edificio);
		servicios = new ArrayList<IEmpresaServicio>();
		fabricacion = new ArrayList<IEmpresaFabricacion>();
	}

	public ArrayList<IEmpresaServicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<IEmpresaServicio> servicios) {
		this.servicios = servicios;
	}

	public ArrayList<IEmpresaFabricacion> getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(ArrayList<IEmpresaFabricacion> fabricacion) {
		this.fabricacion = fabricacion;
	}

	

}
