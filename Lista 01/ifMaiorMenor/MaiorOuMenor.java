package ifMaiorMenor;

import java.util.Scanner;

public class MaiorOuMenor {
	public static void main(String Args[]){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nœmero: ");
		float numero1 = teclado.nextFloat();
		
		System.out.println("Digite o segundo nœmero: ");
		float numero2 = teclado.nextFloat();
		
		if(numero1>numero2){
			System.out.println(numero1 + " Ž maior que " + numero2);
		} else {
			System.out.println(numero1 + " Ž menor que " + numero2);
		}	
	}
}
