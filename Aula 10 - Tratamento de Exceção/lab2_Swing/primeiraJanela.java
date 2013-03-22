package lab2_Swing;

import javax.swing.JFrame;

public class primeiraJanela {									// Minha Classe Janela
	public primeiraJanela(){									// O construtor da janela
		JFrame frame = new JFrame();        					//Cria um objeto janela, a classe JFrame foi importada
		frame.setSize(350,400);									// O tamanho da janela
		frame.setVisible(true);									// diz que a janela Ž visivel.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// define que o x fecha a janela
		frame.setTitle("teste aula LTP2");						// titulo da janela
	}
	
	public static void main(String[] args){
		new primeiraJanela();									// Chama o construtor da janela
	}

}
