import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("C:/Users/ik012982i9/Desktop/deportistas.txt");
		Scanner scan = new Scanner(fichero);
		
		int contar_linea = 0;
		
		//contar todas las lineas del fichero
		while (scan.hasNextLine()){
			String linea_contar = scan.nextLine();
			contar_linea++;
		}
		//declarar la matriz dependiendo las lineas que tiene el fichero
		String[][] matriz = new String[contar_linea][2];
		
		//recorremos el fichero diviendo las 2 palabras de cada linea
		int leer_linea = 0;
		Scanner leer = new Scanner (fichero);
		while (leer.hasNextLine() && leer_linea < contar_linea ) {
			String linea = leer.nextLine();
			matriz[leer_linea] = linea.split(" ");
			leer_linea++;

		}
		//mostrar la matriz
		for (int i = 0; i < matriz.length;i++){
			for(int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] +" ");
			}
			System.out.println("");
		}

	}

}
