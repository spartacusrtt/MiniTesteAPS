package Spartacus;

public class CarroConversivel extends Carro{
	String tetoSolar;
	
	public CarroConversivel(){
		
	}
	
	public CarroConversivel(String nome,String cor,String tetoSolar){
		super(nome,cor);
		this.tetoSolar=tetoSolar;
	}

	public String getTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(String tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	


	
	
}
