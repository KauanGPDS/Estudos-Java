package fundamentos;

import javax.swing.JOptionPane;

public class StringNumero {
	public static void main(String[] args) {
	  String s = JOptionPane.showInputDialog(
			  "Digite algo: ");
	  String s2 = JOptionPane.showInputDialog(
			  "Digite algo denovo: ");
	  
	  System.out.println(s + s2);
	  
	  double numero1 = Double.parseDouble(s);
	  double numero2 = Double.parseDouble(s2);
	  
	  double soma = numero1 + numero2;
	  
	  System.out.println("A soma é " + soma );
	  System.out.println("A media é " + soma/2);
	  
	  
	  
	  
	}
		
				
	}


