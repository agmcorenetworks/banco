package banco;

import org.junit.jupiter.api.Test;

public class TestJunit {	
	
	@Test
	void testSingleSuccessTest() {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		
		cuenta1.meterSaldo(1000);
		
		try {
			cuenta1.retirarDinero(1500);
		} catch (ExceptionSaldo e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
	}
	
	@Test
	void testSingleSuccessTest2() {
		CuentaBancaria cuenta2 = new CuentaBancaria();
		
		cuenta2.meterSaldo(1000);
		
		try {
			cuenta2.retirarDinero(500);
		} catch (ExceptionSaldo e2) {
			// TODO Auto-generated catch block
			System.out.println(e2.getMessage());
		}
		
	}

}
