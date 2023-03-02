package banco;

import proyectoPrueba.Persona;

public class CuentaBancaria {
	//ATRIBUTO
	int saldo;
	
	//CONSTRUCTOR
	public CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}


	public int getSaldo() {
		return saldo;
	}
	
	//METODO
	public boolean sacarDinero(int dineroRetirado) throws SaldoException {
		if (this.saldo < dineroRetirado) {
			throw new SaldoException("SALDO INFERIOR"); 
		} else {
			return true;
		}
	}
	
			
	

}
