package br.com.fiap.checkpoint1.fiapflix.assets;

/***
 * Classe responsável por limpar o console, logo da fiapflix e exibir mensagens 
 * @author Luan Reis
 * @author Henrique Cesar
 * @author Dennys Nascimento
 * @author Gustavo Fontes
 * @author Rodrigo Machado
 */

public class Assets {
	
	/**
	 * Método que recebe o logo da Fiap flix
	 * @return o logo do FiapFlix
	 */
	public String fiap() {
		String f;

		return f = " ______   __     ______     ______      ______   __         __     __  __    \r\n"
				+ "/\\  ___\\ /\\ \\   /\\  __ \\   /\\  == \\    /\\  ___\\ /\\ \\       /\\ \\   /\\_\\_\\_\\   \r\n"
				+ "\\ \\  __\\ \\ \\ \\  \\ \\  __ \\  \\ \\  _-/    \\ \\  __\\ \\ \\ \\____  \\ \\ \\  \\/_/\\_\\/_  \r\n"
				+ " \\ \\_\\    \\ \\_\\  \\ \\_\\ \\_\\  \\ \\_\\       \\ \\_\\    \\ \\_____\\  \\ \\_\\   /\\_\\/\\_\\ \r\n"
				+ "  \\/_/     \\/_/   \\/_/\\/_/   \\/_/        \\/_/     \\/_____/   \\/_/   \\/_/\\/_/ ";

	}

	/**
	 * Método que printa iniciando...
	 * @throws InterruptedException
	 */
	public void inicio() throws InterruptedException {
		System.out.println(fiap());
		System.out.println("");
		System.out.print("Iniciando");{
			
			Thread.sleep(500);
			for (int i = 0; i < 3; i++) {
				
				System.out.print(".");
				Thread.sleep(500);
				
			}
			System.out.println();
				
		}
	}

	/**
	 * Método que limpa o console
	 */
	public void clear() {

		for (int i = 0; i < 5; i++) {

			System.out.println(" ");

		}
		System.out.println(this.fiap());

		for (int i = 0; i < 3; i++) {

			System.out.println(" ");

		}

	}

	/**
	 * Método que printa a mensagem 
	 * no encerramento do projeto
	 */
	public void fim() throws InterruptedException{
	
		
		System.out.print("Encerrando");
		
		Thread.sleep(500);
		for (int i = 0; i < 3; i++) {
			
			System.out.print(".");
			Thread.sleep(500);
			
		}

		for (int i = 0; i < 5; i++) {

			System.out.print("\n");

		}
		
		
		
		System.out.println("");
		
		

		System.out.println(" ______     ______     ______     __     ______     ______     _____     ______    \r\n"
				+ "/\\  __ \\   /\\  == \\   /\\  == \\   /\\ \\   /\\  ___\\   /\\  __ \\   /\\  __-.  /\\  __ \\   \r\n"
				+ "\\ \\ \\/\\ \\  \\ \\  __<   \\ \\  __<   \\ \\ \\  \\ \\ \\__ \\  \\ \\  __ \\  \\ \\ \\/\\ \\ \\ \\ \\/\\ \\  \r\n"
				+ " \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\____-  \\ \\_____\\ \r\n"
				+ "  \\/_____/   \\/_____/   \\/_/ /_/   \\/_/   \\/_____/   \\/_/\\/_/   \\/____/   \\/_____/ \r\n"
				+ "                                                                                   ");

		for (int i = 0; i < 5; i++) {

			System.out.print("\n");

		}
		
	}
	
	public void carregar() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			
			System.out.print(".");
			Thread.sleep(500);
	}
	}

}
