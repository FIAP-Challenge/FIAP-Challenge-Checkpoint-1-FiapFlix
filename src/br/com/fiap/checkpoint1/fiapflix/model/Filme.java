package br.com.fiap.checkpoint1.fiapflix.model;

import java.util.List;

public class Filme {

	protected int id;
	protected String nome;
	protected String descricao;
	protected boolean destaque;
	protected List<Genero> genero;
	protected List<Ator> ator;

	public Filme(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.genero = genero;
		this.ator = ator;
		this.destaque = destaque;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isDestaque() {
		return destaque;
	}

	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}
	
	public List<Genero> getGenero() {
		return genero;
	}

	public void setGenero(List<Genero> genero) {
		this.genero = genero;
	}

	public List<Ator> getAtor() {
		return ator;
	}

	public void setAtor(List<Ator> ator) {
		this.ator = ator;
	}

	@Override
	public String toString() {
		if(this.destaque) {
			return "Filme em destaque:  ID: " + id + ", Nome: " + nome + ", Descricao: " + descricao + ", Genero: " + genero
					+ ", Ator: " + ator;
		}
		return "Filme:  ID: " + id + ", Nome: " + nome + ", Descricao: " + descricao + ", Genero: " + genero
				+ ", Ator: " + ator;
	}

}
