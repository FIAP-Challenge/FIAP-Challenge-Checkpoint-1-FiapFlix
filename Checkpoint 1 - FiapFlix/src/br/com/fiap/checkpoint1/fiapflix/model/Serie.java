package br.com.fiap.checkpoint1.fiapflix.model;

import java.util.List;

/***
 * Representa uma s�rie da fiapflix, e extends filme pois uma s�rie � um filme
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class Serie extends Filme {
	
	/**
	 *Armazena uma lista de episodio de uma s�rie 
	 */
	private List<Episodio> episodio;

	/**
	 * Construtor que recebe o id, nome, descri��o, genero, ator, destaque e lista de epis�dios
	 * @param id da s�rie
	 * @param nome da s�rie
	 * @param descricao da s�rie
	 * @param genero da s�rie
	 * @param ator da s�rie
	 * @param destaque da s�rie
	 * @param lista de episodios da s�rie 
	 */
	public Serie(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque,
			List<Episodio> episodio) {
		super(id, nome, descricao, genero, ator, destaque);
		this.episodio = episodio;
	}

	/**
	 * Retorna a lista de epis�dios de uma s�rie 
	 * @return os epis�dios de uma s�rie
	 */
	public List<Episodio> getEpisodio() {
		return episodio;
	}
	
	/**
	 * Altera a lista de e�s�dios de uma s�rie
	 * @param episodios de uma s�rie
	 */
	public void setEpisodio(List<Episodio> episodio) {
		this.episodio = episodio;
	}

	/**
	 * Retorna se a s�rie estiver em destaque, id, nome,  descri��o. genero e ator do filme
	 *@return destaque, id, nome,  descri��o. genero e ator do filme 
	 *Caso n�o esgteja em destaque, retorna   nome,  descri��o. genero e ator do filme
	 *@return  nome,  descri��o. genero e ator do filme
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
