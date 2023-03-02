package proyectoPrueba;

public class RetirarDineroException extends Exception {

	public String msj;

	public RetirarDineroException(String msj){
		super(msj);
	}
}
