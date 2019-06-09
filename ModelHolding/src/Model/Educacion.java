package Model;

import java.util.ArrayList;
import java.util.Date;

import Interfaces.IEmpresaServicio;

public class Educacion extends PersonalidadJuridica implements IEmpresaServicio{

	public static final String BACHILLERATO="Bachillerato";
	public static final String UNIVERSIDAD="Universidad";
	
	private int resgistroAproMEN;
	private int numAnosAcredi;
	private int puestoNacSaber11;
	private int puestoNacSaberPro;
	private String nombreRector;
	private String sectorEducativo;
	private int estudiantesEst1y2Activos;
	private int estudiantesTotalActivos;
	
	private ArrayList<Encuesta> encuantas;
	
	
	public Educacion(String nombre, int nit, String direccionCorrespon, int telContacto, int cantidadEmpleados,
			int valorPesosActivos, Date fechaConstitucion, TiposOrganizacion tipoConsti, String nombreRepreLegal,
			int resgistroAproMEN, int numAnosAcredi, int puestoNacSaber11, int puestoNacSaberPro, String nombreRector,
			String sectorEducativo, int estudiantesEst1y2Activos, int estudiantesTotalActivos, Cubiculo[][][] edificio) {
		super(nombre, nit, direccionCorrespon, telContacto, cantidadEmpleados, valorPesosActivos, fechaConstitucion,
				tipoConsti, nombreRepreLegal, edificio);
		this.resgistroAproMEN = resgistroAproMEN;
		this.numAnosAcredi = numAnosAcredi;
		this.puestoNacSaber11 = puestoNacSaber11;
		this.puestoNacSaberPro = puestoNacSaberPro;
		this.nombreRector = nombreRector;
		this.sectorEducativo = sectorEducativo;
		this.estudiantesEst1y2Activos = estudiantesEst1y2Activos;
		this.estudiantesTotalActivos = estudiantesTotalActivos;
		encuantas=new ArrayList<Encuesta>();
	}


	public double procentajeImpuestoProcultura() {
		double impuesto;
		if((impuesto=(20.0-(100.0*((double)estudiantesEst1y2Activos/estudiantesTotalActivos))))<0.0) {
			impuesto=0.0;
		}
		return impuesto;
	}
	
	public void addEncuesta(Encuesta d) {
		encuantas.add(d);
	}

	public int getResgistroAproMEN() {
		return resgistroAproMEN;
	}


	public void setResgistroAproMEN(int resgistroAproMEN) {
		this.resgistroAproMEN = resgistroAproMEN;
	}


	public int getNumAnosAcredi() {
		return numAnosAcredi;
	}


	public void setNumAnosAcredi(int numAnosAcredi) {
		this.numAnosAcredi = numAnosAcredi;
	}


	public int getPuestoNacSaber11() {
		return puestoNacSaber11;
	}


	public void setPuestoNacSaber11(int puestoNacSaber11) {
		this.puestoNacSaber11 = puestoNacSaber11;
	}


	public int getPuestoNacSaberPro() {
		return puestoNacSaberPro;
	}


	public void setPuestoNacSaberPro(int puestoNacSaberPro) {
		this.puestoNacSaberPro = puestoNacSaberPro;
	}


	public String getNombreRector() {
		return nombreRector;
	}


	public void setNombreRector(String nombreRector) {
		this.nombreRector = nombreRector;
	}


	public String getSectorEducativo() {
		return sectorEducativo;
	}


	public void setSectorEducativo(String sectorEducativo) {
		this.sectorEducativo = sectorEducativo;
	}


	public int getEstudiantesEst1y2Activos() {
		return estudiantesEst1y2Activos;
	}


	public void setEstudiantesEst1y2Activos(int estudiantesEst1y2Activos) {
		this.estudiantesEst1y2Activos = estudiantesEst1y2Activos;
	}


	public int getEstudiantesTotalActivos() {
		return estudiantesTotalActivos;
	}


	public void setEstudiantesTotalActivos(int estudiantesTotalActivos) {
		this.estudiantesTotalActivos = estudiantesTotalActivos;
	}


	public ArrayList<Encuesta> getEncuantas() {
		return encuantas;
	}


	public void setEncuantas(ArrayList<Encuesta> encuantas) {
		this.encuantas = encuantas;
	}
	
	
}
