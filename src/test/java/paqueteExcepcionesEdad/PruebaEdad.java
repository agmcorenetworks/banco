package paqueteExcepcionesEdad;

import org.junit.Test;

public class PruebaEdad {

	@Test
	public void prueba1() throws InfantilException, AdultoException, MayorException {

		Edad e1 = new Edad();

		for (int i = 1; i <= 100; i++) {
			try {
				e1.generaExcepcionEdad(i);
			} catch (InfantilException e) {
				System.out.println(e.getMessage() + "\n" + "Se ha producido una excepcion del tipo InfantilException");
			} catch (AdultoException e) {
				System.out.println(e.getMessage() + "\n" + "Se ha producido una excepcion del tipo AdultoException");
			} catch (MayorException e) {
				System.out.println(e.getMessage() + "\n" + "Se ha producido una excepcion del tipo MayorException");
			}
		}
	}
	
	@Test
	public void prueba2() throws Exception {

		Edad e1 = new Edad();

		for (int i = 1; i <= 100; i++) {
			try {
				e1.generaExcepcionEdad(i);
			} catch (Exception e) {
				System.out.println("Se ha producido una excepcion\n" + e.getMessage());
			}
		}
	}
	
}
