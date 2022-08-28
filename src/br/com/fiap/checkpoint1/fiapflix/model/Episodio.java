package br.com.fiap.checkpoint1.fiapflix.model;

public class Episodio {
	
	private int id;
	private int numero;
	private String nome;
	private String descricao;
	
	
	public Episodio(int id, int numero, String nome, String descricao) {
		super();
		this.id = id;
		this.numero = numero;
		this.nome = nome;
		this.descricao = descricao;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Episodio:" + numero + ", Nome: " + nome + ", Descrição: " + descricao;
	}
		
	

}
