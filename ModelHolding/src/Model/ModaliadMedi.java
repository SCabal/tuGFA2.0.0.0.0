package Model;

public enum ModaliadMedi {
	FABRIYEXPOR("fabricar y exportar"),FABRIYVENDER("fabricar y vender"),IMPORYVENDER("importar y vender");
	private String modalidad;
	
	private ModaliadMedi(String modalidad) {
		this.modalidad=modalidad;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	
}
