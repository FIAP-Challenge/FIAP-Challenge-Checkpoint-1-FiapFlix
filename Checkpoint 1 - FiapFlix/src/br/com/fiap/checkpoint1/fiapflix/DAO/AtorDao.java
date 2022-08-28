package br.com.fiap.checkpoint1.fiapflix.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint1.fiapflix.model.Ator;

/***
 * Classe responsável por cadastrar, excluir e listar um Ator
 * @author Luan Reis
 */

public class AtorDao {

	// A colecao que armazena os Atores da aplicacao
	private List<Ator> lista = new ArrayList<>();
	private int id;

	/**
	 * Método que adiciona um ator a lista
	 */
	
	public void cadastrar(String nome, String nacionalidade) {
		id += 1;
		lista.add(new Ator(id, nome, nacionalidade));
	}

	/**
	 * Método que remove um ator da lista por id
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
	 * Método que remove um ator da lista por pelo nome do ator
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
	 * Lista todos os atores
	 */
	public List<Ator> listar() {
		return lista;
	}

}
