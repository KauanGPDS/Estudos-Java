package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excessao.ExplosaoException;

class CampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}

	@Test
	void TesteVzinhoReal() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDistancia1Direita() {
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDistancia1EmCima() {
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDistancia1EmBaixo() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDistancia2() {
		Campo vizinho = new Campo(2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizN() {
		Campo vizinho = new Campo(1,1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}


	@Test
	void testeAlternarMarcacao() {
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAlterna1Marcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAbrir() {
		
		assertTrue(campo.abrir());
	}
	

	@Test
	void testeAbrir1() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirMinado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrrminado() {
		
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	@Test
	void testerabrircom() {
		Campo vizinhos1 = new Campo(1,1);
		Campo vizinhos2 = new Campo(2,2);
		vizinhos2.adicionarVizinho(vizinhos1);
		campo.adicionarVizinho(vizinhos1);
		campo.abrir();
		
		assertTrue(vizinhos1.isAberto() && vizinhos2.isAberto());
		
		
	}
	@Test
	void testerabrircom2() {
		Campo vizinhos1 = new Campo(1,1);
		Campo vizinhos11 = new Campo(1,1);
		campo.minar();
		
		Campo vizinhos2 = new Campo(2,2);
		vizinhos2.adicionarVizinho(vizinhos1);
		vizinhos2.adicionarVizinho(vizinhos11);
		
		campo.adicionarVizinho(vizinhos2);
		campo.abrir();
		
		assertTrue(!vizinhos1.isAberto() && vizinhos2.isAberto());
		
		
	}

}
