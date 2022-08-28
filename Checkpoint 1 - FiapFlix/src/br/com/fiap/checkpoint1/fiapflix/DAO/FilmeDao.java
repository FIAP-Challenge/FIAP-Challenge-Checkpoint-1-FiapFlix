package br.com.fiap.checkpoint1.fiapflix.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint1.fiapflix.model.Ator;
import br.com.fiap.checkpoint1.fiapflix.model.Filme;
import br.com.fiap.checkpoint1.fiapflix.model.Genero;


/***
 * Classe responsável por cadastrar, excluir e listar um filme
 * @author Luan Reis
 */

public class FilmeDao {

	// A colecao que armazena os filmees da aplicacao
	private List<Filme> lista = new ArrayList<>();
	private int id;
	/**
	 * Método que adiciona um filme a lista
	 */
	
	public void cadastrar(String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque) {
		this.id += 1;
		lista.add(new Filme(this.id, nome.toUpperCase(), descricao.toUpperCase(), genero, ator, destaque));
		
	}

	/**
	 * Método que remove um filme da lista por id
	 * @param Nome id do filme
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
	 * Método que remove um filme da lista por pelo nome do filme
	 * @param Nome do filme
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
		System.out.println("filme não encontrato, tente novamente");
		return false;
	}
	
	
	/**
	 * Método que lista um filme da lista por id
	 * @param Nome id do filme
	 * @return retorna o filme do id passado || null
	 */
	public Filme listarPorId(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return lista.get(i) ;
			}
		}
		System.out.println("ID não encontrado, tente novamente");
		return null;
		
	}
	
	
	/**
	 * Método que lista um filme da lista usando parametro nome do filme
	 * @param Nome do filme
	 * @return Caso ele ache ele retornára o filme  || null
	 */
	public Filme listarPorfilme(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equals(nome)) {
				System.out.println("Removido com sucesso");
				return lista.get(i);
			}
		}
		System.out.println("filme não encontrato, tente novamente");
		return null;
	}
	
	
	/**
	 * Método que lista todos os filmes em destaques
	 * 
	 * @return Caso ele ache ele retornára a lista de filmes || null
	 */
	public List<Filme> listarPorDestaques(){
		List<Filme> destaques = new ArrayList<>();
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
		 * Método que edita o filme pelo id;
	 * @param id, nome do filme, descricao, lista de genero, atores, destaque
	 * @return Caso ele ache ele retornára a lista de filmes || null
	 * 
	 * Examplo
	 * filme.editarFilmePeloNome(new Filme(10, "Harry potter", "Harry potter teve os pais mortos desde que criança", "Ficcao", "Daniel", true));
	 */
	public Filme editarFilmePeloId(int id, String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque ){
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.set(i, new Filme(id, nome, descricao, genero, ator, destaque));
				System.out.println("Filme atualizado com sucesso");
				return lista.get(i);
			}
		}
		System.out.println("Não foi encontrado nenhum resultado, tente novamente");
		return null;
	}
	
	/**
	 * Método que edita o filme pelo nome;
	 * @param id, nome do filme, descricao, lista de genero, atores, destaque
	 * @return Caso ele ache ele retornára a lista de filmes || null
	 * 
	 * Examplo
	 * filme.editarFilmePeloNome(new Filme(10, "Harry potter", "Harry potter teve os pais mortos desde que criança", "Ficcao", "Daniel", true));
	 */
	public Filme editarFilmePeloNome(String nome, String descricao, List<Genero> genero, List<Ator> ator, boolean destaque ){
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
				lista.set(i, new Filme(this.id, nome, descricao, genero, ator, destaque));
				System.out.println("Filme atualizado com sucesso");
				return lista.get(i);
			}
			
		}
		System.out.println("Não foi encontrado nenhum resultado, tente novamente");
		return null;
	}
	
	

	/**
	 * Lista todos os filmes
	 */
	public List<Filme> listarTodos() {
		
		if(lista.size() == 0) {
			return null;
		}
		
		return lista;
	}
	
	
	/**
	 * Retorna o tamanho de filmes.
	 */
	public int verificaTamanhoLista() {
		return lista.size();
	}
	
	
	

}
