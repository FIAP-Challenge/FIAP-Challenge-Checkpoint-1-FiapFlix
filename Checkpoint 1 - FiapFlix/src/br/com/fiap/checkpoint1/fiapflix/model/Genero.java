package br.com.fiap.checkpoint1.fiapflix.model;

/***
 *Representa um gênero do filme ou serie
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class Genero {
	
	/**
	 * Armazena o id do genero
	 */
	private int id;
	
	/**
	 * Armazena o nome do genero
	 */
	private String nome;
	
	
	/**
	 * Construtor que recebe o id e nome do genero
	 * @param id do genero
	 * @param nome do genero
	 */
	public Genero(int id, String nome) {
		super();
		this.nome = nome;
	}

	/**
	 * Retorna o id de um genero 
	 * @return o id do genero
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Altera o id de um genero
	 * @param id de um genero
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Retorna o nome de um genero 
	 * @return o nome do genero
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome de um genero
	 * @param nome de um genero
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o nome do genero
	 * @return nome do genero
	 */
	@Override
	public String toString() {
		return "Genero: " + nome;
	}
	
}
