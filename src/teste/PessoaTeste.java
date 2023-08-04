package teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
 
import org.junit.Test;
 
import entidades.Pessoa;
import negocio.PessoaNegocio;
import repositorio.PessoaRepositorio;

public class PessoaTeste {

	@Test
	public void cadastrarPessoaTest() {
		Pessoa u = new Pessoa(1, "João da Silva", 
				"123.456.789-00", "Rua das Flores, 123", 
				"Centro", "12345-678", 
				"(81) 98765-4321","welldousa@gmail.com",
				"A000000");
		
		PessoaRepositorio ur = new PessoaRepositorio();
		
		PessoaNegocio un = new PessoaNegocio(ur);
		
		Boolean cadastrou = un.cadastrarPessoa(u);
		assertTrue(cadastrou);
	}
	
	
	@Test
	public void invalidarTamanhoDoNome() {
		Pessoa u = new Pessoa(1, "João da Silva Silva Leite Leatdes", 
				"123.456.789-00", "Rua das Flores, 123", 
				"Centro", "12345-678", "(81) 98765-4321",
				"welldousa@gmail.com",
				"A000000");
		
		PessoaRepositorio ur = new PessoaRepositorio();
		
		PessoaNegocio un = new PessoaNegocio(ur);
		
		Boolean cadastrou = un.cadastrarPessoa(u);
		assertFalse(cadastrou);
	}
	
	
	@Test
	public void telefoneInvalido() {
		Pessoa u = new Pessoa(1, "João da Silva",
				"123.456.789-00", "Rua das Flores, 123", 
				"Centro", "12345-678", "(01) 91234-5678",
				"welldousa@gmail.com",
				"A000000");
		PessoaRepositorio ur = new PessoaRepositorio();
		
		PessoaNegocio un = new PessoaNegocio(ur);
		
		Boolean cadastrou = un.cadastrarPessoa(u);
		assertFalse(cadastrou);
	}
	 
	@Test
	public void CEPInvalido() {
		Pessoa u = new Pessoa(1, "João da Silva",
				"123.456.789-00", "Rua das Flores, 123", 
				"Centro", "12345-678910", "(81) 91234-5678",
				"welldousa@gmail.com",
				"A000000");
		PessoaRepositorio ur = new PessoaRepositorio();
		
		PessoaNegocio un = new PessoaNegocio(ur);
		
		Boolean cadastrou = un.cadastrarPessoa(u);
		assertFalse(cadastrou);
	}
	 
}
