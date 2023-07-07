package oo.composicoes;

import java.util.ArrayList;
import java.util.List;

public class alunos {
	final String nome;
	final List<curso>cursos = new ArrayList<>();
	alunos(String nome){
		this.nome = nome;
	}
	
	void adicionarAlunos(curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	curso obterCursoPorNome(String nome){
		for(curso curso:this.cursos){
			if(curso.nome.equalsIgnoreCase(nome)){
				return curso;
			}
		}
		return null;
	}
	public String toString(){
		return "O meu nome é " + nome;
	}
	
	

}
