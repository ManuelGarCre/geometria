import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class Circulo_MGCTest {
	
	private static Circulo_MGC circulo;
	
	@AfterAll
	static void tearDownAfterClass() {
		circulo = null;
	}

	@Test
	void testArea() {
		circulo = new Circulo_MGC(7, "circulo");
		double devuelto = circulo.area();
		double esperado = 153.9384;
		assertEquals(esperado, devuelto);
		
		circulo = new Circulo_MGC(0, "circulo");
		devuelto = circulo.area();
		esperado = 0;
		assertEquals(esperado, devuelto);
		
		circulo = new Circulo_MGC(-3, "circulo");
		devuelto = circulo.area();
		esperado = 28.2744;
		assertEquals(esperado, devuelto);
	}

	@Test
	void testPerimetro() {
		circulo = new Circulo_MGC(7, "circulo");
		double devuelto = circulo.perimetro();
		double esperado = 43.9824;
		assertEquals(esperado, devuelto);
		
		circulo = new Circulo_MGC(0, "circulo");
		devuelto = circulo.perimetro();
		esperado = 0;
		assertEquals(esperado, devuelto);
		
		circulo = new Circulo_MGC(-3, "circulo");
		devuelto = circulo.perimetro();
		esperado = 18.8496;
		assertEquals(esperado, devuelto);
	}

}
