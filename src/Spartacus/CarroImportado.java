package Spartacus;

public class CarroImportado extends Carro {
	
	String motor;
	
	
	public CarroImportado(){
		
	}

	public CarroImportado(String nome,String cor,String motor){
		super(nome,cor);
		this.motor=motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

}
