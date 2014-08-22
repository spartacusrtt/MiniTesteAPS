package Spartacus;

import java.util.ArrayList;
import java.util.List;

public class CadastrarCarro {
	
	private List<Carro> carro;
	
	public CadastrarCarro(){
		carro = new ArrayList <Carro>();
	}
	
	public void cadastrarCarro( String p, Spartacus g){
		carro.add(g.CriaAtributoCarro(p));
	}
	
	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}

	public List<Carro> getCarro(){
		return carro;
	}
	
}
