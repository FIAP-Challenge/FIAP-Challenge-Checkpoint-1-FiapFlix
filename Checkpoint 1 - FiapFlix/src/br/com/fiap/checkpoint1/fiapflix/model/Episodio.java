package br.com.fiap.checkpoint1.fiapflix.model;

/***
 * Representa um epis�dio da s�rie
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class Episodio {
	
	/**
	 * Armazena o id do episodio
	 */
	private int id;
	
	/**
	 * Armazena o numero do episodio
	 */
	private int numero;
	
	/**
	 * Armazena o nome do episodio
	 */
	private String nome;
	
	/**
	 * Armazena a descri��o do episodio
	 */
	private String descricao;
	
	
	
	/**
	 * Construtor que recebe o id, numero, nome, nome e descri��o
	 * @param o id do episodio
	 * @param numero do episodio
	 * @param nome do episodio
	 * @param descricao do episodio
	 */
	public Episodio(int id, int numero, String nome, String descricao) {
		super();
		this.id = id;
		this.numero = numero;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	/**
	 * Retorna o id do epis�dio
	 * @return id do episodio
	 */
	public int getId() {
		return id;
	}

	/**
	 * Altera o id do episodio
	 * @param id do episodio
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Retorna o numero do episodio
	 * @return o numero do episodio
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Altera o numero do episodio
	 * @param numero do episodio
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Retorna o nome do episodio
	 * @return o nome do episodio
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do episodio
	 * @param nome do episodio
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a descri��o do episodio
	 * @return a descri��o do episodio
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Altera a descri��o do episodio
	 * @param descricao do episodio 
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * M�todo que printa os valores armazenados
	 * @return o numero do episodio, nome e descri��o 
	 */
	@Override
	public String toString() {
		return "Episodio:" + numero + ", Nome: " + nome + ", Descri��o: " + descricao;
	}
		
}
