package banco;

import proyectoPrueba.Persona;

public class CuentaBancaria {

	int saldo;
	Persona titular;
	
	public int getSaldo() {
		return saldo;
	}
	
	
	public int sacarDinero(int retirado) throws BancariaException {
		if (retirado<=saldo) {
			return saldo - retirado;
		}else {
			throw new BancariaException("No hay saldo suficiente");
		}
	}
		
}
