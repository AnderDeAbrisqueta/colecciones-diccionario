package ejercicio01;

import java.util.ArrayList;

public class MainEjercicio01 {

	public static void main(String[] args) {
		ArrayList<String> nombre = new ArrayList<String>();
		
		nombre.add("Mar�");
		nombre.add("Jes�s");
		nombre.add("Manolo");
		nombre.add("Adri�n");
		nombre.add("Jos�");
		nombre.add("Fran");
		
		for (String n : nombre) {
			System.out.println(n);
		}

	}

}
