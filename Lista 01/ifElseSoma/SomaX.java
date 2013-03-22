package ifElseSoma;

import java.util.Scanner;

public class SomaX {
	public static void main(String Args[]){
		
		int x = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nœmero: ");
		int A = teclado.nextInt();
		
		System.out.println("Digite o segundo nœmero: ");
		int B = teclado.nextInt();
		
		x = A + B;
		
		if(x>=10){
			System.out.println("X + 5 = "+(x+5));
		} else {
			System.out.println("X + 7 = "+(x+7));
		}
	}
}
