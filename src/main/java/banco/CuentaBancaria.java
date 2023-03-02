package banco;

import proyectoPrueba.Persona;

public class CuentaBancaria {

	int saldo;
	Persona titular;
	int dinero;
	
	public int getSaldo() {
		return saldo;
	}
	
	CuentaBancaria (int saldo) {
		this.saldo = saldo;
	}
	
	public int sacarDinero (int cantidad) throws SaldoException {
		if (cantidad > saldo) {
			throw new SaldoException ("No tienes suficiente saldo");
		} else {
			System.out.println("Tienes " + (saldo - cantidad) + " saldo en tu cuenta");
			return saldo - cantidad;
		}
	}
	

}
