package paqueteExcepcionesEdad;

public class InfantilException extends Exception {
	
	String msj;
	
    public InfantilException(String msj) {
        super(msj);
    }
}