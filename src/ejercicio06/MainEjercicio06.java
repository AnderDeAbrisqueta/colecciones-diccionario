package ejercicio06;

import java.util.HashMap;
import java.util.Scanner;

public class MainEjercicio06 {

	private static Scanner s;

	public static void main(String[] args) {
		HashMap<String, String> acceso = new HashMap<String, String>();
		
		String usuario;
		String clave;
		boolean entra = true;
		
		acceso.put("admin", "12345678");
		acceso.put("adar", "ac145ert");
		acceso.put("mbr", "ret78lk");
		
		System.out.println("===============================");
		System.out.println("  Acceso al área restringida");
		System.out.println("===============================\n");
		System.out.println("PARA ACCEDER TIENE 3 INTENTOS\n");
		
		s = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("\nPor favor, introduzca el nombre de usuario: ");
			usuario = s.nextLine();
			System.out.print("Introduzca la clave de acceso: ");
			clave = s.nextLine();
			
			if (acceso.containsKey(usuario)) {//Usuario correcto
				if (acceso.get(usuario).equals(clave)) {
					System.out.println("\n============================================");
					System.out.println("Acceso correcto, permiso al área restringida");
					System.out.println("============================================\n");
					entra = true;
					i = 3;
				} else {
					System.out.println("\nClave incorrecta. Por favor, vuelva a intentarlo");
					System.out.println("Le quedan " + (2 - i) + " intentos");
					entra = false;
				}
				
			} else {//Usuario Incorrecto
				System.out.println("\nEl usuario introducido es incorrecto");
				System.out.println("Le quedan " + (2 - i) + " intentos");
				entra = false;
			}
		}
		
		if (!entra) {
			System.out.println("\nLO SIENTO HA SUPERADO EL LÍMITE DE INTENTOS");
			System.out.println("\n=====================================");
			System.out.println(" No puede acceder al área restringida");
			System.out.println("=====================================\n");
		}

	}

}
