package br.com.leilao;
import java.util.ArrayList;
import java.util.List;

public class Leilao {

	private List<Lance> lances;
	
	public Leilao() {
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		if (lances.isEmpty()) {
			lances.add(lance);
		}	
		else {
			String nomeUltimoLance = lances.get(lances.size()-1).getNomeUsuario();
			
			int contador=0;
			for (Lance l : lances) {
				if(lance.getNomeUsuario().equals(l.getNomeUsuario())) {
					contador++;
				}
			}
			
			if(!nomeUltimoLance.equals(lance.getNomeUsuario()) && contador<=3) {
				lances.add(lance);
			}
		}
	}

	public List<Lance> getLances() {
		return lances;
	}
	
}