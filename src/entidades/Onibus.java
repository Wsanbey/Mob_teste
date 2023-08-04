package entidades;

public class Onibus {
	private String nome;
	private int numero;
	private String Empresa;
	
	public Onibus() {
		 
	}
	 
	public Onibus(String nome, int numero, String empresa) {
		this.nome = nome;
		this.numero = numero;
		Empresa = empresa;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumero() {
		return numero;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	
}
