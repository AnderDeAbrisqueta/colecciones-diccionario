package ejercicio01;

import java.util.ArrayList;

public class MainEjercicio01 {

	public static void main(String[] args) {
		ArrayList<String> nombre = new ArrayList<String>();
		
		nombre.add("Marí");
		nombre.add("Jesús");
		nombre.add("Manolo");
		nombre.add("Adrián");
		nombre.add("José");
		nombre.add("Fran");
		
		for (String n : nombre) {
			System.out.println(n);
		}

	}

}
