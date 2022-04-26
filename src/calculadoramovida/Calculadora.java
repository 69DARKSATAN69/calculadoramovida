package calculadoramovida;

import java.util.Scanner;

public class Calculadora {

	private Double operando1;
	private Double operando2;
	private Character simbolo;
	private double resultado;

	public void leerOperandos(String numeros1, String numeros2) {
		try {
			operando1 = Double.parseDouble(numeros1);

			operando2 = Double.parseDouble(numeros2);
		} catch (NumberFormatException e) {
			System.out.println("Esto confirma la regla.");
		}
	}

	public Double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public Double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public Character getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void leerOperador(String operador) throws ExcepcionOperadorInvalido {

		switch (operador) {

		case "+":
			simbolo = '+';
			break;
		case "-":
			simbolo = '-';
			break;
		case "*":
			simbolo = '*';
			break;
		case "/":
			simbolo = '/';
			break;

		default:
			throw new ExcepcionOperadorInvalido("Error, operador invalido.");
		}

	}

	public void realizarOperacion() {
		switch (simbolo) {

		case '+':
			resultado = operando1 + operando2;
			break;
		case '-':
			resultado = operando1 - operando2;
			break;
		case '*':
			resultado = operando1 * operando2;
			break;
		case '/':

			resultado = operando1 / operando2;

			break;
		default:
			System.out.println("AAAAAAAAAAAAAH");
		}
	}

	public void mostrarResultado() {
		System.out.println("El resultado es: " + resultado);
	}

}
