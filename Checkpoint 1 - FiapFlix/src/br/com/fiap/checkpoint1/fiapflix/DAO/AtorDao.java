package br.com.fiap.checkpoint1.fiapflix.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint1.fiapflix.model.Ator;

/**
 * Classe respons�vel por cadastrar, excluir e listar um Ator
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class AtorDao {

	/**
	 * A colecao que armazena os Atores da aplicacao
	 */
	private List<Ator> lista = new ArrayList<>();
	
	/**
	 * Armazena o id de um ator cadastrado na lista
	 */
	private int id;

	/**
	 * M�todo que adiciona um ator a lista
	 */
	public void cadastrar(String nome, String nacionalidade) {
		id += 1;
		lista.add(new Ator(id, nome.toUpperCase(), nacionalidade.toUpperCase()));
	}

	/**
	 * M�todo que remove um ator da lista por id
	 * @param Nome id do ator
	 * @return true || false
	 * Caso tenha achado o parametro ele retornar� com true... caso contrario false;
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
	 * M�todo que remove um ator da lista por pelo nome do ator
	 * @param Nome do ator
	 * @return true || false
	 * Caso tenha achado o parametro ele retornar� com true... caso contrario false;
	 */
	public boolean removerPorNome(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
				lista.remove(i);
				return true;
			}
		}

		return false;
	}

	/**
	 * Lista todos os atores
	 */
	public List<Ator> listar() {
		return lista;
	}

}
