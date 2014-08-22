package Spartacus;

public class CriarCarroImportado implements Spartacus {

	public Carro CriaAtributoCarro(String p) {
		CarroImportado carro1 = new CarroImportado();
		
		carro1.setNome(null);
		carro1.setCor(null);
		carro1.setMotor(null);
		return carro1;
		
	
	} 

}
