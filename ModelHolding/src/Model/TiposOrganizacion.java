package Model;

public enum TiposOrganizacion {
	AgriCazaSilviPezca("AGRICULTURA, CAZA, SILVICULTURA Y PEZCA"), ExploMinasCante("EXPLOTACION DE MINAS Y CANTERAS"),
	Manufactu("INDUSTRIA MANUFACTURERA"), ElectriGasVapo("ELECTRICIDAD, GAS Y VAPOR"), Constru("CONSTRUCCION"),
	ComerciMayorMenor("COMERCIO AL POR MAYOR Y AL POR MENOR"),
	TranspoAlmaceComunic("TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES"),
	CieroSegurosComani("EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS"), ComunalesSociales("COMUNALES, SOCIALES");

	private String tipo;

	private TiposOrganizacion(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
