package lab2_Swing;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosBotoes implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel labelCategoria = new JLabel("C—digo");
	JTextField textCategoria = new JTextField("");
	JButton cmdExcluir = new JButton("Excluir");
	JLabel labelStatus = new JLabel("Status");
	
	public void criarTela(){
		frame.setSize(290, 150);
		frame.setLocation(150, 200);
		frame.setTitle("Cadastro de Categorias");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		labelCategoria.setBounds(10, 10, 60, 20);
		textCategoria.setBounds(100, 10, 60, 20);
		
	}

}
