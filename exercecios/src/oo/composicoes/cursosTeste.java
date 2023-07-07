package oo.composicoes;

public class cursosTeste {
	public static void main(String[] args) {
		alunos a1 = new alunos("Marta");
		alunos a2 = new alunos("Matheus");
		alunos a3 = new alunos("Maria");
		
		curso c1 = new curso("Java");
		curso c2 = new curso("Html E Css");
		curso c3 = new curso("JavaScript");
		
		c1.adicionarAluno(a1);
		c2.adicionarAluno(a2);
		
		c3.adicionarAluno(a3);
		c3.adicionarAluno(a2);
		c3.adicionarAluno(a1);
		
		a1.adicionarAlunos(c2);
		
		for(alunos aluno:c1.alunos){
			System.out.println("Curso de java, esta matriculado " + aluno.nome);
		}
		
		System.out.println(a1.cursos.get(0).alunos);
		
		curso cursoEncontrado = a1.obterCursoPorNome("Java");
		if(cursoEncontrado != null){
			System.out.println(cursoEncontrado.alunos);
			
		}
	}

}
