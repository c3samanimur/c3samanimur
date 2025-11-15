import java.util.Scanner;

public class Palabras{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String palabra = "";
		String[] palabras = new String[5];

		for(int i = 0; i < palabras.length; i++){
			System.out.println("Introduce tu " + i + " palabra: ");
			palabras[i] = teclado.nextLine();
			if(palabras[i].equalsIgnoreCase("fin")){
				System.out.println("Palabra clave introducida, saliendo del bucle antes de terminar: ");
				break;
			}
		}
		do{
			System.out.print("\nMENU INTERACTIVO\n1. Letra\n2. Comprobar\n3. Palabra mas larga\n4. Invertir\n5. SALIR\nELIGE: ");
			int opcion = Integer.parseInt(teclado.nextLine());

			if(opcion == 5){
				System.out.println("Saliendo del programa...");
				break;
			}else if(opcion == 1){
				System.out.print("Introduce una letra: ");
				String respuesta = teclado.nextLine();
				char letra = respuesta.charAt(0);
				for(int i = 0; i < palabras.length; i++){
					if(palabras[i].charAt(0) == letra){
						System.out.println("La palabra " + palabras[i] + " empieza por la letra " + letra);
					}
				}
			}

		}while( 1 > 2);
		
	}
}