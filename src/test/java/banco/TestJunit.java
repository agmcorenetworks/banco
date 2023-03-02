package banco;

import org.junit.jupiter.api.Test;

public class TestJunit {	
	
	@Test
	void testSingleSuccessTest() {
		
		CuentaBancaria saldo1 = new CuentaBancaria(100);
		
		try {
			System.out.println(saldo1.sacarDinero(150));
		} catch (SaldoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
