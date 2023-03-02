package banco;

import org.junit.jupiter.api.Test;

import proyectoPrueba.RetirarDineroException;

public class TestJunit {

	CuentaBancaria cuenta1 = new CuentaBancaria(400);

	@Test
	void testSingleSuccessTest() {

		try {
			cuenta1.retirarSaldo(300);
		} catch (RetirarDineroException e) {
			System.out.println(e.getMessage());
		}

	}
}
