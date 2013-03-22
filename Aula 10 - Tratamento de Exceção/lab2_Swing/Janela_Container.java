package lab2_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela_Container {

	public Janela_Container(){									
		JFrame frame = new JFrame();
		frame.setSize(350,400);									
		frame.setVisible(true);									
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setTitle("Janela com Botao");
		
		
		JLabel labelCategoria = new JLabel("Código");
		labelCategoria.setVisible(true);
		labelCategoria.setBounds(10, 10, 60, 20);
		frame.add(labelCategoria);
		
		JButton botao = new JButton("Clique");						//Cria um objeto Botao da classe JButton (importada)
		botao.setVisible(true);
		botao.setBounds(200, 10, 80, 20);							//setBounds seta a posição x,y e o tamanho altura,largura
		frame.add(botao);
		
		
		JTextField caixaTexto = new JTextField("Clique Aqui");
		caixaTexto.setVisible(true);
		caixaTexto.setBounds(80, 10, 100, 20);
		frame.add(caixaTexto);
	
	}
	
	
	public static void main(String[] args) {
		new Janela_Container();
	}

}
