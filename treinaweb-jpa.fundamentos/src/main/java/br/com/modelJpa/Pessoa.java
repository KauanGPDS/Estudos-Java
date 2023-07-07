package br.com.modelJpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Pes_Pessoas")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Pes_id")
	private Long ind;
	@Column(name = "Pes_nome",nullable = false,length = 20)
	private String nome;
	@Column(name = "Pes_sobrenome",nullable = false,length = 30)
	private String sobrenome;
	@Column(name = "Pes_Idade",nullable = false,length = 30)
	private int idade;
	
	public Long getInd() {
		return ind;
	}
	public void setInd(Long ind) {
		this.ind = ind;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	

}
