package br.com.fiap.checkpoint1.fiapflix.model;

import java.util.List;

/***
 * Representa um filme da fiapflix 
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class Filme {
	
	/**
	 * Armazena o id do filme
	 */
	protected int id;
	
	/**
	 * Armazena o nome do filme
	 */
	protected String nome;
	
	/**
	 * Armazena a descrição do filme
	 */
	protected String descricao;
	
	/**
	 * Armazena o destaque do filme 
	 */
	protected boolean destaque;
	
	/**
	 * Armazena a lista de genero de um filme
	 */
	protected List<Genero> genero;
	
	/**
	 * Armazena a lista de atores de um filme
	 */
	protected List<Ator> ator;

	/**
	 * Construtor que recebe o id, nome, descrição, genero. ator e destaque de um filme
	 * @param id de um filme
	 * @param nome de um filme 
	 * @param descricao de um filme 
	 * @param genero de um filme 
	 * @param ator de um filme
	 * @param destaque de um filme
	 */
	public Filme(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.genero = genero;
		this.ator = ator;
		this.destaque = destaque;
	}

	/**
	 * Retorna o id de um filme1 
	 * @return o id do filme
	 */
	public int getId() {
		return id;
	}

	/**
	 * Altera o id de um filme
	 * @param id de um filme
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Retorna o nome de um filme 
	 * @return o nome do filme
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome de um filme
	 * @param nome de um filme
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a descrição de um filme 
	 * @return a descriçaõ do filme
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Altera a descrição de um filme
	 * @param descrição de um filme
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Retorna se o filme é um destaque 
	 * @return se é destaque o filme
	 */
	public boolean isDestaque() {
		return destaque;
	}

	/**
	 * Altera o destaque de um filme
	 * @param destaque de um filme
	 */
	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}
	
	/**
	 * Retorna a lista de generos de um filme 
	 * @return os generos do filme
	 */
	public List<Genero> getGenero() {
		return genero;
	}

	/**
	 * Altera a lista de generos de um filme
	 * @param generos de um filme
	 */
	public void setGenero(List<Genero> genero) {
		this.genero = genero;
	}

	/**
	 * Retorna a lista de ator de um filme 
	 * @return os atores do filme
	 */
	public List<Ator> getAtor() {
		return ator;
	}

	/**
	 * Altera a lista de atores de um filme
	 * @param atores de um filme
	 */
	public void setAtor(List<Ator> ator) {
		this.ator = ator;
	}

	/**
	 * Retorna se o filme estiver em destaque, id, nome,  descrição. genero e ator do filme
	 *@return destaque, id, nome,  descrição. genero e ator do filme 
	 *Caso não esgteja em destaque, retorna   nome,  descrição. genero e ator do filme
	 *@return  nome,  descrição. genero e ator do filme
	 */
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
