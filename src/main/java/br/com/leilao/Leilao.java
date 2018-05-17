package br.com.leilao;
import java.util.ArrayList;
import java.util.List;

public class Leilao {

	private List<Lance> lances;
	
	public Leilao() {
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		lances.add(lance);
	}

	public List<Lance> getLances() {
		return lances;
	}
	
}