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
	genero.cadastrar("Fi���o");
	ator.cadastrar("Daniel Radcliffe", "Inglaterra");
	filmes.cadastrar("Harry Potter", "Harry Potter � uma s�rie de sete romances de fantasia escrita pela autora brit�nica J. K. Rowling", genero.listar(), ator.listar(), true);
	
	
	//Massa 2
	genero = new GeneroDao();
	ator = new AtorDao();
	genero.cadastrar("Aventura");
	genero.cadastrar("Fi���o");
	ator.cadastrar("Tom Holland,", "EUA");
	filmes.cadastrar("Homem-Aranha", "O Homem-Aranha precisa lidar com as consequ�ncias da sua verdadeira identidade ter sido descoberta.", genero.listar(), ator.listar(), true);
	
	
	//Massa 3
	genero = new GeneroDao();
	ator = new AtorDao();
	genero.cadastrar("Aventura");
	genero.cadastrar("Fi���o");
	genero.cadastrar("Fantasia");
	ator.cadastrar("Chris Hemnsworth", "EUA");
	ator.cadastrar("Natalie Portman", "EUA");
	filmes.cadastrar("Thor: Amor e Trov�o", "�Thor: Amor e Trov�o�, da Marvel Studios, encontra o Deus do Trov�o numa jornada diferente de tudo o que j� enfrentou.", genero.listar(), ator.listar(), true);
	
	
	//Massa 4
	genero = new GeneroDao();
	ator = new AtorDao();
	genero.cadastrar("Com�dia");
	genero.cadastrar("Fic��o cientifica");
	genero.cadastrar("Aventura");
	ator.cadastrar("Michel J. Fox", "EUA");
	ator.cadastrar("Christopher Llyod", "EUA");
	filmes.cadastrar("De Volta Para o Futuro", "�TMarty McFly, um adolescente de uma pequena cidade californiana, � transportado para a d�cada de 1950 quando a experi�ncia do exc�ntrico cientista Doc Brown d� errado.", genero.listar(), ator.listar(), true);
	

		
		return filmes.listarTodos();
	}

	
	public List<Serie> MassaSerie() {
		
		
		//Massa 1
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Mist�rio");
		ator.cadastrar("Hayley Atwell", "EUA");
		episodio.cadastrar(1, "Agora N�o � o Fim", "Em 1946, Peggy Carter, de luto pela, aparente, morte de Steve Rogers, volta a trabalhar para a Reserva Cient�fica Estrat�gica (RCE) na cidade de Nova York, ap�s o fim da Segunda Guerra Mundia");
		episodio.cadastrar(2, "Ponte e T�nel","Peggy se disfar�a novamente para procurar o caminh�o com as armas e encontra o endere�o do motorista do caminh�o. Os agentes da RCE interrogam Miles Van Ert");
		series.cadastrar("Agent Carter", "Ap�s retornar para Am�rica com o fim da Guerra, em 1946, Peggy Carter encontra-se trabalhando secretamente na Reserva Cient�fica Estrat�gica (SSR em ingl�s, RCE em portugu�s)", genero.listar(), ator.listar(), true, episodio.listar());
		
		
		//Massa 2
		genero = new GeneroDao();
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Fi���o");
		ator.cadastrar("Evan Rachel Wood", "Inglaterra");
		episodio.cadastrar(1, "Piloto", "O Mundo est� a frente em quest�o de ter um hotel de luxo que dispoe de um atrativo diferenciado aos hospedes");
		episodio.cadastrar(2, "Perdido","Ben se ver no Deserto do Faro'Oeste sem saber oq fazer.");
		series.cadastrar("WestWorld", "Westworld � um parque tem�tico futur�stico para adultos, dedicado � divers�o dos ricos. Um espa�o que reproduz o Velho Oeste", genero.listar(), ator.listar(), true, episodio.listar());
		
		
		//Massa 3
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Fi���o");
		ator.cadastrar("Tom Surridge", "EUA");
		episodio.cadastrar(1, "Agora N�o � o Fim", "Morpheus � aprisionado e luta diariamente para ser liberdado");
		episodio.cadastrar(2, "Vingan�a","Morpheus ap�s ficar 7 dec�das aprisionado tenta recuperar seu imperio do sonhos e retornar o seu poder");
		series.cadastrar("The Sandman", "Ap�s anos aprisionado, Morpheus, o Rei dos Sonhos, embarca em uma jornada entre mundos para recuperar o que lhe foi roubado e restaurar seu poder.", genero.listar(), ator.listar(), true, episodio.listar());
		
		
		//Massa 4
		genero = new GeneroDao();
		ator = new AtorDao();
		genero.cadastrar("Aventura");
		genero.cadastrar("Fantasia");
		genero.cadastrar("Infantil");
		genero.cadastrar("Fi���o");
		ator.cadastrar("Peter DInklage", "Inglaterra");
		ator.cadastrar("Emillia Clarke", "Inglaterra");
		ator.cadastrar("Kit Harington", "EUA");
		episodio.cadastrar(1, "O Inverno Est� Chegando", "Os Sete Reinos de Westeros, um soldado da antiga Ordem da Patrulha da Noite sobrevive a um ataque de criaturas sobrenaturais conhecidas como os Caminhantes Brancos");
		episodio.cadastrar(2, "A Estrada do Rei", "Tendo aceitado seu novo papel como a M�o do Rei, Ned deixa Winterfell com suas filhas Sansa e Arya, enquanto Catelyn fica para tr�s para cuidar de Bran.");
		series.cadastrar("Game of Thrones", "Sucesso entre os livros mais vendidos, a s�rie de obras A Song of Ice and Fire", genero.listar(), ator.listar(), true, episodio.listar());
		
			
			return series.listarTodos();
		}
		

}
