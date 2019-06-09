package Model;

import java.util.ArrayList;
import java.util.Date;

import Interfaces.IEmpresaServicio;

public class Tecnologia extends PersonalidadJuridica implements IEmpresaServicio  {

	private ArrayList<Encuesta> encuestas;
	private String[] servicios={"Consultoria","Capacitacion","Desarrollo de software a la medida","Infrastructura como servicio","Plataforma como servicio"};
	private double energiaConsumidaAnual;
	

	public Tecnologia(String nombre, int nit, String direccionCorrespon, int telContacto, int cantidadEmpleados,
			int valorPesosActivos, Date fechaConstitucion, TiposOrganizacion tipoConsti, String nombreRepreLegal,
			double energiaConsumidaAnual, Cubiculo[][][] edificio) {
		super(nombre, nit, direccionCorrespon, telContacto, cantidadEmpleados, valorPesosActivos, fechaConstitucion,
				tipoConsti, nombreRepreLegal, edificio);
		this.energiaConsumidaAnual = energiaConsumidaAnual;
		encuestas=new ArrayList<Encuesta>();
	}
	@Override
	public void addEncuesta(Encuesta d) {
		encuestas.add(d);
		
	}
	public int energiaXArbol() {
		
		
		if(energiaConsumidaAnual>=1&&energiaConsumidaAnual<=1001) {
			return 8;
		}
		else if(energiaConsumidaAnual>1001&&energiaConsumidaAnual<=3000) {
			return 35;
		}else if(energiaConsumidaAnual>3000) {
			return 500;
		}
		return 0;
	}
	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}
	public void setEncuestas(ArrayList<Encuesta> encuestas) {
		this.encuestas = encuestas;
	}
	public String[] getServicios() {
		return servicios;
	}
	public void setServicios(String[] servicios) {
		this.servicios = servicios;
	}
	public double getEnergiaConsumidaAnual() {
		return energiaConsumidaAnual;
	}
	public void setEnergiaConsumidaAnual(double energiaConsumidaAnual) {
		this.energiaConsumidaAnual = energiaConsumidaAnual;
	}

	
	
	
	
}
