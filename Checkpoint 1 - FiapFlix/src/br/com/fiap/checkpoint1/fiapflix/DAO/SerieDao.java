package br.com.fiap.checkpoint1.fiapflix.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint1.fiapflix.model.Ator;
import br.com.fiap.checkpoint1.fiapflix.model.Episodio;
import br.com.fiap.checkpoint1.fiapflix.model.Genero;
import br.com.fiap.checkpoint1.fiapflix.model.Serie;


/***
 * Classe responsável por cadastrar, excluir e listar um serie
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class SerieDao {

	/**
	 *  A colecao que armazena os seriees da aplicacao
	 */
	private List<Serie> lista = new ArrayList<>();
	
	/**
	 * Armazena o id de uma série cadastrada na lista
	 */
	private int id;

	/**
	 * Método que adiciona um serie a lista
	 */
	public void cadastrar(String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque,
			List<Episodio> episodio) {
		id += 1;
		lista.add(new Serie(id, nome, descricao, genero, ator, destaque, episodio));
	}

	/**
	 * Método que remove um serie da lista por id
	 * @param Nome id do serie
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
	 * Método que remove um serie da lista por pelo nome do serie
	 * @param Nome do serie
	 * @return true || false
	 * Caso tenha achado o parametro ele retornará com true... caso contrario false;
	 */
	public boolean removerPorNome(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
				lista.remove(i);
				System.out.println("Removido com sucesso");
				return true;
			}
		}
		System.out.println("serie não encontrato, tente novamente");
		return false;
	}
	
	
	/**
	 * Método que lista um serie da lista por id
	 * @param Nome id do serie
	 * @return retorna o serie do id passado || null
	 */
	public Serie listarPorId(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return lista.get(i) ;
			}
		}
		System.out.println("ID não encontrado, tente novamente");
		return null;
		
	}
	
	
	/**
	 * Método que lista um serie da lista usando parametro nome do serie
	 * @param Nome do serie
	 * @return Caso ele ache ele retornára o serie  || null
	 */
	public Serie listarPorSerie(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
				return lista.get(i);
			}
		}
		System.out.println("serie não encontrado, tente novamente");
		return null;
	}
	
	/**
	 * Retorna a lista de séries cadastradas
	 * @return a lista de séries
	 */
	public List<Serie> listarTodos() {		
		return lista;
	}
		
	/**
	 * Método que lista todos os series em destaques
	 * 
	 * @return Caso ele ache ele retornára a lista de series || null
	 */
	public List<Serie> listarPorDestaques(){
		List<Serie> destaques = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).isDestaque() == true) {
				destaques.add(lista.get(i));
			}
			if(destaques.size() > 0) {
				return destaques;
			}
		}
		System.out.println("Não foi encontrado nenhum resultado, tente novamente");
		return null;
	}
	
	
	/**
		 * Método que edita o serie pelo id;
	 * @param id, nome do serie, descricao, lista de genero, atores, destaque
	 * @return Caso ele ache ele retornára a lista de series || null
	 * 
	 * Examplo
	 * serie.editarseriePeloNome(new serie(10, "Harry potter", "Harry potter teve os pais mortos desde que criança", "Ficcao", "Daniel", true));
	 */
	public Serie editarseriePeloId(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque,
			List<Episodio> episodio){
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.set(i, new Serie(id, nome, descricao, genero, ator, destaque, episodio));
				System.out.println("serie atualizado com sucesso");
				return lista.get(i);
			}
		}
		System.out.println("Não foi encontrado nenhum resultado, tente novamente");
		return null;
	}
	
	/**
	 * Método que edita o serie pelo nome;
	 * @param id, nome do serie, descricao, lista de genero, atores, destaque
	 * @return Caso ele ache ele retornára a lista de series || null
	 * 
	 * Examplo
	 * serie.editarseriePeloNome(new serie(10, "Harry potter", "Harry potter teve os pais mortos desde que criança", "Ficcao", "Daniel", true));
	 */
	public Serie editarseriePeloNome(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque,
			List<Episodio> episodio){
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equals(nome)) {
				lista.set(i, new Serie(id, nome, descricao, genero, ator, destaque, episodio));
				System.out.println("serie atualizado com sucesso");
				return lista.get(i);
			}
			
		}
		System.out.println("Não foi encontrado nenhum resultado, tente novamente");
		return null;
	}
	
	/**
	 * Retorna o tamanho de series.
	 */
	public int verificaTamanhoLista() {
		return lista.size();
	}
}
