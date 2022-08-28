package br.com.fiap.checkpoint1.fiapflix.model;

public class Ator {
	
	private int id;
	private String nome;
	private String nacionalidade;
	
	
	public Ator(int id, String nome, String nacionalidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	
	public Ator(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	

	public Ator(int id){
		super();
		this.id = id;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	@Override
	public String toString() {
		return "Ator ID: " + id + ", Nome: " + nome + ", Nacionalidade: " + nacionalidade;
	}
	
	
	
	
	
	

}
