package negocio;

import entidades.Onibus;
import repositorio.OnibusRepositorio;

public class OnibusLinhaNegocio {

	private OnibusRepositorio onibus;

	public OnibusLinhaNegocio(OnibusRepositorio oR) {
		this.onibus = oR;

	}

	public boolean cadastrarLinha(Onibus o) {
		if (o.getNumero() <= 999 && o.getNumero() >= 0) // Validando numero do onibus
		{
			return onibus.addOnibus(o);
		}

		return false;
	}

	public Onibus buscarLinha(int i) {
		if (i <= 999 && i >= 0) // Validando numero do onibus
		{
			return onibus.buscarLinha(i);
		}

		return null;
	}

	public boolean apagarLinha(int i) {
		if (i <= 999 && i >= 0) // Validando numero do onibus
		{
			return onibus.removerLinha(i);
		}
		return false;
	}

}
