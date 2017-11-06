import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ejercicio01 {
	
	/*public static boolean multiplo_de_3 (int[] numeros){
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i] % 3 == 0){
				
			}
		}
		
		return true;
	}*/

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D:/mifichero.txt");
		Scanner scan = new Scanner(fichero);
		
			String linea = scan.nextLine();
			String[] cadena = linea.split(" ");

		for (int i = 0; i < cadena.length ; i++){
			
		}

	}

}
