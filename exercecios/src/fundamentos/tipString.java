package fundamentos;

public class tipString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!!"));
		
		System.out.println(s + "!!!");
		System.out.println(s.toUpperCase().endsWith("Tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var Idade = 33;
		var salario = 12345.987;
		System.out.println("Nome: " + nome + "\nsobrenome: " + sobrenome + 
				"\nidade  " + Idade + 
				"\nsalario: " + salario);
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",nome,sobrenome,Idade,salario);
		
	String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.",nome,sobrenome,Idade,salario);
	
     System.out.println(frase);
	}
}
