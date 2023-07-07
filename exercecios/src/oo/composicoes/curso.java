package oo.composicoes;

import java.util.ArrayList;
import java.util.List;

public class curso {
	final String nome;
	final List<alunos> alunos = new ArrayList<>();
	
	curso(String nome){
		this.nome = nome;
	}
	void adicionarAluno(alunos aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}
