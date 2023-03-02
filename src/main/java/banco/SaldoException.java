package banco;

public class SaldoException extends Exception {
	public String msj;
	
	 public SaldoException(String msj) {
		 super(msj);
  }
}
