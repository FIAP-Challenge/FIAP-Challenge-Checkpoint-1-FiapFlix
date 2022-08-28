package br.com.fiap.checkpoint1.fiapflix.view;

import java.io.IOException;
import java.util.Scanner;

import br.com.fiap.checkpoint1.fiapflix.DAO.AtorDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.EpisodioDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.FilmeDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.GeneroDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.SerieDao;
import br.com.fiap.checkpoint1.fiapflix.assets.Assets;

public class ViewAdmin {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Assets aux = new Assets();
		FilmeDao filmes = new FilmeDao();
		SerieDao series = new SerieDao();
		AtorDao ator = new AtorDao();
		GeneroDao genero = new GeneroDao();
		EpisodioDao episodio = new EpisodioDao();
		Scanner sc = new Scanner(System.in);
		
		
		
		int opcoes;

		aux.inicio();
		
		Thread.sleep(1000);

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("        Sistema de cadastros de filmes e series - Painel admin              ");

		do {

			System.out.println("----------------------------------------------------------------------------\n");
			System.out.println(" x ---- Qual das opções abaixo, quer realizar?  ---- x \n");
			System.out.println("1 - Cadastrar filmes e series");
			System.out.println("2 - Remover filmes e series");
			System.out.println("3 - Listar filmes e series");
			System.out.println("4 - Editar filmes e series");
			System.out.println("5 - Sair \n");
			
			System.out.print("Digite a opção: ");
			opcoes = sc.nextInt();
			 
		
			aux.clear();
			
			// Primeiro Scope de cases
			switch (opcoes) {
			case 1: { // primeiro case principal
				do {

					System.out.println("x ---- Tela de cadastro ---- x \n");
					System.out.println("1 - Cadastrar filme");
					System.out.println("2 - Cadastrar serie");
					System.out.println("3 - Voltar para o menu \n");
					System.out.print("Digite a opção: ");
					opcoes = sc.nextInt();

					switch (opcoes) {
					case 1: {
						System.out.println("x ---- Cadastrar filme ---- x \n");
						System.out.print("Digite o nome do filme: ");
						String nome = sc.next() + sc.nextLine().toUpperCase();
						System.out.print("Digite uma descrição para o  " + nome + ": ");
						String descricao = sc.next() + sc.nextLine().toUpperCase();
						String opcaoScope;
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine().toUpperCase();

							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;

						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine().toUpperCase();
							System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
							String nascionalidadeIn = sc.next() + sc.nextLine().toUpperCase();

							ator.cadastrar(atorIn, nascionalidadeIn);

							System.out.print("Deseja adicionar mais um autor? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						System.out.print(
								"O filme: " + nome + " será destaque para que seja apresentado na tela principal?");
						boolean destaque = sc.nextBoolean();

						filmes.cadastrar(nome, descricao, genero.listar(), ator.listar(), destaque);

						break;
					}

					case 2: {
						System.out.print("x ---- Cadastrar serie ---- x \n");
						System.out.print("Digite o nome do serie: ");
						String nome = sc.next() + sc.nextLine().toUpperCase();
						System.out.print("Digite uma descrição para o  " + nome + ": ");
						String descricao = sc.next() + sc.nextLine().toUpperCase();
						String opcaoScope;
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine().toUpperCase();

							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;

						do {
							System.out.print("Digite o numero do episodio: ");
							int numEpisodio = sc.nextInt();
							System.out.print("Digite o nome do episodio: ");
							String episodioIn = sc.next() + sc.nextLine().toUpperCase();
							System.out.print("Digite a descrição do episodio: ");
							String descricaoEpisodioIn = sc.next() + sc.nextLine().toUpperCase();

							episodio.cadastrar(numEpisodio, episodioIn, descricaoEpisodioIn);

							System.out.print("Deseja adicionar mais um episodio? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						System.out.print(
								"O filme: " + nome + " será destaque para que seja apresentado na tela principal?: ");
						boolean destaque = sc.nextBoolean();

						opcaoScope = null;

						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine().toUpperCase();
							System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
							String nascionalidadeIn = sc.next() + sc.nextLine().toUpperCase();

							ator.cadastrar(atorIn, nascionalidadeIn);

							System.out.print("Deseja adicionar mais um autor? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						filmes.cadastrar(nome, descricao, genero.listar(), ator.listar(), destaque);

						break;
					}
					
					case 3:
						opcoes = 3;
						break;
					

					default:
						System.out.println("Valor invalido");
					}

				} while (opcoes != 3);
				opcoes = 0;
				break;
			}
			case 2: // segundo case principal
				System.out.print("x ---- Remover filmes e series ---- x \n");
				System.out.println("1 - Remover filme");
				System.out.println("2 - Remover serie");
				System.out.println("3 - Voltar para o menu");

				System.out.print("Digite a opção: ");
				opcoes = sc.nextInt();

				do {
					switch (opcoes) {

					case 1:
						
						System.out.println("x ---- Remover filmes ---- x \n");
						System.out.println("1 - Remover por ID");
						System.out.println("2 - Remover por Nome");
						System.out.println("3 - Voltar");

						System.out.print("Digite a opçao: ");
						int opcoesScope = sc.nextInt();
						switch (opcoesScope) {

						case 1:
							System.out.print("Digite o numero do ID: ");
							int id = sc.nextInt();
							filmes.removerPorId(id);
							break;

						case 2:
							System.out.print("Digite o nome do filme: ");
							String nomeRemove = sc.next() + sc.nextLine();
							filmes.removerPorNome(nomeRemove);
							break;
						case 3:
							opcoes = 3;
						default:
							System.out.print("Digite uma opção válida: ");
							break;
						}

						break;

					case 2:
						System.out.print("x ---- Remover series: ---- x \n");
						System.out.print("1 - Remover por ID: ");
						System.out.print("2 - Remover por Nome: ");
						System.out.print("3 - Voltar");
						System.out.print("Digite a opçao: ");

						opcoesScope = sc.nextInt();
						switch (opcoesScope) {

						case 1:
							System.out.print("Digite o numero do ID: ");
							int id = sc.nextInt();
							series.removerPorId(id);
							break;

						case 2:
							System.out.print("Digite o nome da serie: ");
							String nomeRemove = sc.next() + sc.nextLine();
							series.removerPorNome(nomeRemove);
							break;
						case 3:
							opcoes = 3;
							break;
						default:
							System.out.print("Digite uma opção válida: ");
							break;
						}
						break;

					}

				} while (opcoes > 0 && opcoes != 3 && opcoes < 4);
				opcoes = 0;
				break;
			case 3: // terceiro case principal

				do {

					System.out.println("x ---- Listagem de Filmes e Series ---- x \n");
					System.out.println("1 - Listar de todos (filmes e series)");
					System.out.println("2 - Listar apenas de filmes");
					System.out.println("3 - Listar apenas de series");
					System.out.println("4 - Voltar");

					System.out.print("Digite a opção: ");
					opcoes = sc.nextInt();

					switch (opcoes) {

					case 1:

						System.out.print("x ---- Catalogo filmes ---- x \n");
						filmes.listarTodos();
						System.out.println("Catalogo series");
						series.listarTodos();

						break;

					case 2:

						int ScopeOp;

						do {
							System.out.print(" x ---- Filmes ---- x");
							System.out.println("1 - Listar por ID");
							System.out.println("2 - Listar por Nome");
							System.out.println("3 - Listar por destaque");
							System.out.println("4 - Voltar");

							ScopeOp = sc.nextInt();

							switch (ScopeOp) {

							case 1:

								System.out.print("Digite o ID: ");
								int id = sc.nextInt();
								filmes.listarPorId(id);
								break;
							case 2:

								System.out.print("Digite o nome: ");
								String nome = sc.next() + sc.nextLine();
								filmes.listarPorfilme(nome);
								break;

							case 3:

								filmes.listarPorDestaques();
								break;

							case 4:
								opcoes = 4;
								break;

							default:
								System.out.print("Opção invalida, digite novamente");

							}

						} while (ScopeOp > 0 && ScopeOp != 4 && ScopeOp < 5);

						break;

					case 3:

						do {
							System.out.println("x ---- Series ---- x");
							System.out.println("1 - Listar por ID");
							System.out.println("2 - Listar por Nome");
							System.out.println("3 - Listar por destaque");
							System.out.println("4 - Voltar");

							ScopeOp = sc.nextInt();

							switch (ScopeOp) {

							case 1:

								System.out.print("Digite o ID: ");
								int id = sc.nextInt();
								series.listarPorId(id);
								break;
							case 2:

								System.out.print("Digite o nome: ");
								String nome = sc.next() + sc.nextLine();
								series.listarPorSerie(nome);
								break;

							case 3:

								series.listarPorDestaques();
								break;

							case 4:
								opcoes = 4;
								break;

							default:
								System.out.println("Opção invalida, digite novamente");

							}

						} while (ScopeOp > 0 && ScopeOp != 4 && ScopeOp < 5);

						break;

					case 4:

						opcoes = 4;
						break;

					}

				} while (opcoes > 0 && opcoes != 4 && opcoes < 5);
				opcoes = 0;
				break;

			case 4: // quarto escopo
				do {
					System.out.print("x ---- Edição de Filmes e Series ---- x \n");
					System.out.println("1 - Editar filmes");
					System.out.println("2 - Editar series");
					System.out.println("3 - Voltar");

					System.out.print("Digite a opção: ");
					opcoes = sc.nextInt();

					switch (opcoes) {

					case 1:

						int ScopeOp;

						do {
							System.out.print("x ---- Editar filme ---- x");
							System.out.println("1 - Editar por ID");
							System.out.println("2 - Editar por Nome");
							System.out.println("3 - Voltar");

							ScopeOp = sc.nextInt();

							switch (ScopeOp) {

							case 1:
								System.out.print("Digite o ID: ");
								int id = sc.nextInt();

								System.out.print("Digite o nome do filme: ");
								String nomeS = sc.next() + sc.nextLine().toUpperCase();
								System.out.print("Digite uma descrição para o  " + nomeS + ": ");
								String descricao = sc.next() + sc.nextLine().toUpperCase();
								String opcaoScope;
								do {
									System.out.print("Digite o nome do genero: ");
									String generoIn = sc.next() + sc.nextLine().toUpperCase();

									genero.cadastrar(generoIn);

									System.out.print("Deseja adicionar mais um genero? Y/N: ");
									opcaoScope = sc.next() + sc.nextLine();

								} while (opcaoScope.equalsIgnoreCase("Y"));

								opcaoScope = null;

								do {
									System.out.print("Digite o nome do ator: ");
									String atorIn = sc.next() + sc.nextLine().toUpperCase();
									System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
									String nascionalidadeIn = sc.next() + sc.nextLine().toUpperCase();

									ator.cadastrar(atorIn, nascionalidadeIn);

									System.out.print("Deseja adicionar mais um autor? Y/N: ");
									opcaoScope = sc.next() + sc.nextLine();

								} while (opcaoScope.equalsIgnoreCase("Y"));

								System.out.print("O filme: " + nomeS
										+ " será destaque para que seja apresentado na tela principal?: ");
								boolean destaque = sc.nextBoolean();

								filmes.cadastrar(nomeS, descricao, genero.listar(), ator.listar(), destaque);

								filmes.editarFilmePeloId(id, nomeS, descricao, genero.listar(), ator.listar(),
										destaque);
								break;
							case 2:

								System.out.print("Digite o nome: ");
								String nomeSearch = sc.next() + sc.nextLine();

								System.out.print("Digite o nome do filme: ");
								nomeS = sc.next() + sc.nextLine().toUpperCase();
								System.out.print("Digite uma descrição para o  " + nomeS + ": ");
								descricao = sc.next() + sc.nextLine().toUpperCase();
								opcaoScope = null;
								do {
									System.out.print("Digite o nome do genero: ");
									String generoIn = sc.next() + sc.nextLine().toUpperCase();

									genero.cadastrar(generoIn);

									System.out.print("Deseja adicionar mais um genero? Y/N: ");
									opcaoScope = sc.next() + sc.nextLine();

								} while (opcaoScope.equalsIgnoreCase("Y"));

								opcaoScope = null;

								do {
									System.out.print("Digite o nome do ator: ");
									String atorIn = sc.next() + sc.nextLine().toUpperCase();
									System.out.print("Digite a nacionalidade do: " + atorIn + " ");
									String nascionalidadeIn = sc.next() + sc.nextLine().toUpperCase();

									ator.cadastrar(atorIn, nascionalidadeIn);

									System.out.print("Deseja adicionar mais um autor? Y/N: ");
									opcaoScope = sc.next() + sc.nextLine();

								} while (opcaoScope.equalsIgnoreCase("Y"));

								System.out.print("O filme: " + nomeS
										+ " será destaque para que seja apresentado na tela principal?: ");
								destaque = sc.nextBoolean();

								filmes.cadastrar(nomeS, descricao, genero.listar(), ator.listar(), destaque);

								filmes.editarFilmePeloNome(nomeS, descricao, genero.listar(), ator.listar(), destaque);
								break;

							case 3:
								opcoes = 3;
								break;

							default:
								System.out.println("Opção invalida, digite novamente");

							}

						} while (ScopeOp > 0 && ScopeOp != 3 && ScopeOp < 4);

						break;

					case 2:

						do {
							System.out.print("x ---- Series ---- x");
							System.out.println("1 - Listar por ID");
							System.out.println("2 - Listar por Nome");
							System.out.println("3 - Listar por destaque");
							System.out.println("4 - Voltar");

							ScopeOp = sc.nextInt();

							switch (ScopeOp) {

							case 1:

								System.out.print("Digite o ID: ");
								int id = sc.nextInt();
								series.listarPorId(id);
								break;
							case 2:

								System.out.print("Digite o nome: ");
								String nome = sc.next() + sc.nextLine();
								series.listarPorSerie(nome);
								break;

							case 3:

								series.listarPorDestaques();
								break;

							case 4:
								opcoes = 4;
								break;

							default:
								System.out.println("Opção invalida, digite novamente");

							}

						} while (ScopeOp > 0 && ScopeOp != 4 && ScopeOp < 5);

						break;

					case 3:

						opcoes = 4;
						break;

					}

				} while (opcoes > 0 && opcoes != 4 && opcoes < 5);
				opcoes = 0;
				break;

			case 5:
				opcoes = 5;
				break;

			default:
				System.out.println("Opções invalida");
			}
		} while (opcoes != 5);
		aux.fim();

	}

}
