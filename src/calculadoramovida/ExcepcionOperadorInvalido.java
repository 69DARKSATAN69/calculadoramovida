package calculadoramovida;

import java.io.IOException;

public class ExcepcionOperadorInvalido extends IOException {


	private String texto;
	
	public ExcepcionOperadorInvalido(String texto) {
		this.texto = texto;
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExcepcionOperadorInvalido [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
