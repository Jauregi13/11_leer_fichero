import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_ejercicio03 {
	/*
	 * Menu con funciones teniendo articulo.txt 1- contar palabras 2- contar
	 * cuantas veces aparece una palabra introducida por teclado 3- contar
	 * cuantas veces aparece la vocal 'a' 4- introducir un numero por teclado y
	 * que saque la suma del mismo con sus inferiores 5- introducir un numero
	 * por teclado y sacar por pantalla los multiplos de 5 inferiores 6-
	 * utilizad funciones para que el main quede mejor estructurado y simple
	 */
	
	public static int contar_lineas(File fichero) throws FileNotFoundException{
		int contador_linea = 0;
		Scanner contar_linea = new Scanner(fichero);
		while (contar_linea.hasNextLine()){
			String linea = contar_linea.nextLine();
			contador_linea++;
		}
		return contador_linea;
	}

	public static int contar_palabras(File fichero) throws FileNotFoundException {
		int contador = 0;
		Scanner leer_fichero = new Scanner(fichero);
		
		String[][] palabras = new String[contar_lineas(fichero)][];
		
		while(leer_fichero.hasNextLine()){
			
			
		}

		return contador;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		final int CONTAR_PALABRAS = 1;
		final int CONTAR_PALABRA = 2;
		final int CONTAR_A = 3;
		final int SUMAR = 4;
		final int MULTIPLO_5 = 5;
		final int SALIR = 6;
		
		File fichero = new File("C:/Users/ik012982i9/Desktop/articulo.txt");
		
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Elige una de estas opciones:");
			System.out.println("----------MENU----------");
			System.out.println(CONTAR_PALABRAS +". Contar palabras del fichero");
			System.out.println(CONTAR_PALABRA + ". Contar cuantas veces sale la palabra introducida por el teclado");
			System.out.println(CONTAR_A + ". Contar cuantas veces aparece la vocal a");
			System.out.println(SUMAR + ". Introducir un numero por teclado y que saque la suma del mismo con sus inferiores");
			System.out.println(MULTIPLO_5 + ". introducir un numero por teclado y sacar por pantalla los multiplos de 5 inferiores");
			System.out.println(SALIR + ". Salir");
			opcion = lector.nextInt();
			
			switch(opcion){
			case CONTAR_PALABRAS:
				
			
			case CONTAR_PALABRA:
			
			case CONTAR_A:
			
			case SUMAR:
			
			case MULTIPLO_5:
			
			case SALIR:
				
			}
		}
		while(opcion != SALIR);
	
	}
}
