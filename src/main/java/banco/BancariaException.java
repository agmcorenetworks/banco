package banco;

public class BancariaException extends Exception {

	public String msj;

	public BancariaException(String msj){
		super(msj);
	}
}