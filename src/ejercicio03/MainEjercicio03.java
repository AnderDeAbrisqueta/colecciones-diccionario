package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainEjercicio03 {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Por favor, introduce un número entero (" + (i + 1) + "): ");
			int numeroIntroducido = Integer.parseInt(s.nextLine());
			numero.add(numeroIntroducido);
		}
		
		Collections.sort(numero);
		
		System.out.println("Números ordenados: ");
		
		for (Integer n : numero) {
			System.out.print(n + ", ");
		}
	}

}
