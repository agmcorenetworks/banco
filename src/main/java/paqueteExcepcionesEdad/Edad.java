package paqueteExcepcionesEdad;

public class Edad {
	
	public void generaExcepcionEdad(int edad) throws InfantilException, AdultoException, MayorException {
		

		if (edad < 18) {
			throw new InfantilException ("La edad es " + edad);
		} else if (edad >= 18 && edad <= 65) {
			throw new AdultoException ("La edad es " + edad);
		} else if (edad > 65) {
			throw new MayorException ("La edad es " + edad);
		}
	}
	
}
