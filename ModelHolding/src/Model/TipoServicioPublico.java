package Model;

public enum TipoServicioPublico {

	ALCANTARILLADO("Alcantarillado"),ENERGIA("Energia"),ACUEDUCTO("Acueducto");
	
	private String tipo;
	private TipoServicioPublico(String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
