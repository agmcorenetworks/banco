package paqueteTeclado;

public class ExcepcionDeNumero extends Exception {
	
	String msj;
	
    public ExcepcionDeNumero(String msj) {
        super(msj);
    }
}