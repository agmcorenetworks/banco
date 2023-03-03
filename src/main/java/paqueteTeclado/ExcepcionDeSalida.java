package paqueteTeclado;

public class ExcepcionDeSalida extends Exception {
	
    String msj;
	
    public ExcepcionDeSalida(String msj) {
        super(msj);
    }
}