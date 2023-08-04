package teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entidades.Onibus;
import negocio.OnibusLinhaNegocio;
import repositorio.OnibusRepositorio;

public class OnibusLinhaTeste {

	@Test
	public void cadastraLinhaTeste() {
		Onibus o = new Onibus("Alto Bondade", 123, "Miragem");

		OnibusRepositorio oR = new OnibusRepositorio();

		OnibusLinhaNegocio oN = new OnibusLinhaNegocio(oR);

		Boolean cadastrou = oN.cadastrarLinha(o);

		assertTrue(cadastrou);
	}

	@Test
	public void buscarLinhaTeste() {

		Onibus o = new Onibus("Alto Bondade", 123, "Miragem");

		OnibusRepositorio oR = new OnibusRepositorio();

		OnibusLinhaNegocio oN = new OnibusLinhaNegocio(oR);

		oN.cadastrarLinha(o);

		Onibus existe = oR.buscarLinha(o.getNumero());

		assertNotNull(existe);
	}

	@Test
	public void apagarLinhaTeste() {

		Onibus o = new Onibus("Alto Bondade", 123, "Miragem");
 
		OnibusRepositorio oR = new OnibusRepositorio();

		OnibusLinhaNegocio oN = new OnibusLinhaNegocio(oR);

		oN.cadastrarLinha(o);
	 
		Boolean existe = oN.apagarLinha(o.getNumero());

		assertTrue(existe);
	}
}
