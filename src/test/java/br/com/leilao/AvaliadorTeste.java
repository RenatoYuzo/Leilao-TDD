package br.com.leilao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AvaliadorTeste {
	
	@Test
	public void deveAvaliarQuemGanhouLeilao() {
		
		Avaliador a = new Avaliador();
		Leilao leilao = new Leilao();
		
		leilao.propoe(new Lance("Jao", 1000.0));
		leilao.propoe(new Lance("Maria", 2000.0));
		leilao.propoe(new Lance("ze", 3000.0));
		leilao.propoe(new Lance("Chico", 4000.0));
		leilao.propoe(new Lance("Chico", 500.0));
		
		String nome = a.verificaGanhador(leilao);
		
		assertEquals(nome, "Chico");
		
	}
	
	@Test
	public void deveAvaliarMaiorValorOfertado() {
		// cenario
		Avaliador a = new Avaliador();
		Leilao leilao = new Leilao();
		leilao.propoe(new Lance("Jao", 1000.0));
		leilao.propoe(new Lance("Maria", 2000.0));
		leilao.propoe(new Lance("ze", 3000.0));
		leilao.propoe(new Lance("Chico", 4000.0));
		leilao.propoe(new Lance("Chico", 500.0));
		
		// acao
		double maiorValor = a.verificaMaiorValorOfertado(leilao);
		
		// validacao	
		assertEquals(4000.0, maiorValor, 0.001);
	}
	
	public void deveProibirProporMaisDe3LancesPorUsuario() {
		
	}
	
	public void deveProibirPropor2LancesSeguidosPeloMesmoUsuario() {
		
	}

}
