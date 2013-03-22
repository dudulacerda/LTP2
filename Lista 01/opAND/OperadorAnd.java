package opAND;

import java.util.Scanner;

public class OperadorAnd {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um nœmero: ");
		int num = teclado.nextInt();
		
		if (!((10<num)&&(num>=10))){
			System.out.println("O numero "+num+" est‡ fora do intervalo de 10 a 100");
		}
	}
}
