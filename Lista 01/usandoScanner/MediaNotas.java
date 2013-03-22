package usandoScanner;

import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[] Args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a 1 nota: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a 2 nota: ");
		float nota2 = teclado.nextFloat();
		
		System.out.println("Digite a 3 nota: ");
		float nota3 = teclado.nextFloat();
		
		float media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Media = " + media);
	
	}

}
