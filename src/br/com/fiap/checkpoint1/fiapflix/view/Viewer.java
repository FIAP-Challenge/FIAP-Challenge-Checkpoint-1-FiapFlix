package br.com.fiap.checkpoint1.fiapflix.view;

import java.util.Scanner;

import br.com.fiap.checkpoint1.fiapflix.DAO.AtorDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.EpisodioDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.FilmeDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.GeneroDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.SerieDao;
import br.com.fiap.checkpoint1.fiapflix.assets.Assets;

public class Viewer {

	public static void main(String[] args) throws InterruptedException {

		Assets aux = new Assets();
		FilmeDao filmes = new FilmeDao();
		SerieDao series = new SerieDao();
		AtorDao ator = new AtorDao();
		GeneroDao genero = new GeneroDao();
		EpisodioDao episodio = new EpisodioDao();
		Scanner sc = new Scanner(System.in);

		int scopeGlobal = 0;
		int scope;

		aux.inicio();

		do { // scope global
			aux.clear();
			System.out.print("##------------------  Menu principal -------------------------##\n");
			System.out.print("|--------------------------------------------------------------|\n");
			System.out.print("| Opção 1 - Cadastrar filmes e series                          |\n");
			System.out.print("| Opção 2 - Listar filmes e series                             |\n");
			System.out.print("| Opção 3 - Editar filmes e series                             |\n");
			System.out.print("| Opção 4 - Remover filmes e series                            |\n");
			System.out.print("| Opção 5 - Sair                                               |\n");
			System.out.print("|--------------------------------------------------------------|\n");
			System.out.print("Digite uma opção: ");
			scope = sc.nextInt();

			switch (scope) {

			case 1: //                                  primeiro scope principal - inicio
				aux.clear();
				System.out.print("##------------ Menu de cadastro de filmes e series -----------##\n");
				System.out.print("|--------------------------------------------------------------|\n");
				System.out.print("| Opção 1 - Cadastrar filmes e series                          |\n");
				System.out.print("| Opção 2 - Listar filmes e series                             |\n");
				System.out.print("| Opção 3 - Editar filmes e series                             |\n");
				System.out.print("| Opção 4 - Remover filmes e series                            |\n");
				System.out.print("| Opção 5 - Sair                                               |\n");
				System.out.print("|--------------------------------------------------------------|\n");
				System.out.print("| Digite uma opção: ");
				scope = sc.nextInt();
				
				

				break;
				 //                                      primeiro scope principal - fim
				
			case 2: //                                   segundo scope principal - inicio

				break;
				 //                                  	 segundo scope principal - fim
				
			case 3:  //                                  terceiro scope principal - inicio

				break;
				//                                       terceiro scope principal - fim
				
			case 4: //                                   Quarto scope principal - inicio
				
				break;
					//                                   Quarto scope principal - fim
				
				
			case 5:	 //                                  Quinto scope principal - inicio
				aux.fim(); // encerra sistema
				scopeGlobal =5;
				break;
					//                                    Quinto scope principal - fim
			default:
				System.out.println("Opção invalida \n");
				break;

			}

		} while (scopeGlobal != 5);

	}

}
