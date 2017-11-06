import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicio01 {

	public static boolean multiplo_de_3(int numero) {
		boolean multiplo = true;
			if (numero % 2 == 0) {
				return multiplo = true;

			}
			else {
				return multiplo = false;
			}
		

		
	}

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("C:/Users/Jon Jauregi/Desktop/datos/mifichero.txt");
		Scanner scan = new Scanner(fichero);

		String linea = scan.nextLine();
		String[] cadena = linea.split(" ");

		for (int i = 0; i < cadena.length; i++) {
			int numero = Integer.parseInt(cadena[i]);
			if (multiplo_de_3(numero)== true){
				System.out.println("El numero " + numero + " es multiplo de 3");
			}
			
		}

	}

}
