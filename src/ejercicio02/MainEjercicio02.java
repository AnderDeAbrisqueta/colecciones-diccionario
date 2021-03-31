package ejercicio02;

import java.util.ArrayList;
import java.util.Collections;

public class MainEjercicio02 {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		int suma = 0;

		for (int i = 0; i < (int) ((Math.random() * (20 - 10 + 1) + 10)); i++) {
			numero.add((int) ((Math.random() * (100 - 0 + 1) + 0)));
			suma += numero.get(i);
		}

		System.out.println("La suma de los números " + numero + " es: " + suma);
		System.out.printf("La media de los números " + numero + " es: %.2f \n", (double) suma / numero.size());
		System.out.println("El número mayor es: " + Collections.max(numero));
		System.out.println("El número menor es: " + Collections.min(numero));

	}

}
