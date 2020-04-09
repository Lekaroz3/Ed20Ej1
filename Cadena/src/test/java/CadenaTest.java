import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.Target;
 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {
	
	private Cadena target;

	@BeforeEach
	void setUp() throws Exception {
		target = new Cadena();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLongitud() {
		int expected = 4;
		int actual = target.longitud("Hola");
		assertEquals(expected, actual, "Testeando la longitud");
		int vacia = target.longitud("");
		assertEquals(expected, vacia, "Testeando la longitud");
	}

	@Test
	void testVocales() {
		int expected = 4;
		int actual = target.vocales("Hola Mundo");
		assertEquals(expected, actual, "Testeando la vocales");
		int vacio = target.vocales("");
		assertEquals(expected, vacio, "Testeando la vocales");
	}

	@Test
	void testInvertir() {
		String expected = "aloH";
		String actual = target.invertir("Hola");
		assertEquals(expected, actual, "Testeando la invertir");
		String vacio = target.invertir("");
		assertEquals(expected, vacio, "Testeando la invertir");
	}

	@Test
	void testContarLetra() {
		int expected = 4;
		int actual = target.contarLetra("holaolalala",'a' );
		assertEquals(expected, actual, "Testeando la contar letra");
		int vacio = target.contarLetra("",'a' );
		assertEquals(expected, vacio, "Testeando la contar letra");
		
	}

}
