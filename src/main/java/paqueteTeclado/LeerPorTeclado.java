package paqueteTeclado;

import java.util.Scanner;

public class LeerPorTeclado {

	private char caracter;

	public char getCaracter() {
		return caracter;
	}

	public void evaluaCaracter() throws ExcepcionDeBlanco, ExcepcionDeNumero, ExcepcionDeSalida, ExcepcionDeVocal {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un caracter.\nSi introduces mas de un caracter, se tendra en cuenta solo el primero");
		
		caracter = scanner.nextLine().charAt(0);

		if (Character.isWhitespace(caracter)) {
			throw new ExcepcionDeBlanco ("Has introducido un espacio en blanco");
		} else if (Character.isDigit(caracter)) {
			throw new ExcepcionDeNumero ("Has introducido un numero");
		} else if ((Character.toLowerCase(caracter) == 'a' || Character.toLowerCase(caracter) == 'e'
				|| Character.toLowerCase(caracter) == 'i' || Character.toLowerCase(caracter) == 'o'
				|| Character.toLowerCase(caracter) == 'u')) {
			throw new ExcepcionDeVocal ("Has introducido una vocal");
		} else if (caracter == 'x') {
			throw new ExcepcionDeSalida ("Has introducido el valor de salida 'x'");
		} else {
			System.out.println("Has introducido un caracter que no es una vocal ni un numero.");
		}
		
	}

}
