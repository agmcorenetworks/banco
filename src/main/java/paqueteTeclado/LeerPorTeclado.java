package paqueteTeclado;

import java.util.Scanner;

public class LeerPorTeclado {
	
    private char caracter;

    public char getChar() {
        return caracter;
    }

    public void tipoDeCaracter() throws ExcepcionDeVocal, ExcepcionDeNumero, ExcepcionDeBlanco, ExcepcionDeSalida {
    	
    	System.out.println("Introduce un caracter");
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String textoIntroducido = scanner.next();
    	
    	caracter = textoIntroducido.charAt(0);	
    	
        if (Character.isDigit(caracter)) {
        	
            throw new ExcepcionDeNumero("El caracter es un numero.");
            
        } else if (Character.isWhitespace(caracter)) {
        	
            throw new ExcepcionDeBlanco("El caracter es un espacio en blanco.");
            
        } else if (Character.toLowerCase(caracter) == 'a' || Character.toLowerCase(caracter) == 'e' || 
                   Character.toLowerCase(caracter) == 'i' || Character.toLowerCase(caracter) == 'o' || 
                   Character.toLowerCase(caracter) == 'u') {
        	
            throw new ExcepcionDeVocal("El caracter es una vocal.");
            
        } else if (caracter == 'x') {
        	
            throw new ExcepcionDeSalida("Has introducido el caracter de salida 'x'.");
            
        }
    }
}