package negocio;

import entidades.Pessoa;
import repositorio.PessoaRepositorio;

public class PessoaNegocio {

	private PessoaRepositorio repo;

	public PessoaNegocio(PessoaRepositorio rep) {
		this.repo = rep;
	}

	public boolean cadastrarPessoa(Pessoa p) {

		if (!validarNome(p.getNome())) {
			return false;

		}

		if (!validarTelefone(p.getTelefone())) {
			return false;
		}

		if (!validarCEP(p.getCep())) {
			return false;
		}

		repo.addPessoa(p);

		return true;
	}

	public boolean validarNome(String nome) {
		if (nome.length() <= 20) {
			return true;
		}

		return false;
	}

	public static boolean validarTelefone(String telefone) {
		String numeros = telefone.replaceAll("[^\\d]", "");

		if (numeros.length() != 11) {
			return false;
		}

		if (!numeros.startsWith("8")) {
			return false;
		}

		return true;
	}

	public static boolean validarCEP(String cep) {
		String numeros = cep.replaceAll("[^\\d]", "");

		if (numeros.length() != 8) {
			return false;
		}

		return true;
	}
}
