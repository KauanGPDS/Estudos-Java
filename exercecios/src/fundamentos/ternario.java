package fundamentos;

public class ternario {
	public static void main(String[] args) {
		double nota = 4;
		String recuperacao = nota >= 5.0 ? 
				"Em recuperaçao" : "Reprovado";
		String resultado = nota >= 7.0 ? 
				"Aprovado" : recuperacao;
		
		System.out.println("O aluno está" + resultado);
	}

}
