package br.com.fiap.checkpoint1.fiapflix.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint1.fiapflix.model.Genero;

/***
 * Classe responsável por cadastrar, excluir e listar um Genero
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class GeneroDao {

	/**
	 *  A colecao que armazena os generoes da aplicacao
	 */
	private List<Genero> lista = new ArrayList<>();
	
	/**
	 * Armazena o id do genero cadastrado na lista
	 */
	private int id;

	/**
	 * Método que adiciona um genero a lista
	 */
	public void cadastrar(String nome) {
		id += 1;
		lista.add(new Genero(id, nome.toUpperCase()));
	}

	/**
	 * Método que remove um genero da lista por pelo id do genero
	 * @param Nome do genero
	 * @return true || false
	 * Caso tenha achado o parametro ele retornará com true... caso contrario false;
	 */
	public boolean removerPorId(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.remove(i);
			
				return true;
			}
		}

		return false;
	}
	
	
	/**
	 * Método que remove um genero da lista por pelo nome do genero
	 * @param Nome do genero
	 * @return true || false
	 * Caso tenha achado o parametro ele retornará com true... caso contrario false;
	 */
	public boolean removerPorGenero(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
				lista.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * Lista todos os generos
	 */
	public List<Genero> listar() {
		return lista;
	}

}
