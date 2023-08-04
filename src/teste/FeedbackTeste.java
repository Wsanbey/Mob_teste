package teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entidades.Feedback;
import negocio.FeedbackNegocio;
import repositorio.FeedbackRepositorio;

public class FeedbackTeste {

	@Test
	public void comentarioTeste() {
		Feedback feed = new Feedback(1, "Comentario", 123, "Jo�o Silva",
				"Em primeiro lugar, � importante destacar que a regularidade e "
						+ "pontualidade dos �nibus t�m sido satisfat�rias, o "
						+ "que facilita muito o planejamento de minha rotina di�ria");

		FeedbackRepositorio fR = new FeedbackRepositorio();

		FeedbackNegocio fN = new FeedbackNegocio(fR);

		Boolean comentar = fN.registrarFeedback(feed);

		assertTrue(comentar);

	}

	@Test
	public void denunciaTeste() {
		Feedback feed = new Feedback(1, "Den�ncia", 123, "Jo�o Silva",
				"Em primeiro lugar, o servi�o nao foi legal");

		FeedbackRepositorio fR = new FeedbackRepositorio();

		FeedbackNegocio fN = new FeedbackNegocio(fR);

		Boolean comentar = fN.registrarFeedback(feed);

		assertTrue(comentar);

	}

	@Test
	public void elogioTeste() {
		Feedback feed = new Feedback(1, "Elogiar", 123, "Jo�o Silva",
				"Em primeiro lugar, � importante destacar que a regularidade e "
						+ "pontualidade dos �nibus t�m sido satisfat�rias, o "
						+ "que facilita muito o planejamento de minha rotina di�ria");

		FeedbackRepositorio fR = new FeedbackRepositorio();

		FeedbackNegocio fN = new FeedbackNegocio(fR);

		Boolean comentar = fN.registrarFeedback(feed);

		assertTrue(comentar);

	}

}
