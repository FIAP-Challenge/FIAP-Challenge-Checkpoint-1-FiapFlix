package br.com.fiap.checkpoint1.fiapflix.model;

/***
 * Representa um Ator do filme
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class Ator {
	
	/**
	 * Armazena o id do ator
	 */
	private int id;
	
	/**
	 * Armazena o nome do ator
	 */
	private String nome;
	
	/**
	 * Armazena a nacionalidade do ator
	 */
	private String nacionalidade;
	
	/**
	 * Construtor que recebe o id, nome e nacionalidade do ator
	 * @param id de um ator 
	 * @param nome de um ator
	 * @param nacionalidade de um ator
	 */
	public Ator(int id, String nome, String nacionalidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	/**
	 * Construtor que recebe o nome e nacionalidade do ator
	 * @param nome de um ator
	 * @param nacionalidade de um ator
	 */
	public Ator(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	/**
	 * Construtor que recebe um id do ator
	 * @param id de um ator
	 */
	public Ator(int id){
		super();
		this.id = id;
	}

	/**
	 * Retorna o id de um ator 
	 * @return o id do ator
	 */
	public int getId() {
		return id;
	}

	/**
	 * Altera o id de um ator
	 * @param id de um ator
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Retorna o nome de um ator 
	 * @return o nome do ator
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome de um ator
	 * @param nome de um ator
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a nacionalidade de um ator 
	 * @return a nacionalidade do ator
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * Altera o nacionalidade de um ator
	 * @param nacionalidade de um ator
	 */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	/**
	 * Retorna o id, nome e nacionalidade de um ator 
	 * @return o id, nome e nacionalidade do ator
	 */
	@Override
	public String toString() {
		return "Ator ID: " + id + ", Nome: " + nome + ", Nacionalidade: " + nacionalidade;
	}
	
}
