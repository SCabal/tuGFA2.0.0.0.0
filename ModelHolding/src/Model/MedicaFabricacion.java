package Model;

import java.util.ArrayList;
import java.util.Date;

import Interfaces.IEmpresaFabricacion;

public class MedicaFabricacion extends Fabricacion implements IEmpresaFabricacion{

	private ArrayList<ProductoMedi> productosMed;

	public MedicaFabricacion(String nombre, int nit, String direccionCorrespon, int telContacto, int cantidadEmpleados,
			int valorPesosActivos, Date fechaConstitucion, TiposOrganizacion tipoConsti, String nombreRepreLegal, Cubiculo[][][] edificio) {
		super(nombre, nit, direccionCorrespon, telContacto, cantidadEmpleados, valorPesosActivos, fechaConstitucion,
				tipoConsti, nombreRepreLegal, edificio);
		productosMed=new ArrayList<ProductoMedi>();
	}

	public ArrayList<ProductoMedi> getProductosMed() {
		return productosMed;
	}

	public void setProductosMed(ArrayList<ProductoMedi> productosMed) {
		this.productosMed = productosMed;
	}
	
	public int agualXArbol() {
		double aguaTotal=0;
		for (int i = 0; i < productosMed.size(); i++) {
			aguaTotal+=productosMed.get(i).getAguaLitros();
		}
		if(aguaTotal>=1&&aguaTotal<=141) {
			return 6;
		}
		else if(aguaTotal>141&&aguaTotal<=800) {
			return 25;
		}else if(aguaTotal>800) {
			return 200;
		}
		return 0;
	}
	
}
