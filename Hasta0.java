import java.util.Scanner;

public class Hasta0{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador = 0;
		String letra = "";
		int menor = 100000;
		int mayor = -100000;

		while(true) {
			System.out.println("Introduce un número: ");
			num = Integer.parseInt(teclado.nextLine());
			if(contador < 2 && num == 0){
				System.out.println("No hay suficientes números para salir, sigue: ");
				continue;
			} else if( contador >= 2 && num == 0){
				System.out.print("\nHas introducido el número 0\nPulsa E para confirmar: ");
				letra = teclado.nextLine();
				if(letra.equalsIgnoreCase("e")){
					System.out.print("\nEl número más alto es " + mayor + "\nEl número mas pequeño es " + menor + "\n");
					break;
				} 
			} 
			if(num != 0){
				if(num > mayor){
					mayor = num;

				}
				if(num < menor){
					menor = num;
				}
				contador ++;
			}
			
			
		} 
			
		
	}
}





