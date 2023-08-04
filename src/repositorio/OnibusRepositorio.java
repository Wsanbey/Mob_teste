package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Onibus;

public class OnibusRepositorio {
	List<Onibus> onibusLista = new ArrayList<>();

	public boolean addOnibus(Onibus o) {
		return this.onibusLista.add(o);

	}

	public Onibus buscarLinha(int valor) {
		Onibus achou = null;

		for (Onibus tem : onibusLista) {

			if (tem.getNumero() == valor) {
				achou = tem;
				break;
			}
		}

		return achou;

	}

	public boolean removerLinha(int valor) {
		boolean achou = false;
		int index = 0;

		for (Onibus tem : onibusLista) {
			if (tem.getNumero() == valor) {
				achou = true;
				break;
			}

			index++;
		}

		if (achou) {
			onibusLista.remove(index);
		} else {
			achou = false;
		}

		return achou;

	}
}
