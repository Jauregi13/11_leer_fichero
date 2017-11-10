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
		
		int num_linea = 0;
		String[][] palabras = new String[contar_lineas(fichero)][];
		
		
		while(leer_fichero.hasNextLine()){
			String linea = leer_fichero.nextLine();
			palabras[num_linea] = linea.split(" "); 
			contador = contador + palabras[num_linea].length;
			num_linea++;
			
		}

		return contador;
	}
	
	public static int contar_palabra (String palabra, File fichero) throws FileNotFoundException{
		int contador = 0;
		Scanner leer_fichero = new Scanner(fichero);
		
		String[][] lineas = new String[contar_lineas(fichero)][];
		int num_linea = 0;
		
		while (leer_fichero.hasNextLine()){
			String linea = leer_fichero.nextLine();
			lineas[num_linea] = linea.split(" ");
			
			for (int i = 0; i < lineas[num_linea].length; i++){
				if (palabra.equals(lineas[num_linea][i])){
					contador ++;
				}
			}
			
			num_linea++;
		}
		return contador;
	}
	
	public static int contarA (char caracter1, File fichero) throws FileNotFoundException{
		int contador = 0;
		
		Scanner leer_fichero = new Scanner (fichero);
		
		String[][] lineas = new String[contar_lineas(fichero)][];
		int num_linea = 0;
		
		while(leer_fichero.hasNextLine()){
			lineas[num_linea] = leer_fichero.nextLine().split(" ");
			for (int i = 0; i < lineas[num_linea].length; i++){
				for (int j = 0; j < lineas[num_linea][i].length(); j++){
					char caracter2 = lineas[num_linea][i].charAt(j);
					
					if (Character.compare(caracter1, caracter2) == 0){
						contador++;
					}
				}
				
			}
			
		}
		return contador;
	}
	
	public static int sumarNumeros(int numero){
		int suma_total = numero;
		for (int i = numero -1; i > 0; i--){
			
			suma_total = suma_total + i;
		}
		return suma_total;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		final int CONTAR_PALABRAS = 1;
		final int CONTAR_PALABRA = 2;
		final int CONTAR_A = 3;
		final int SUMAR = 4;
		final int MULTIPLO_5 = 5;
		final int SALIR = 6;
		
		File fichero = new File("C:/Users/ik012982i9/Desktop/articulo.txt");
		//Scanner leer_fichero = new Scanner(fichero);
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
			opcion = Integer.parseInt(lector.nextLine());
			
			switch(opcion){
			case CONTAR_PALABRAS:
				System.out.println("Este fichero tiene esta cantidad de palabras:");
				System.out.println(contar_palabras(fichero));
				
				break;
			
			case CONTAR_PALABRA:
				System.out.println("Introduce una palabra:");
				String palabra = "";
				palabra = lector.nextLine();
				
				System.out.println("La palabra " +"\'"+ palabra + "\' aparece " + contar_palabra(palabra,fichero) + " vece(s)");
				break;
			
			case CONTAR_A:
				char caracter = 'a';
				
				System.out.println(contarA(caracter,fichero));
				break;
			
			case SUMAR:
				System.out.println("Introduce un numero:");
				int numero = Integer.parseInt(lector.nextLine());
				
				System.out.println("La suma de los numeros es: " + sumarNumeros(numero));
				break;
			
			case MULTIPLO_5:
				
				break;
			
			case SALIR:
				System.out.println("Saliendo...");
			
			default:
				System.out.println("Numero introducido incorrecto");
			}
		}
		while(opcion != SALIR);
		
		System.out.println("Fin de programa");
	
	}
}
