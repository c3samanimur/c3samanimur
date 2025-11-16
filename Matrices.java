import java.util.Scanner;

public class Matrices{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		int filas = pedirTamaño("Introduce el número de filas que deseas: ");
		int columnas = pedirTamaño("Introduce el número de columnas que deseas");
		int [][] matriz = new int [filas] [columnas];

		System.out.println("Rellena tu matriz\n");
		crearMatriz(matriz);

		System.out.println("Esta es tu matriz:\n");
		mostraMatriz(matriz);
	}
	public static int pedirTamaño(String enunciado){
		int tamaño;
		do{
			System.out.println(enunciado);
			tamaño = Integer.parseInt(teclado.nextLine());
			if(tamaño <= 0){
				System.out.println("\nERROR\nNúmero negativo o igual a cero\nREPITE\n");
			}
		} while(tamaño <= 0);
		return tamaño;
	}
	public static int pedirNumero(String enunciado){
		System.out.print(enunciado);
		int numero = Integer.parseInt(teclado.nextLine());
		return numero;
	}
	public static void crearMatriz(int[][] matriz){
		String texto = "";
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				String rellenar = "Posicion [" + 1 + "][" + j + "]: ";
				matriz[i][j] = pedirNumero(rellenar);
			}
		}
	}
	public static void mostraMatriz(int[][] matriz){
		for(int i = 0; i < matriz.length;i++){
			
			for(int j = 0; j < matriz[i].length;j++){
				System.out.print(" " + matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}