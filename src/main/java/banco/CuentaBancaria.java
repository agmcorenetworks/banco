package banco;

import proyectoPrueba.IMCException;
import proyectoPrueba.Persona;

public class CuentaBancaria {

	int saldo;
	Persona titular;
	
	
	public int meterSaldo(int saldo) {
		return this.saldo = saldo;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void retirarDinero(int retirada) throws ExceptionSaldo {
		
		if (retirada<saldo) {
			int saldoRestante = saldo - retirada;
			System.out.println(saldoRestante);
		}else {
			throw new ExceptionSaldo("saldo menor al importe a retirar");
		}
	}
	
		

}
