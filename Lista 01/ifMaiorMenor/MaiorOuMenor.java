package ifMaiorMenor;

import java.util.Scanner;

public class MaiorOuMenor {
	public static void main(String Args[]){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		float numero1 = teclado.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float numero2 = teclado.nextFloat();
		
		if(numero1>numero2){
			System.out.println(numero1 + " � maior que " + numero2);
		} else {
			System.out.println(numero1 + " � menor que " + numero2);
		}	
	}
}
