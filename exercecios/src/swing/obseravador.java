package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class obseravador {
	public static void main(String[] args) {
		
		JFrame janele = new JFrame("Observador");
		janele.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janele.setSize(600,200);
		janele.setLayout(new FlowLayout());
		janele.setLocationRelativeTo(null);
		
		JButton botao = new JButton("Clicar");
		janele.add(botao);
		
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento Ocorreu!!");
				
			}
		});
		
		janele.setVisible(true);
	}

}
