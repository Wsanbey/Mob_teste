package negocio;

import entidades.Feedback;
import repositorio.FeedbackRepositorio;

public class FeedbackNegocio {

	private FeedbackRepositorio feedRepositorio;

	public FeedbackNegocio(FeedbackRepositorio fed) {
		this.feedRepositorio = fed;
	}

//	renomear variaveis metodos e parametros
	public boolean registrarFeedback(Feedback fed) {

		switch (fed.getCategoria()) {

		case "Comentario": {
			return fed.getTexto().length() < 200 ? feedRepositorio.addFeedback(fed) : false;

		}

		case "Denúncia": {
			return fed.getTexto().length() < 100 ? feedRepositorio.addFeedback(fed) : false;

		}

		case "Elogiar": {
			return fed.getTexto().length() < 200 ? feedRepositorio.addFeedback(fed) : false;

		}

		}

		return false;

	}
}
