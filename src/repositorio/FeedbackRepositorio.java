package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Feedback;

public class FeedbackRepositorio {
	List<Feedback> feedLista = new ArrayList<>();

	public boolean addFeedback(Feedback f) {
		return this.feedLista.add(f);
	}
}