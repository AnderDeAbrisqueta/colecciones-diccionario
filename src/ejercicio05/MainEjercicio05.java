package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEjercicio05 {

	public static void main(String[] args) {
		ArrayList<Disco> album = new ArrayList<Disco>();// Creaci�n del Array List
		Scanner s = new Scanner(System.in);// Definici�n de s para introducir los datos

		// Declaraci�n de las variable
		String codigoItroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		String duracionIntroducidaString;
		int duracionIntroducida;
		int opcion = 0;
		int opcionListado;
		int limiteInferior;
		int limiteSuperior;

		// Creaci�n de los albumes
		album.add(new Disco("01", "AC DC", "T.N.T", "Rock", 42));
		album.add(new Disco("02", "AC DC", "Highway to Hell", "Rock", 41));
		album.add(new Disco("03", "AC DC", "Powerage", "Rock", 42));

		// Men�
		do {
			System.out.println("\n==============================");
			System.out.println("  Men�: Colecci�n de discos");
			System.out.println("==============================\n");
			System.out.println("1. Listado de discos");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar disco");
			System.out.println("4. Borrar disco");
			System.out.println("5. Salir\n");

			System.out.print("Por favor, introduzca una opci�n: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {

			case 1: // Listado
				do {
					System.out.println("\n==============================");
					System.out.println("  Men�: Listado de discos");
					System.out.println("==============================\n");
					System.out.println("1. Completo");
					System.out.println("2. Por autor");
					System.out.println("3. Por g�nero");
					System.out.println("4. Por rango de duraci�n del album");
					System.out.println("5. Ir a men�: Colecci�n de discos\n");

					System.out.print("Por favor, introduzca una opci�n: ");
					opcionListado = Integer.parseInt(s.nextLine());

					switch (opcionListado) {
					case 1:// Listado completo
						for (Disco d : album) {
							System.out.println(d);
						}
						break;

					case 2:// Listado por autor
						System.out.print("\nPor favor, introduce el autor del album: ");
						autorIntroducido = s.nextLine().toLowerCase();

						for (Disco d : album) {
							if (d.getAutor().equals(autorIntroducido)) {
								System.out.println(d);
							}
						}
						break;

					case 3:// Listado por g�nero
						System.out.print("\nPor favor, introduce el g�nero del album: ");
						generoIntroducido = s.nextLine().toLowerCase();

						for (Disco d : album) {
							if (d.getGenero().equals(generoIntroducido)) {
								System.out.println(d);
							}
						}
						break;

					case 4:// Listado por rango de duraci�n del album
						System.out.println("\nPor favor, introduzca el rango de duraci�n del album");
						System.out.print("L�mite inferior en minutos: ");
						limiteInferior = Integer.parseInt(s.nextLine());

						System.out.print("L�mite superior en minutos: ");
						limiteSuperior = Integer.parseInt(s.nextLine());

						for (Disco d : album) {
							if (d.getDuracion() <= limiteSuperior && d.getDuracion() >= limiteInferior) {
								System.out.println(d);
							}
						}
						break;

					default:
						break;
					}// Fin del switch del listado
				} while (opcionListado != 5);// Fin del bucle del listado
				break;

			case 2:// Nuevo disco
				System.out.println("\n=========================");
				System.out.println("       Nuevo disco");
				System.out.println("=========================\n");
				System.out.print("Por favor, introduzca el c�digo del disco: ");
				codigoItroducido = s.nextLine();

				// Declaraci�n de una variable booleana para salir del bucle
				boolean salida = true;

				do {
					for (Disco d : album) {
						salida = true;
						if (d.getCodigo().equals(codigoItroducido)) {
							System.out.println("\nEste c�digo ya existe");
							System.out.print("Por favor, introduzca otro c�digo: ");
							codigoItroducido = s.nextLine();
							salida = false;
						}
					}

				} while (salida == false);

				System.out.print("\nPor favor, Introduzca el autor: ");
				autorIntroducido = s.nextLine();
				System.out.print("Introduzca el t�tulo: ");
				tituloIntroducido = s.nextLine();
				System.out.print("Introduzca el g�nero: ");
				generoIntroducido = s.nextLine();
				System.out.print("Introduzca la duraci�n del album: ");
				duracionIntroducida = Integer.parseInt(s.nextLine());

				album.add(new Disco(codigoItroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
						duracionIntroducida));
				break;

			case 3:// Modificar album
				System.out.println("\n=========================");
				System.out.println("       Editar disco");
				System.out.println("=========================\n");
				System.out.print("Por favor, introduzca el c�digo del disco: ");
				codigoItroducido = s.nextLine();
				
				while (!album.contains(new Disco(codigoItroducido, "", "", "", 0))) {
					System.out.println("El c�digo no existe");
					System.out.print("Por favor, introduzca el c�digo del album: ");
					codigoItroducido = s.nextLine();
				}

				int j = 0;// Inicializaci�n del indice del c�digo
				
				for (int i = 0; i < album.size(); i++) {
					if (album.get(i).getCodigo().equals(codigoItroducido)) {
						j = i;
					}
				}

				System.out.println("\nIntroduzaca los nuevos valores");

				System.out.println("C�digo: " + album.get(j).getCodigo());
				System.out.print("Nuevo c�digo: ");
				codigoItroducido = s.nextLine();
				if (!codigoItroducido.equals("")) {
					album.get(j).setCodigo(codigoItroducido);
				}

				System.out.println("Autor: " + album.get(j).getCodigo());
				System.out.print("Nuevo autor: ");
				autorIntroducido = s.nextLine();
				if (!autorIntroducido.equals("")) {
					album.get(j).setAutor(autorIntroducido);
				}

				System.out.println("T�tulo: " + album.get(j).getCodigo());
				System.out.print("Nuevo T�tulo: ");
				tituloIntroducido = s.nextLine();
				if (!tituloIntroducido.equals("")) {
					album.get(j).setTitulo(tituloIntroducido);
				}

				System.out.println("G�nero: " + album.get(j).getCodigo());
				System.out.print("Nuevo g�nero: ");
				generoIntroducido = s.nextLine();
				if (!generoIntroducido.equals("")) {
					album.get(j).setGenero(generoIntroducido);
				}

				System.out.println("Duraci�n: " + album.get(j).getCodigo());
				System.out.print("Nueva duraci�n: ");
				duracionIntroducidaString = s.nextLine();
				if (!duracionIntroducidaString.equals("")) {
					album.get(j).setDuracion(Integer.parseInt(duracionIntroducidaString));
				}
				break;

			case 4:// Borrado de album
				System.out.println("\n=========================");
				System.out.println("       Borrar disco");
				System.out.println("=========================\n");
				System.out.print("Por favor, introduzca el c�digo del disco: ");
				codigoItroducido = s.nextLine();

				if (!album.contains(new Disco(codigoItroducido,"", "", "", 0))) {
					System.out.println("Lo siento, el c�digo introducido no existe.");
					} else {
					album.remove(album.indexOf(new Disco(codigoItroducido,"", "", "", 0)));
					System.out.println("Album borrado.");
					}
				break;

			default:
				break;
			}

		} while (opcion != 5);// Salida del men� principal

	}

}
