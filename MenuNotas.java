import java.util.Scanner;

public class MenuFiguras{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int num;
		int altura;
		String letra = " ";

		System.out.println("Inicio del bucle...\n\nBienvenido al programa: ");
		

		do{
			do{
				System.out.println("\nMENU INTERACTIVO FIGURAS GEOMÉTRICAS:\n1. Cuadrado relleno\n2. Cuadrado vacio\n3. Triángulo izquierda\n4. Triángulo derecha\n5. Triángulo invertido\n6. Pirámide");
				num = Integer.parseInt(teclado.nextLine());
				if(num < 1 || num > 6){
				System.out.println("Número no encontrado en el menú. Repita.");
				} else {
				System.out.println("Creando figura geométrica...");
				}
			} while(num < 1 || num > 6);

			if (num == 1){
				System.out.println("Usted ha elegido la figura del cuadrado con relleno ");
				System.out.println("Introduzca la altura deseada: ");
				altura = Integer.parseInt(teclado.nextLine());

				for(int i = 1; i <= altura; i++){
					for(int j = 1; j <= altura; j++){
						System.out.print(" *");
					}
					 System.out.println();
				}
				System.out.println("Figura terminada\n");
			}

			if (num == 2){
				System.out.println("Usted ha elegido la figura del cuadrado vacído");
				System.out.println("Introduzca la altura deseada: ");
				altura = Integer.parseInt(teclado.nextLine());

				for(int i = 1; i <= altura; i++){
					for(int j = 1; j <= altura; j++){
						if(i == 1 || i == altura || j == 1 || j == altura){
							System.out.print("* ");
						} else{
							System.out.print("  ");
						}
					}
					 System.out.println();
				}
				System.out.println("Figura terminada\n");
			}

			if(num == 3){
				System.out.println("Usted ha elegido la figura del triángulo alineado a la izquieda");
				System.out.println("Introduzca la altura deseada: ");
				altura = Integer.parseInt(teclado.nextLine());

				for(int i = 1; i <= altura; i++){
					for(int j = 1; j <= i; j++){
						System.out.print("*");
					}
					 System.out.println();
				}
				System.out.println("Figura terminada\n");
			}

			if(num == 4){
				System.out.println("Usted ha elegido la figura del triángulo alineado a la derecha");
				System.out.println("Introduzca la altura deseada: ");
				altura = Integer.parseInt(teclado.nextLine());

				for(int i = 1; i <= altura; i++){
					for(int j = 1; j <= altura-i; j++){
						System.out.print(" ");
					}
					
					for(int k = 1; k <= i; k++){
					System.out.print("*");
					}
					System.out.println();
				}	
				System.out.println("Figura terminada\n");
			}

			if(num == 5){
				System.out.println("Usted ha elegido la figura del triangulo invertido");
				System.out.println("Introduzca la altura deseada: ");
				altura = Integer.parseInt(teclado.nextLine());

				for(int i = altura; i >= 1; i--){
					for(int j = 1; j <= i; j++){
						System.out.print("* ");
					}
					System.out.println();
				}
				System.out.println("Figura terminada\n");
			}

			if(num == 6){
				System.out.println("Usted ha elegido la figura de la pirámide");
				System.out.println("Introduzca la altura deseada: ");
				altura = Integer.parseInt(teclado.nextLine());

				for(int i = 1; i <= altura; i++){
					for(int j = 1; j <= altura-i; j++){
						System.out.print(" ");
					}
					for(int k = 1; k <= (i*2)-1; k++){
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println("Figura terminada\n");
			}

			System.out.println("¿Deseas seguir?\nSI -- S\nNO -- Cualquier tecla: ");
			letra = teclado.nextLine();

		} while(letra.equalsIgnoreCase("S"));
		
		System.out.println("\nFin del programa\nBucle terminado");
	}
}