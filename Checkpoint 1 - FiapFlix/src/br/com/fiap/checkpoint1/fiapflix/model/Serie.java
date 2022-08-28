package br.com.fiap.checkpoint1.fiapflix.model;

import java.util.List;

/***
 * Representa uma série da fiapflix, e extends filme pois uma série é um filme
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class Serie extends Filme {
	
	/**
	 *Armazena uma lista de episodio de uma série 
	 */
	private List<Episodio> episodio;

	/**
	 * Construtor que recebe o id, nome, descrição, genero, ator, destaque e lista de episódios
	 * @param id da série
	 * @param nome da série
	 * @param descricao da série
	 * @param genero da série
	 * @param ator da série
	 * @param destaque da série
	 * @param lista de episodios da série 
	 */
	public Serie(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque,
			List<Episodio> episodio) {
		super(id, nome, descricao, genero, ator, destaque);
		this.episodio = episodio;
	}

	/**
	 * Retorna a lista de episódios de uma série 
	 * @return os episódios de uma série
	 */
	public List<Episodio> getEpisodio() {
		return episodio;
	}
	
	/**
	 * Altera a lista de eísódios de uma série
	 * @param episodios de uma série
	 */
	public void setEpisodio(List<Episodio> episodio) {
		this.episodio = episodio;
	}

	/**
	 * Retorna se a série estiver em destaque, id, nome,  descrição. genero e ator do filme
	 *@return destaque, id, nome,  descrição. genero e ator do filme 
	 *Caso não esgteja em destaque, retorna   nome,  descrição. genero e ator do filme
	 *@return  nome,  descrição. genero e ator do filme
	 */
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
