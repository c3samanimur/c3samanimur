import java.util.Scanner;

public class GraficoAsteriscos{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int[] numeros = {2, 4, -6, 9, 3, -2, 0, -9};
		int menor = numeros[0];
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i] < menor){
				menor = numeros[i];
			}
		}
		int espacios = Math.abs(menor);
		String texto = "";
		//int n : numers == int i = 0; i < numeros.length; i++
		for(int n : numeros){
			if(n < 0){
				for(int i = 0; i < (espacios-Math.abs(n)); i++){
					texto+=" ";
				}
				for(int i = 0; i < Math.abs(n); i++){
					texto+="*";
				}
				texto+="|";
			}else if(n >= 0){
				for(int i = 0; i < espacios; i++){
					texto+=" ";
				}
				texto+="|";
				for(int i = 0; i < Math.abs(n); i++){
					texto+="*";
				}
				
			}
			texto+="\n";

		}
		System.out.print(texto);
	}
}