package usandoScanner;

import java.util.Scanner;

public class RestodaDivisao {

	/* Ler dois números através da instanciação do objeto teclado da classe Scanner
	 * mostra o resto inteiro da divisão entre os dois números, usando cast explícito!
	 */
	
	static float x;
	static float y;
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 1º Número: ");
		x = teclado.nextFloat();
		
		System.out.println("Digite 2º Número: ");
		y = teclado.nextFloat();
		
		System.out.println("Resto Inteiro da Divisão = " + (int)(x/y));
		
	}

}
