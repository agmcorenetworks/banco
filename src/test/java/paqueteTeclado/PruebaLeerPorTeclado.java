package paqueteTeclado;

import org.junit.Test;

public class PruebaLeerPorTeclado {
	
    @Test
    public void pruebaLecturaCaracteres() throws ExcepcionDeVocal, ExcepcionDeNumero, ExcepcionDeBlanco, ExcepcionDeSalida {
        LeerPorTeclado teclado = new LeerPorTeclado();
        boolean terminar = true;
        while (terminar)
            try {
                teclado.tipoDeCaracter();
            } catch (ExcepcionDeVocal e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionDeNumero e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionDeBlanco e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionDeSalida e) {
                System.out.println(e.getMessage());
                terminar = false;
            }
        }
    }
