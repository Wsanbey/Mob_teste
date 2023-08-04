package entidades;

public class Feedback {
	private long id;
	private String categoria;
	private int idPessoa;
	private String nomePessoa;
	private String texto;

	public Feedback() {

	} 

	public Feedback(long id, String categoria, 
			int idPessoa, String nomePessoa, 
			String texto) {
		
		this.id = id;
		this.categoria = categoria;
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.texto = texto;
	}

	public long getId() {
		return id;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public String getTexto() {
		return texto;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	 
	 

}
