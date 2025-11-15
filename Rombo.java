import java.util.Scanner;

public class Rombo{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la altura deseada para tu rombo: ");
		int altura = Integer.parseInt(teclado.nextLine());

		for(int i = 0; i < altura; i++){
			for(int j = 0; j < altura-1-i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < (i*2)-1 ; k++){
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		for(int i = altura-2; i >= 0; i--){
			for(int j = 0; j < altura-1-i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < (i*2)-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}