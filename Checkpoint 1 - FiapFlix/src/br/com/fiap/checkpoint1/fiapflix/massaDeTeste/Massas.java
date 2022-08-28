package br.com.fiap.checkpoint1.fiapflix.massaDeTeste;

import java.util.List;

import br.com.fiap.checkpoint1.fiapflix.DAO.AtorDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.EpisodioDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.FilmeDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.GeneroDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.SerieDao;
import br.com.fiap.checkpoint1.fiapflix.model.Filme;
import br.com.fiap.checkpoint1.fiapflix.model.Serie;

public class Massas {

	
	FilmeDao filmes = new FilmeDao();
	SerieDao series = new SerieDao();
	AtorDao ator = new AtorDao();
	GeneroDao genero = new GeneroDao();
	EpisodioDao episodio = new EpisodioDao();
	
	
	
	
	public List<Filme> MassaFilmes() {
	
		
	//Massa 1
	genero = new GeneroDao();
	ator = new AtorDao();
	genero.cadastrar("Aventura");
	genero.cadastrar("Fantasia");
	genero.cadastrar("Infantil");
	genero.cadastrar("Fiçção");
	ator.cadastrar("Daniel Radcliffe", "Inglaterra");
	filmes.cadastrar("Harry Potter", "Harry Potter é uma série de sete romances de fantasia escrita pela autora britânica J. K. Rowling", genero.listar(), ator.listar(), true);
	
	
	//Massa 2
	genero = new GeneroDao();
	ator = new AtorDao();
	genero.cadastrar("Aventura");
	genero.cadastrar("Fiçção");
	ator.cadastrar("Tom Holland,", "EUA");
	filmes.cadastrar("Homem-Aranha", "O Homem-Aranha precisa lidar com as consequências da sua verdadeira identidade ter sido descoberta.", genero.listar(), ator.listar(), true);
	
	
	//Massa 3
	genero = new GeneroDao();
	ator = new AtorDao();
	genero.cadastrar("Aventura");
	genero.cadastrar("Fiçção");
	genero.cadastrar("Fantasia");
	ator.cadastrar("Chris Hemnsworth", "EUA");
	ator.cadastrar("Natalie Portman", "EUA");
	filmes.cadastrar("Thor: Amor e Trovão", "“Thor: Amor e Trovão”, da Marvel Studios, encontra o Deus do Trovão numa jornada diferente de tudo o que já enfrentou.", genero.listar(), ator.listar(), true);
	
	
	//Massa 4
	genero = new GeneroDao();
	ator = new AtorDao();
	genero.cadastrar("Comédia");
	genero.cadastrar("Ficção cientifica");
	genero.cadastrar("Aventura");
	ator.cadastrar("Michel J. Fox", "EUA");
	ator.cadastrar("Christopher Llyod", "EUA");
	filmes.cadastrar("De Volta Para o Futuro", "“TMarty McFly, um adolescente de uma pequena cidade californiana, é transportado para a década de 1950 quando a experiência do excêntrico cientista Doc Brown dá errado.", genero.listar(), ator.listar(), true);
	

		
		return filmes.listarTodos();
	}

	
	public List<Serie> MassaSerie() {
		
		
		//Massa 1
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Mistério");
		ator.cadastrar("Hayley Atwell", "EUA");
		episodio.cadastrar(1, "Agora Não é o Fim", "Em 1946, Peggy Carter, de luto pela, aparente, morte de Steve Rogers, volta a trabalhar para a Reserva Científica Estratégica (RCE) na cidade de Nova York, após o fim da Segunda Guerra Mundia");
		episodio.cadastrar(2, "Ponte e Túnel","Peggy se disfarça novamente para procurar o caminhão com as armas e encontra o endereço do motorista do caminhão. Os agentes da RCE interrogam Miles Van Ert");
		series.cadastrar("Agent Carter", "Após retornar para América com o fim da Guerra, em 1946, Peggy Carter encontra-se trabalhando secretamente na Reserva Científica Estratégica (SSR em inglês, RCE em português)", genero.listar(), ator.listar(), true, episodio.listar());
		
		
		//Massa 2
		genero = new GeneroDao();
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Fiçção");
		ator.cadastrar("Evan Rachel Wood", "Inglaterra");
		episodio.cadastrar(1, "Piloto", "O Mundo está a frente em questão de ter um hotel de luxo que dispoe de um atrativo diferenciado aos hospedes");
		episodio.cadastrar(2, "Perdido","Ben se ver no Deserto do Faro'Oeste sem saber oq fazer.");
		series.cadastrar("WestWorld", "Westworld é um parque temático futurístico para adultos, dedicado à diversão dos ricos. Um espaço que reproduz o Velho Oeste", genero.listar(), ator.listar(), true, episodio.listar());
		
		
		//Massa 3
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Fiçção");
		ator.cadastrar("Tom Surridge", "EUA");
		episodio.cadastrar(1, "Agora Não é o Fim", "Morpheus é aprisionado e luta diariamente para ser liberdado");
		episodio.cadastrar(2, "Vingança","Morpheus após ficar 7 decádas aprisionado tenta recuperar seu imperio do sonhos e retornar o seu poder");
		series.cadastrar("The Sandman", "Após anos aprisionado, Morpheus, o Rei dos Sonhos, embarca em uma jornada entre mundos para recuperar o que lhe foi roubado e restaurar seu poder.", genero.listar(), ator.listar(), true, episodio.listar());
		
		
		//Massa 4
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Infantil");
		genero.cadastrar("Fiçção");
		ator.cadastrar("Peter DInklage", "Inglaterra");
		ator.cadastrar("Emillia Clarke", "Inglaterra");
		ator.cadastrar("Kit Harington", "EUA");
		episodio.cadastrar(1, "O Inverno Está Chegando", "Os Sete Reinos de Westeros, um soldado da antiga Ordem da Patrulha da Noite sobrevive a um ataque de criaturas sobrenaturais conhecidas como os Caminhantes Brancos");
		episodio.cadastrar(2, "A Estrada do Rei", "Tendo aceitado seu novo papel como a Mão do Rei, Ned deixa Winterfell com suas filhas Sansa e Arya, enquanto Catelyn fica para trás para cuidar de Bran.");
		series.cadastrar("Game of Thrones", "Sucesso entre os livros mais vendidos, a série de obras A Song of Ice and Fire", genero.listar(), ator.listar(), true, episodio.listar());
		
			
			return series.listarTodos();
		}
		

}
