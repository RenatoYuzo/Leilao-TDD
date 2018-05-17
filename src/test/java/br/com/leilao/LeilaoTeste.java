package br.com.leilao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeilaoTeste {
	
	@Test
	public void deveTestarUmLeilaoComUmLance() {
		
		Leilao leilao = new Leilao();
		leilao.propoe(new Lance("Jao", 125.0));
		
		assertEquals(1, leilao.getLances().size());
	}
	
	@Test
	public void deveTestarUmLeilaoComDoisLances() {
		
		Leilao leilao = new Leilao();
		leilao.propoe(new Lance("Jao", 125.0));
		leilao.propoe(new Lance("Maria", 225.0));
		
		assertEquals(2, leilao.getLances().size());
	}

}
