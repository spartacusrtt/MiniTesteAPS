package Spartacus;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CarroTest {
	private CadastrarCarro cadastro;
	
	
	@Before
	public void criar(){
		cadastro = new CadastrarCarro();
	}

	@Test
	public void cadastrarCarroPopular() {
		String carro1= null;
		cadastro.cadastrarCarro(carro1, new CriarCarroPopular());
		Assert.assertEquals(1, cadastro.getCarro().size());
		
	}
	@Test
	public void cadastrarCarroConversivel() {
		String carro2= null;
		cadastro.cadastrarCarro(carro2, new CriarCarroConversivel());
		Assert.assertEquals(1, cadastro.getCarro().size());
	}
	
}
