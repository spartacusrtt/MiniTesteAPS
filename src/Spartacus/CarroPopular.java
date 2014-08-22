package Spartacus;

public  class CarroPopular extends Carro {
	String trava;
	
	
	public CarroPopular(){
		
	}
	public CarroPopular (String nome,String cor,String trava){
		super(nome,cor);
		this.trava=trava;
	}
	
	
	public String getTrava() {
		return trava;
	}

	public void setTrava(String trava) {
		this.trava = trava;
	}

	
	
	
}
