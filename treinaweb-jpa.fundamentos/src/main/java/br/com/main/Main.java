package br.com.main;

import java.util.List;

import br.com.implement.PessoaService;
import br.com.interfaces.ICRUD;
import br.com.modelJpa.Pessoa;

public class Main {
	public static void main(String[] args) {
		ICRUD<Pessoa, Long> pessoaService = new PessoaService();
		try {
			List<Pessoa> pessoas = new pessoaService.all();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
