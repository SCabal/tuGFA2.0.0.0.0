package Model;

public class Encuesta {

	
	private String[] prguntas;
	private int[] respuestas;
	
	public Encuesta(int resp1,int resp2,int resp3) {
		prguntas=new String[3];
		prguntas[0]="El servicio prestado";
		prguntas[1]="El tiempo de respuestaDado";
		prguntas[2]="La relacion costo/beneficio del servicio adquirido";
		respuestas=new int[3];
		respuestas[0]=resp1;
		respuestas[1]=resp2;
		respuestas[2]=resp3;
	}

	public String[] getPrguntas() {
		return prguntas;
	}

	public void setPrguntas(String[] prguntas) {
		this.prguntas = prguntas;
	}

	public int[] getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(int[] respuestas) {
		this.respuestas = respuestas;
	}
	
	
}
