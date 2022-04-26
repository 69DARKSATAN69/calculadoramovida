package calculadoramovida;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppCalculadoraTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLeerOperandos() {
		Calculadora calc = new Calculadora();
		calc.leerOperandos("52", "25");
		assertTrue(calc.getOperando1() == 52 && calc.getOperando2() == 25);
	}
		
	@Test
	void testExcepcionDivisionCero() {
		
		
		
		Exception thrown = Assertions.assertThrows(NumberFormatException.class, () -> { Calculadora calc = new Calculadora();
		calc.leerOperandos("Corsino", "*");});
		
	}
		
		
	}


