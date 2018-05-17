package br.com.leilao;

public class Avaliador {

	public String verificaGanhador(Leilao leilao) {

		Lance maiorLance=null;
		double maiorValor = Double.NEGATIVE_INFINITY;
		
		for(Lance l : leilao.getLances()) {
			if(l.getValorLance() > maiorValor ) {
				maiorValor = l.getValorLance();
				maiorLance=l;
			}
		}
		
		return maiorLance.getNomeUsuario();
		
	}

	public double verificaMaiorValorOfertado(Leilao leilao) {
		
		double maiorValor = Double.NEGATIVE_INFINITY;
		
		for(Lance l : leilao.getLances()) {
			if(l.getValorLance() > maiorValor ) {
				maiorValor = l.getValorLance();
			}
		}
		
		return maiorValor;
	}

}
