package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainEjercicio04 {

	public static void main(String[] args) {
		ArrayList<String> palabra = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduce ");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("palabra (" + (i + 1) + "): ");
			String palabraIntroducida = s.nextLine();
			palabra.add(palabraIntroducida);
		}
		
		Collections.sort(palabra);
		
		System.out.print("Las palabras ordenadas: ");
		
		for (String p : palabra) {
			System.out.print(p + ", ");
		}

	}

}
