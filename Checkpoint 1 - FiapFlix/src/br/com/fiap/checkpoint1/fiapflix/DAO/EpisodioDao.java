package br.com.fiap.checkpoint1.fiapflix.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint1.fiapflix.model.Ator;
import br.com.fiap.checkpoint1.fiapflix.model.Episodio;

/***
 * Classe responsável por cadastrar, excluir e listar um Episodio
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class EpisodioDao {

	/**
	 *  A colecao que armazena os Atores da aplicacao
	 */
	private List<Episodio> lista = new ArrayList<>();
	
	/**
	 * Armazena o id do episodio cadastrado na lista
	 */
	private int id;

	/**
	 * Método que adiciona um episodio a lista
	 */
	public void cadastrar(int numero, String nome, String descricao) {
		id += 1;
		lista.add(new Episodio(id, numero, nome, descricao));
	}
	
	/**
	 * Método que remove um Episodio da lista por id
	 * @param Nome id do ator
	 * @return true || false
	 * Caso tenha achado o parametro ele retornará com true... caso contrario false;
	 */
	public boolean removerPorId(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.remove(i);
				System.out.println("Removido com sucesso");
				return true;
			}
		}
		System.out.println("ID não encontrado, tente novamente");
		return false;
	}

	/**
	 * Método que remove um Episodio da lista por pelo nome do Episodio
	 * @param Nome do ator
	 * @return true || false
	 * Caso tenha achado o parametro ele retornará com true... caso contrario false;
	 */
	public boolean removerPorNome(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equals(nome)) {
				lista.remove(i);
				System.out.println("Removido com sucesso");
				return true;
			}
		}
		System.out.println("Nome não encontrato, tente novamente");
		return false;
	}

	/**
	 * Lista todos os Episodios
	 */
	public List<Episodio> listar() {
		return lista;
	}

}
