package banco;

import proyectoPrueba.Persona;
import proyectoPrueba.RetirarDineroException;

public class CuentaBancaria {

	int saldo;
	int retirar;
	Persona titular;

	public CuentaBancaria(int i) {
		this.saldo = i;
	}

	public int getSaldo() {
		return saldo;
	}

	public int retirarSaldo(int retirar) throws RetirarDineroException {
		if (retirar <= saldo) {
			return saldo - retirar;
		} else {
			throw new RetirarDineroException("No hay suficiente dinero");
		}
	}

}
