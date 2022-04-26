package calculadoramovida;

public class DivisionPorCeroExcepcion extends Exception {

	String texto;
	
	
	public DivisionPorCeroExcepcion(String texto) {
		this.texto = texto;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DivisionPorCeroExcepcion [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
