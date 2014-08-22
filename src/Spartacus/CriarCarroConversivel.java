package Spartacus;

import java.util.LinkedList;
import java.util.List;

public class CriarCarroConversivel implements Spartacus{

	public Carro CriaAtributoCarro (String p) {
		CarroConversivel Pcarro1 = new CarroConversivel();
		
		Pcarro1.setNome(null);
		Pcarro1.setCor(null);
		Pcarro1.setTetoSolar(null);
		return Pcarro1;
	}

}
