import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("C:/Users/ik012982i9/Desktop/deportistas.txt");
		Scanner scan = new Scanner(fichero);

		String[][] matriz = new String[6][2];
		int contar_linea = 0;

		while (scan.hasNextLine() && contar_linea < 6) {
			String linea = scan.nextLine();
			matriz[contar_linea] = linea.split(" ");
			contar_linea++;

		}
		
		for (int i = 0; i < matriz.length;i++){
			for(int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] +" ");
			}
			System.out.println("");
		}

	}

}
