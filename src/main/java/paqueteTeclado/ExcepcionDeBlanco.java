package paqueteTeclado;

public class ExcepcionDeBlanco extends Exception {
	
	public String msj;
	
    public ExcepcionDeBlanco(String msj) {
        super(msj);
    }
}