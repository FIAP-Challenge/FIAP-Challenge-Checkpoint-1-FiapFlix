package br.com.fiap.checkpoint1.fiapflix.view;

import java.util.Scanner;

import br.com.fiap.checkpoint1.fiapflix.DAO.AtorDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.EpisodioDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.FilmeDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.GeneroDao;
import br.com.fiap.checkpoint1.fiapflix.DAO.SerieDao;
import br.com.fiap.checkpoint1.fiapflix.assets.Assets;
import br.com.fiap.checkpoint1.fiapflix.massaDeTeste.Massas;

public class Viewer {

	public static void main(String[] args) throws InterruptedException {
		Massas massaTeste = new Massas();
		Assets aux = new Assets();
		FilmeDao filmes = new FilmeDao();
		SerieDao series = new SerieDao();
		AtorDao ator = new AtorDao();
		GeneroDao genero = new GeneroDao();
		EpisodioDao episodio = new EpisodioDao();
		Scanner sc = new Scanner(System.in);
		String resp;

		int scopeGlobal = 0;
		int scope;
		
		System.out.println("Modo teste permite que uma massa de teste já seja inputada na variavel de filmes e series");
		System.out.print("Deseja iniciar em modo teste: [Y/N] ");
		resp = sc.next() + sc.nextLine();
		
		if(resp.equalsIgnoreCase("Y")) {
			massaTeste.MassaFilmes().forEach(c -> filmes.cadastrar(c.getNome(), c.getDescricao(), c.getGenero(), c.getAtor(), c.isDestaque()));
			massaTeste.MassaSerie().forEach(c -> series.cadastrar(c.getNome(), c.getDescricao(), c.getGenero(), c.getAtor(), c.isDestaque(), c.getEpisodio()));
		}
		

		aux.inicio();
	

		do { // scope global
			aux.clear();
			System.out.print("##------------------  Menu principal ------------##\n");
			System.out.print("|-------------------------------------------------|\n");
			System.out.print("| --> Filmes                                      |\n");
			System.out.print("| ---> Cadastros                                  |\n");
			System.out.print("| ----> Opção 1 - Cadastrar novo filme            |\n");
			System.out.print("| ----> Opção 2 - Listar todos                    |\n");
			System.out.print("| ----> Opção 3 - Listar apenas destaques         |\n");
			System.out.print("| ----> Opção 4 - Listar por ID                   |\n");
			System.out.print("| ----> Opção 5 - Listar por Nome                 |\n");
			System.out.print("| ----> Opção 6 - Editar por ID                   |\n");
			System.out.print("| ----> Opção 7 - Editar por Nome                 |\n");
			System.out.print("| ----> Opção 8 - Remover por ID                  |\n");
			System.out.print("| ----> Opção 9 - Remover por nome                |\n");
			System.out.print("|                                                 |\n");
			System.out.print("| --> Series                                      |\n");
			System.out.print("| ---> Cadastros                                  |\n");
			System.out.print("| ----> Opção 10 - Cadastrar nova serie           |\n");
			System.out.print("| ----> Opção 11 - Listar todos                   |\n");
			System.out.print("| ----> Opção 12 - Listar apenas destaques        |\n");
			System.out.print("| ----> Opção 13 - Listar por ID                  |\n");
			System.out.print("| ----> Opção 14 - Listar por Nome                |\n");
			System.out.print("| ----> Opção 15 - Editar por ID                  |\n");
			System.out.print("| ----> Opção 16 - Editar por Nome                |\n");
			System.out.print("| ----> Opção 17 - Remover por ID                 |\n");
			System.out.print("| ----> Opção 18 - Remover por nome               |\n");
			System.out.print("|                                                 |\n");
			System.out.print("| --> Catalogo                                    |\n");
			System.out.print("| ----> Opção 19 - Listar todo catalogo           |\n");
			System.out.print("|                                                 |\n");
			System.out.print("| --> Opção 20 - Sair                             |\n");
			System.out.print("|-------------------------------------------------|\n");
			System.out.print("Digite uma opção: ");
			scope = sc.nextInt();

			switch (scope) {

			case 1:

				do {
					System.out.println("\n");
					System.out.print("Digite o nome do filme: ");
					String nome = sc.next() + sc.nextLine();
					System.out.print("Digite uma descrição para o  " + nome + ": ");
					String descricao = sc.next() + sc.nextLine();
					String opcaoScope;
					do {
						System.out.print("Digite o nome do genero: ");
						String generoIn = sc.next() + sc.nextLine();
						genero = new GeneroDao();
						genero.cadastrar(generoIn);

						System.out.print("Deseja adicionar mais um genero? Y/N: ");
						opcaoScope = sc.next() + sc.nextLine();

					} while (opcaoScope.equalsIgnoreCase("Y"));

					opcaoScope = null;

					do {
						System.out.print("Digite o nome do ator: ");
						String atorIn = sc.next() + sc.nextLine();
						System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
						String nascionalidadeIn = sc.next() + sc.nextLine();
						ator = new AtorDao();
						ator.cadastrar(atorIn, nascionalidadeIn);

						System.out.print("Deseja adicionar mais um autor? Y/N: ");
						opcaoScope = sc.next() + sc.nextLine();

					} while (opcaoScope.equalsIgnoreCase("Y"));

					System.out
							.print("O filme: " + nome + " será destaque para que seja apresentado na tela principal? [true ou false]: ");
					boolean destaque = sc.nextBoolean();

					filmes.cadastrar(nome, descricao, genero.listar(), ator.listar(), destaque);

					System.out.print("Deseja adicionar outro filme: [Y/N]");
					resp = sc.next() + sc.nextLine();
				} while (resp.equalsIgnoreCase("Y"));

				break;

			case 2:

				if (filmes.listarTodos() == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					for (int i = 0; i < filmes.listarTodos().size(); i++) {

						System.out.println(filmes.listarTodos().get(i));

					}

					do {
						System.out.print("Deseja retornar ao menu? [Y/N] ");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));

				}

				break;

			case 3:

				if (filmes.listarPorDestaques() == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					for (int i = 0; i < filmes.listarTodos().size(); i++) {

						System.out.println(filmes.listarTodos().get(i));

					}

					do {
						System.out.println("Deseja retornar ao menu? [Y/N] ");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));

				}

				break;

			case 4:

				System.out.println("Digite o numero do ID que deseja buscar");
				int id = sc.nextInt();

				if (filmes.listarPorId(id) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					System.out.println(filmes.listarPorId(id));
					do {
						System.out.println("Deseja retornar ao menu? [Y/N]");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");

				break;

			case 5:

				System.out.println("Digite o nome do filme que deseja buscar");
				String nome = sc.next() + sc.nextLine();

				if (filmes.listarPorfilme(nome) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					System.out.println(filmes.listarPorfilme(nome));
					do {
						System.out.println("Deseja retornar ao menu? [Y/N]");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");

			case 6:

				System.out.println("Qual o id do filme que deseja alterar? ");
				id = sc.nextInt();

				if (filmes.listarPorId(id) == null) {
					System.out.println("Filme não encontrado, por favor verifique o id");
					aux.carregar();
				} else {

					System.out.println(filmes.listarPorId(id));
					System.out.println("Qual informação deseja alterar: ");
					System.out.println("1 - Nome: " + filmes.listarPorId(id).getNome());
					System.out.println("2 - Descrição: " + filmes.listarPorId(id).getDescricao());
					System.out.println("3 - Genero: " + filmes.listarPorId(id).getGenero());
					System.out.println("4 - Atores: " + filmes.listarPorId(id).getAtor());
					System.out.println("5 - Destaque: " + filmes.listarPorId(id).isDestaque());
					System.out.println("6 - Todos");
					System.out.println("7 - Sair");
					System.out.print("Opção: ");
					int ed = sc.nextInt();

					switch (ed) {

					case 1:

						System.out.print("Digite o novo nome");
						nome = sc.next() + sc.nextLine();

						filmes.editarFilmePeloNome(nome, filmes.listarPorId(id).getDescricao(),
								filmes.listarPorId(id).getGenero(), filmes.listarPorId(id).getAtor(),
								filmes.listarPorId(id).isDestaque(), true);

						break;

					case 2:
						
						System.out.print("Digite o nova descrição: ");
						String descricao = sc.next() + sc.nextLine();

						filmes.editarFilmePeloId(id, filmes.listarPorId(id).getNome(), descricao,
								filmes.listarPorId(id).getGenero(), filmes.listarPorId(id).getAtor(),
								filmes.listarPorId(id).isDestaque());

						break;

					case 3:
						
						String opcaoScope;
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						filmes.editarFilmePeloId(id, filmes.listarPorId(id).getNome(), filmes.listarPorId(id).getDescricao(),
								genero.listar(), filmes.listarPorId(id).getAtor(),
								filmes.listarPorId(id).isDestaque());

						break;
						
					case 4:
					
						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							
							System.out.print("Digite a nacionalidade do ator: ");
							String nascionalidade = sc.next() + sc.nextLine();

							ator = new AtorDao();
							ator.cadastrar(atorIn, nascionalidade);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						filmes.editarFilmePeloId(id, filmes.listarPorId(id).getNome(), filmes.listarPorId(id).getDescricao(),
								filmes.listarPorId(id).getGenero(), ator.listar(),
								filmes.listarPorId(id).isDestaque());

						break;
						
					case 5:
						
						System.out.print("Digite o novo destaque: true ou false");
						Boolean destaque = sc.nextBoolean();

						filmes.editarFilmePeloId(id, filmes.listarPorId(id).getNome(), filmes.listarPorId(id).getDescricao(),
								filmes.listarPorId(id).getGenero(), filmes.listarPorId(id).getAtor(),
								destaque);

						break;
						
					case 6:
						
						System.out.println("\n");
						System.out.print("Digite o nome do filme: ");
						 nome = sc.next() + sc.nextLine();
						System.out.print("Digite uma descrição para o  " + nome + ": ");
						descricao = sc.next() + sc.nextLine();
					
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;

						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
							String nascionalidadeIn = sc.next() + sc.nextLine();

							ator.cadastrar(atorIn, nascionalidadeIn);

							System.out.print("Deseja adicionar mais um autor? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						System.out
								.print("O filme: " + nome + " será destaque para que seja apresentado na tela principal? [true ou false]: ");
						destaque = sc.nextBoolean();

						filmes.editarFilmePeloNome(nome, descricao, genero.listar(), ator.listar(), destaque, true);				

					break;
					
					case 7:
						
	
						
						break;
						
					default:
						System.out.println("Opção invalida");
						break;

					}

				}

				break;

			case 7:
				
				
				System.out.println("Qual o nome do filme que deseja alterar? ");
				nome = sc.next() + sc.nextLine();

				if (filmes.listarPorfilme(nome) == null) {
					System.out.println("Filme não encontrado, por favor verifique o nome");
					aux.carregar();
				} else {

					System.out.println(filmes.listarPorfilme(nome));
					System.out.println("Qual informação deseja alterar: ");
					System.out.println("1 - Nome: " + filmes.listarPorfilme(nome).getNome());
					System.out.println("2 - Descrição: " + filmes.listarPorfilme(nome).getDescricao());
					System.out.println("3 - Genero: " + filmes.listarPorfilme(nome).getGenero());
					System.out.println("4 - Atores: " + filmes.listarPorfilme(nome).getAtor());
					System.out.println("5 - Destaque: " + filmes.listarPorfilme(nome).isDestaque());
					System.out.println("6 - Todos");
					System.out.println("7 - Sair");
					System.out.print("Opção: ");
					int ed = sc.nextInt();

					switch (ed) {

					case 1:

						System.out.print("Digite o novo nome: ");
						String nomeAntigo = filmes.listarPorfilme(nome).getNome();
						nome = sc.next() + sc.nextLine();

						System.out.println(nome);
						filmes.editarFilmePeloNome(nome, filmes.listarPorfilme(nomeAntigo).getDescricao(),
								filmes.listarPorfilme(nomeAntigo).getGenero(), filmes.listarPorfilme(nomeAntigo).getAtor(),
								filmes.listarPorfilme(nomeAntigo).isDestaque(), true);

						break;

					case 2:
						
						System.out.print("Digite o nova descrição: ");
						String descricao = sc.next() + sc.nextLine();

						filmes.editarFilmePeloNome(filmes.listarPorfilme(nome).getNome(), descricao,
								filmes.listarPorfilme(nome).getGenero(), filmes.listarPorfilme(nome).getAtor(),
								filmes.listarPorfilme(nome).isDestaque(), false);

						break;

					case 3:
						
						System.out.print("Digite o nova descrição: ");
						String opcaoScope;
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						filmes.editarFilmePeloNome(filmes.listarPorfilme(nome).getNome(), filmes.listarPorfilme(nome).getDescricao(),
								genero.listar(), filmes.listarPorfilme(nome).getAtor(),
								filmes.listarPorfilme(nome).isDestaque(),false);

						break;
						
					case 4:
						System.out.print("Digite o nova descrição: ");
						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							
							System.out.print("Digite a nacionalidade do ator: ");
							String nascionalidade = sc.next() + sc.nextLine();

							ator = new AtorDao();
							ator.cadastrar(atorIn, nascionalidade);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						filmes.editarFilmePeloNome(filmes.listarPorfilme(nome).getNome(), filmes.listarPorfilme(nome).getDescricao(),
								filmes.listarPorfilme(nome).getGenero(), ator.listar(),
								filmes.listarPorfilme(nome).isDestaque(),false);

						break;
						
					case 5:
						
						System.out.print("Digite o novo destaque: true ou false");
						Boolean destaque = sc.nextBoolean();

						filmes.editarFilmePeloNome(filmes.listarPorfilme(nome).getNome(), filmes.listarPorfilme(nome).getDescricao(),
								filmes.listarPorfilme(nome).getGenero(), filmes.listarPorfilme(nome).getAtor(),
								destaque,false);

						break;
						
					case 6:
						
						System.out.println("\n");
						System.out.print("Digite o nome do filme: ");
						 nome = sc.next() + sc.nextLine();
						System.out.print("Digite uma descrição para o  " + nome + ": ");
						descricao = sc.next() + sc.nextLine();
					
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;

						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
							String nascionalidadeIn = sc.next() + sc.nextLine();

							ator.cadastrar(atorIn, nascionalidadeIn);

							System.out.print("Deseja adicionar mais um autor? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						System.out
								.print("O filme: " + nome + " será destaque para que seja apresentado na tela principal? [true ou false]: ");
						destaque = sc.nextBoolean();

						filmes.cadastrar(nome, descricao, genero.listar(), ator.listar(), destaque);				

					break;
					
					case 7:						
						break;
						
					default:
						System.out.println("Opção invalida");
						break;

					}

				}

				break;
				
			case 8:
				
				System.out.println("Digite o ID do filme que deseja remover");
				id = sc.nextInt();

				if (filmes.listarPorId(id) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {
					
					System.out.print("Confirma em remover o filme? [Y/N]: ");
					resp = sc.next();
					
					if(resp.equalsIgnoreCase("Y")){
						System.out.println("Removido com sucesso");
						filmes.removerPorId(id);
					}else {
						System.out.println("Abortado");
					}
					
					do {
						System.out.print("Deseja retornar ao menu? [Y/N]: ");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");
				
				
				break;
				
			case 9:
				
				System.out.println("Digite o nome do filme que deseja remover");
				nome = sc.next() + sc.nextLine();

				if (filmes.listarPorfilme(nome) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {
					
					System.out.print("Confirma em remover o filme? [Y/N]: ");
					resp = sc.next();
					
					if(resp.equalsIgnoreCase("Y")){
						System.out.println("Removido com sucesso");
						filmes.removerPorNome(nome);
					}else {
						System.out.println("Abortado");
					}
					
					do {
						System.out.print("Deseja retornar ao menu? [Y/N]: ");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");
				
				break;
				
			case 10:

				do {
					System.out.println("\n");
					System.out.print("Digite o nome da serie: ");
					nome = sc.next() + sc.nextLine();
					System.out.print("Digite uma descrição para o  " + nome + ": ");
					String descricao = sc.next() + sc.nextLine();
					String opcaoScope;
					do {
						System.out.print("Digite o nome do genero: ");
						String generoIn = sc.next() + sc.nextLine();

						genero = new GeneroDao();
						genero.cadastrar(generoIn);

						System.out.print("Deseja adicionar mais um genero? Y/N: ");
						opcaoScope = sc.next() + sc.nextLine();

					} while (opcaoScope.equalsIgnoreCase("Y"));

					opcaoScope = null;

					do {
						System.out.print("Digite o nome do ator: ");
						String atorIn = sc.next() + sc.nextLine();
						System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
						String nascionalidadeIn = sc.next() + sc.nextLine();

						ator = new AtorDao();
						ator.cadastrar(atorIn, nascionalidadeIn);

						System.out.print("Deseja adicionar mais um autor? Y/N: ");
						opcaoScope = sc.next() + sc.nextLine();

					} while (opcaoScope.equalsIgnoreCase("Y"));

					System.out
							.print("A serie: " + nome + " será destaque para que seja apresentado na tela principal? [true ou false]: ");
					boolean destaque = sc.nextBoolean();

					do {
						System.out.print("Digite o numero do episodio: ");
						int num = sc.nextInt();
						System.out.print("Digite o nome do episodio : " + num + ": ");
						nome = sc.next() + sc.nextLine();
						System.out.print("Digite a descrição do episodio: " + num + ": ");
						descricao = sc.next() + sc.nextLine();

						episodio = new EpisodioDao();
						episodio.cadastrar(num, nome, descricao);

						System.out.print("Deseja adicionar mais uma episodio? Y/N: ");
						opcaoScope = sc.next() + sc.nextLine();

					} while (opcaoScope.equalsIgnoreCase("Y"));

					series.cadastrar(nome, descricao, genero.listar(), ator.listar(), destaque, episodio.listar());

					System.out.print("Deseja adicionar outra serie?: [Y/N]");
					resp = sc.next() + sc.nextLine();
				} while (resp.equalsIgnoreCase("Y"));

				break;

			case 11:
				
				if (series.listarTodos() == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					for (int i = 0; i < series.listarTodos().size(); i++) {

						System.out.println(series.listarTodos().get(i));

					}

					do {
						System.out.println("Deseja retornar ao menu? [Y/N]");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));

				}
				
				break;
				
				
				
			case 12: 
				
				if (series.listarPorDestaques() == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					for (int i = 0; i < series.listarTodos().size(); i++) {

						System.out.println(series.listarTodos().get(i));

					}

					do {
						System.out.println("Deseja retornar ao menu? [Y/N]");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));

				}

				break;
				
			case 13:
				
				System.out.println("Digite o numero do ID que deseja buscar");
				id = sc.nextInt();

				if (series.listarPorId(id) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					System.out.println(series.listarPorId(id));
					do {
						System.out.println("Deseja retornar ao menu? [Y/N]");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");

				
				break;
				
			case 14:
				
				System.out.println("Digite o nome do filme que deseja buscar");
				nome = sc.next() + sc.nextLine();

				if (series.listarPorSerie(nome) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {

					System.out.println(series.listarPorSerie(nome));
					do {
						System.out.println("Deseja retornar ao menu? [Y/N]");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");
				
				break;
				
				
			case 15:
				
				System.out.println("Qual o id do filme que deseja alterar? ");
				id = sc.nextInt();

				if (series.listarPorId(id) == null) {
					System.out.println("Filme não encontrado, por favor verifique o id");
					aux.carregar();
				} else {

					System.out.println(series.listarPorId(id));
					System.out.println("Qual informação deseja alterar: ");
					System.out.println("1 - Nome: " + series.listarPorId(id).getNome());
					System.out.println("2 - Descrição: " + series.listarPorId(id).getDescricao());
					System.out.println("3 - Genero: " + series.listarPorId(id).getGenero());
					System.out.println("4 - Atores: " + series.listarPorId(id).getAtor());
					System.out.println("5 - Destaque: " + series.listarPorId(id).isDestaque());
					System.out.println("6 - Todos");
					System.out.println("7 - Sair");
					System.out.print("Opção: ");
					int ed = sc.nextInt();

					switch (ed) {

					case 1:

						System.out.print("Digite o novo nome");
						nome = sc.next() + sc.nextLine();

						series.editarseriePeloId(id, nome, series.listarPorId(id).getDescricao(),
								series.listarPorId(id).getGenero(), series.listarPorId(id).getAtor(),
								series.listarPorId(id).isDestaque(), series.listarPorId(id).getEpisodio());

						break;

					case 2:
						
						System.out.print("Digite o nova descrição: ");
						String descricao = sc.next() + sc.nextLine();

						series.editarseriePeloId(id, series.listarPorId(id).getNome(), descricao,
								series.listarPorId(id).getGenero(), series.listarPorId(id).getAtor(),
								series.listarPorId(id).isDestaque(), series.listarPorId(id).getEpisodio());

						break;

					case 3:
						
						System.out.print("Digite o nova descrição: ");
						String opcaoScope;
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						series.editarseriePeloId(id, series.listarPorId(id).getNome(), series.listarPorId(id).getDescricao(),
								genero.listar(), series.listarPorId(id).getAtor(),
								series.listarPorId(id).isDestaque(), series.listarPorId(id).getEpisodio());

						break;
						
					case 4:
						System.out.print("Digite o nova descrição: ");
						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							
							System.out.print("Digite a nacionalidade do ator: ");
							String nascionalidade = sc.next() + sc.nextLine();

							ator = new AtorDao();
							ator.cadastrar(atorIn, nascionalidade);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						series.editarseriePeloId(id, series.listarPorId(id).getNome(), series.listarPorId(id).getDescricao(),
								series.listarPorId(id).getGenero(), ator.listar(),
								series.listarPorId(id).isDestaque(),series.listarPorId(id).getEpisodio());

						break;
						
					case 5:
						
						System.out.print("Digite o novo destaque: true ou false");
						Boolean destaque = sc.nextBoolean();

						series.editarseriePeloId(id, series.listarPorId(id).getNome(), series.listarPorId(id).getDescricao(),
								series.listarPorId(id).getGenero(), series.listarPorId(id).getAtor(),
								destaque, series.listarPorId(id).getEpisodio());

						break;
						
					case 6:
						
						System.out.println("\n");
						System.out.print("Digite o nome do filme: ");
						 nome = sc.next() + sc.nextLine();
						System.out.print("Digite uma descrição para o  " + nome + ": ");
						descricao = sc.next() + sc.nextLine();
					
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;

						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
							String nascionalidadeIn = sc.next() + sc.nextLine();

							ator.cadastrar(atorIn, nascionalidadeIn);

							System.out.print("Deseja adicionar mais um autor? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						System.out
								.print("O filme: " + nome + " será destaque para que seja apresentado na tela principal?  [true ou false]: ");
						destaque = sc.nextBoolean();

						do {
							System.out.print("Digite o numero do episodio: ");
							int num = sc.nextInt();
							System.out.print("Digite o nome do episodio : " + num + ": ");
							nome = sc.next() + sc.nextLine();
							System.out.print("Digite a descrição do episodio: " + num + ": ");
							descricao = sc.next() + sc.nextLine();

							episodio = new EpisodioDao();
							episodio.cadastrar(num, nome, descricao);

							System.out.print("Deseja adicionar mais um autor? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						series.cadastrar(nome, descricao, genero.listar(), ator.listar(), destaque, episodio.listar());				

					break;
					
					case 7:
						
						break;
						
					default:
						System.out.println("Opção invalida");
						break;

					}

				}

				
				break;
				
			case 16:
				
				
				System.out.println("Qual o nome da serie que deseja alterar? ");
				nome = sc.next() + sc.nextLine();

				if (series.listarPorSerie(nome) == null) {
					System.out.println("Serie não encontrado, por favor verifique o nome");
					aux.carregar();
				} else {

					System.out.println(series.listarPorSerie(nome));
					System.out.println("Qual informação deseja alterar: ");
					System.out.println("1 - Nome: " + series.listarPorSerie(nome).getNome());
					System.out.println("2 - Descrição: " + series.listarPorSerie(nome).getDescricao());
					System.out.println("3 - Genero: " + series.listarPorSerie(nome).getGenero());
					System.out.println("4 - Atores: " + series.listarPorSerie(nome).getAtor());
					System.out.println("5 - Destaque: " + series.listarPorSerie(nome).isDestaque());
					System.out.println("6 - Todos");
					System.out.println("7 - Sair");
					System.out.print("Opção: ");
					int ed = sc.nextInt();

					switch (ed) {

					case 1:

						System.out.print("Digite o novo nome: ");
						String nomeAntigo = series.listarPorSerie(nome).getNome();
						nome = sc.next() + sc.nextLine();

						System.out.println(nome);
						series.editarSeriePeloNome(nome, series.listarPorSerie(nomeAntigo).getDescricao(),
								series.listarPorSerie(nomeAntigo).getGenero(), series.listarPorSerie(nomeAntigo).getAtor(),
								series.listarPorSerie(nomeAntigo).isDestaque(), series.listarPorSerie(nomeAntigo).getEpisodio(),  true);

						break;

					case 2:
						
						System.out.print("Digite o nova descrição: ");
						String descricao = sc.next() + sc.nextLine();

						series.editarSeriePeloNome(series.listarPorSerie(nome).getNome(), descricao,
								series.listarPorSerie(nome).getGenero(), series.listarPorSerie(nome).getAtor(),
								series.listarPorSerie(nome).isDestaque(), series.listarPorSerie(nome).getEpisodio(), false);

						break;

					case 3:
						
						System.out.print("Digite o nova descrição: ");
						String opcaoScope;
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						series.editarSeriePeloNome(series.listarPorSerie(nome).getNome(), series.listarPorSerie(nome).getDescricao(),
								genero.listar(), series.listarPorSerie(nome).getAtor(),
								series.listarPorSerie(nome).isDestaque(),series.listarPorSerie(nome).getEpisodio(),false);

						break;
						
					case 4:
						System.out.print("Digite o nova descrição: ");
						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							
							System.out.print("Digite a nacionalidade do ator: ");
							String nascionalidade = sc.next() + sc.nextLine();

							ator = new AtorDao();
							ator.cadastrar(atorIn, nascionalidade);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;


						series.editarSeriePeloNome(series.listarPorSerie(nome).getNome(), series.listarPorSerie(nome).getDescricao(),
								series.listarPorSerie(nome).getGenero(), ator.listar(),
								series.listarPorSerie(nome).isDestaque(),series.listarPorSerie(nome).getEpisodio(),false);

						break;
						
					case 5:
						
						System.out.print("Digite o novo destaque: true ou false");
						Boolean destaque = sc.nextBoolean();

						series.editarSeriePeloNome(series.listarPorSerie(nome).getNome(), series.listarPorSerie(nome).getDescricao(),
								series.listarPorSerie(nome).getGenero(), series.listarPorSerie(nome).getAtor(),
								destaque,series.listarPorSerie(nome).getEpisodio(),false);

						break;
						
					case 6:
						
						System.out.println("\n");
						System.out.print("Digite o nome do filme: ");
						 nome = sc.next() + sc.nextLine();
						System.out.print("Digite uma descrição para o  " + nome + ": ");
						descricao = sc.next() + sc.nextLine();
					
						do {
							System.out.print("Digite o nome do genero: ");
							String generoIn = sc.next() + sc.nextLine();

							genero = new GeneroDao();
							genero.cadastrar(generoIn);

							System.out.print("Deseja adicionar mais um genero? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						opcaoScope = null;

						do {
							System.out.print("Digite o nome do ator: ");
							String atorIn = sc.next() + sc.nextLine();
							System.out.print("Digite a nacionalidade do: " + atorIn + ": ");
							String nascionalidadeIn = sc.next() + sc.nextLine();

							ator.cadastrar(atorIn, nascionalidadeIn);

							System.out.print("Deseja adicionar mais um autor? Y/N: ");
							opcaoScope = sc.next() + sc.nextLine();

						} while (opcaoScope.equalsIgnoreCase("Y"));

						System.out
								.print("O filme: " + nome + " será destaque para que seja apresentado na tela principal? [true ou false]: ");
						destaque = sc.nextBoolean();

						series.cadastrar(nome, descricao, genero.listar(), ator.listar(), destaque, episodio.listar());				

					break;
					
					case 7:						
						break;
						
					default:
						System.out.println("Opção invalida");
						break;

					}

				}

				break;
				
				
			case 17:
				
				System.out.println("Digite o ID da serie que deseja remover");
				id = sc.nextInt();

				if (series.listarPorId(id) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {
					
					System.out.print("Confirma em remover o filme? [Y/N]: ");
					resp = sc.next();
					
					if(resp.equalsIgnoreCase("Y")){
						System.out.println("Removido com sucesso");
						series.removerPorId(id);
					}else {
						System.out.println("Abortado");
					}
					
					do {
						System.out.print("Deseja retornar ao menu? [Y/N]: ");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");
				
				break;
				
			case 18:
				
				System.out.println("Digite o nome do filme que deseja remover");
				nome = sc.next() + sc.nextLine();

				if (series.listarPorSerie(nome) == null) {
					System.out.println("Não temos nenhum filme para mostra");
					aux.carregar();
				} else {
					
					System.out.print("Confirma em remover o filme? [Y/N]: ");
					resp = sc.next();
					
					if(resp.equalsIgnoreCase("Y")){
						System.out.println("Removido com sucesso");
						series.removerPorNome(nome);
					}else {
						System.out.println("Abortado");
					}
					
					do {
						System.out.print("Deseja retornar ao menu? [Y/N]: ");
						resp = sc.next();
					} while (!resp.equalsIgnoreCase("Y"));
				}
				System.out.println("");
				break;
				
			case 19: 
				
				filmes.listarTodos().forEach(c -> System.out.println(c));
				series.listarTodos().forEach(c -> System.out.println(c));
				
				
				do {
					System.out.print("Deseja retornar ao menu? [Y/N] ");
					resp = sc.next();
				} while (!resp.equalsIgnoreCase("Y"));

				
				break;
				
			case 20:
				
				aux.fim();
				scopeGlobal = 20;
				break;
				
			default:
				System.out.println("Opção invalida \n");
				break;
			}

		} while (scopeGlobal != 20);

	}

}
