import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_ejemplo {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D:/mifichero.txt");
		Scanner scan = new Scanner(fichero);
		
		while(scan.hasNextLine()){
			String linea = scan.nextLine();
			System.out.println(linea);
		}

	}

}
