package br.com.fiap.checkpoint1.fiapflix.view;

import java.util.Scanner;

import br.com.fiap.checkpoint1.fiapflix.DAO.AtorDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.EpisodioDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.FilmeDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.GeneroDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.SerieDao;
import br.com.fiap.checkpoint1.fiapflix.assets.Assets;

public class Testes {

	public static void main(String[] args) {

		Assets aux = new Assets();
		FilmeDao filmes = new FilmeDao();
		SerieDao series = new SerieDao();
		AtorDao ator = new AtorDao();
		GeneroDao genero = new GeneroDao();
		EpisodioDao episodio = new EpisodioDao();
		Scanner sc = new Scanner(System.in);
		
	
		ator.cadastrar("DANIEL", "BRASILEIRO");
		genero.cadastrar("ACÃO");
		episodio.cadastrar(1, "blabla", "Blabla");
		series.cadastrar("HARRY POTTER", "DESGRAÇADO",genero.listar() , ator.listar(), true, episodio.listar());
		
		
		ator = new AtorDao();
		ator.cadastrar("DANIEL", "BRASILEIRO");
		genero = new GeneroDao();
		genero.cadastrar("ACÃO, teeror");
		episodio.cadastrar(1, "blabla", "Blabla");
		filmes.cadastrar("HARRY POTTER", "DESGRAÇADO",genero.listar() , ator.listar(), true);
		
		
		ator = new AtorDao();
		ator.cadastrar("DANIEL", "BRASILEIRO");
		genero = new GeneroDao();
		genero.cadastrar("ACÃO, teeror");
		episodio.cadastrar(1, "blabla", "Blabla");
		filmes.cadastrar("HARRY POTTER", "DESGRAÇADO",genero.listar() , ator.listar(), true);
		
		
		ator = new AtorDao();
		ator.cadastrar("DANIEL", "BRASILEIRO");
		genero = new GeneroDao();
		genero.cadastrar("ACÃO, teeror");
		episodio.cadastrar(1, "blabla", "Blabla");
		filmes.cadastrar("HARRY POTTER", "DESGRAÇADO",genero.listar() , ator.listar(), true);
		
		
		
		
		filmes.listarTodos();
		
		for (int i = 0; i < filmes.listarTodos().size(); i++) {
			
			System.out.println(filmes.listarTodos().get(i));
			
		}
		for (int i = 0; i < series.listarTodos().size(); i++) {
			
			System.out.println(series.listarTodos().get(i));
			
		}
		
		System.out.println("-----------------------------------");
//		
		
		filmes.removerPorId(1);
		filmes.removerPorNome("harry potter");
		
		
	for (int i = 0; i < filmes.listarTodos().size(); i++) {
			
			System.out.println(filmes.listarTodos().get(i));
			
		}
		
		System.out.println();
//		for (int i = 0; i < filmes.listarPorDestaques().size(); i++) {
//					
//					System.out.println(filmes.listarPorDestaques().get(i));
//					
//				}
		
	}

}
