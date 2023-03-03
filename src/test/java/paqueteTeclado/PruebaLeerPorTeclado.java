package paqueteTeclado;

import org.junit.Test;

public class PruebaLeerPorTeclado {
	
	
	@Test
	public void vamosAProbar () throws ExcepcionDeBlanco, ExcepcionDeNumero, ExcepcionDeVocal, ExcepcionDeSalida {
		LeerPorTeclado l1 = new LeerPorTeclado();
		while (true) {
			try {
				l1.evaluaCaracter();
			} catch (ExcepcionDeVocal e) {
				System.out.println(e.getMessage());
			} catch (ExcepcionDeBlanco e) {
				System.out.println(e.getMessage());
			} catch (ExcepcionDeNumero e) {
				System.out.println(e.getMessage());
			} catch (ExcepcionDeSalida e) {
				System.out.println(e.getMessage());
				break;
			}
		}
	}
	
}
