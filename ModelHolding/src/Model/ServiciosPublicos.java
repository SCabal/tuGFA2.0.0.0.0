package Model;

import java.util.ArrayList;
import java.util.Date;

import Interfaces.IEmpresaServicio;

public class ServiciosPublicos extends PersonalidadJuridica implements IEmpresaServicio{

	private TipoServicioPublico tipo;
	private int suscriptoresTotales;
	private int suscriptoresEst1y2;
	private ArrayList<Encuesta> encuestas;
	public ServiciosPublicos(String nombre, int nit, String direccionCorrespon, int telContacto, int cantidadEmpleados,
			int valorPesosActivos, Date fechaConstitucion, TiposOrganizacion tipoConsti, String nombreRepreLegal,
			TipoServicioPublico tipo, int suscriptoresTotales, int suscriptoresEst1y2, Cubiculo[][][] edificio) {
		super(nombre, nit, direccionCorrespon, telContacto, cantidadEmpleados, valorPesosActivos, fechaConstitucion,
				tipoConsti, nombreRepreLegal, edificio);
		this.tipo = tipo;
		this.suscriptoresTotales = suscriptoresTotales;
		this.suscriptoresEst1y2 = suscriptoresEst1y2;
		encuestas=new ArrayList<Encuesta>();
	}
	
	public TipoServicioPublico getTipo() {
		return tipo;
	}
	public void setTipo(TipoServicioPublico tipo) {
		this.tipo = tipo;
	}
	public int getSuscriptoresTotales() {
		return suscriptoresTotales;
	}
	public void setSuscriptoresTotales(int suscriptoresTotales) {
		this.suscriptoresTotales = suscriptoresTotales;
	}
	public int getSuscriptoresEst1y2() {
		return suscriptoresEst1y2;
	}
	public void setSuscriptoresEst1y2(int suscriptoresEst1y2) {
		this.suscriptoresEst1y2 = suscriptoresEst1y2;
	}
	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}
	public void setEncuestas(ArrayList<Encuesta> encuestas) {
		this.encuestas = encuestas;
	}

	@Override
	public void addEncuesta(Encuesta d) {
		encuestas.add(d);
		
	}
	
	public double procentajeImpuestoProcultura() {
		double impuesto;
		if((impuesto=(40.0-(100.0*((double)(suscriptoresTotales-suscriptoresEst1y2)/suscriptoresTotales))))<0.0) {
			impuesto=0.0;
		}
		return impuesto;
	}
	
	
	
	
}
