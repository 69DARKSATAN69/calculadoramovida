package calculadoramovida;

import java.io.IOException;
import java.util.Scanner;

public class AppCalculadora {

	public static void main(String[] args) throws ExcepcionOperadorInvalido {
		// TODO Auto-generated method stub
		boolean apagado = false;
		Scanner sc = new Scanner(System.in);
		int seleccion;
		Calculadora calc = new Calculadora();
		
		
		
	
		while(!apagado) {
			System.out.println("Escriba 1 para introducir los operandos");
			System.out.println("Escriba 2 para introducir el símbolo de operación.");
			System.out.println("Escriba 3 para mostrar el resultado");
			System.out.println("Escriba 4 para salir");
			if(calc.getOperando2() != null && calc.getOperando2() == 0 && calc.getSimbolo() != null && calc.getSimbolo() == '/') {
				throw new ExcepcionOperadorInvalido("Error, division entre 0");
			}
		seleccion = sc.nextInt();
			switch(seleccion) {
			
			case 1:
				calc.leerOperandos(sc.next(), sc.next());
				if(calc.getOperando1() != null  && calc.getOperando2() != null) {
				System.out.println("Operandos guardados.");}
				else {
					System.out.println("Error, vuelve a intentarlo.");
				}
				
				break;
			case 2:
				try {
					calc.leerOperador(sc.next());
				} catch (Exception e) {
					e = new Exception("Fallo en lectura de parámetros.");
					e.printStackTrace();
				}
				System.out.println("Operador guardado.");
				break;
			case 3:
				calc.realizarOperacion();
				calc.mostrarResultado();
				System.out.println("Resultado guardado.");
				break;
			
			case 4:
				apagado = true;
				System.out.println("Adios");
				break;
			}
			
			
		}

}

}
