package br.com.fiap.checkpoint1.fiapflix.model;

import java.util.List;

public class Serie extends Filme {
	
	private List<Episodio> episodio;

	public Serie(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque,
			List<Episodio> episodio) {
		super(id, nome, descricao, genero, ator, destaque);
		this.episodio = episodio;
	}


	public List<Episodio> getEpisodio() {
		return episodio;
	}

	public void setEpisodio(List<Episodio> episodio) {
		this.episodio = episodio;
	}

	@Override
	public String toString() {
		if(destaque) {
			return "Serie em destaque:  ID: " + id + ", Nome: " + nome + ", Descricao: " + descricao + ", Genero: " + genero
					+ ", Ator: " + ator;
		}
		return "Serie:  ID: " + id + ", Nome: " + nome + ", Descricao: " + descricao + ", Genero: " + genero
				+ ", Ator: " + ator;
	}




	
	
	
	
	

}
