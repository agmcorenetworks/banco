package banco;

import org.junit.jupiter.api.Test;

public class TestJunit {	
	
	@Test
	void testSingleSuccessTest() throws SaldoException {
		
		CuentaBancaria cuenta1 = new CuentaBancaria(100);
		
		try {
			
			cuenta1.sacarDinero(500);
			
		} catch (SaldoException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
