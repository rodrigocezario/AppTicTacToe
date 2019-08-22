/**
 * Atividade prática em Java da disciplina de Programação I
 * Programa "Jogo da Velha - AppTicTacToe".
 *
 * @author  Rodrigo Cezario da Silva
 * @version 1.0
 * @since   2015-08-26 
 */

package br.com.jogo;

import java.util.Scanner;

public class AppJogoDaVelha {

	static char[][] tabuleiro = new char[3][3];

	public static void main(String[] args) {
		
		char jogador1 = 'X';
		char jogador2 = '0';
		char jogador;
		
		Scanner sc = new Scanner(System.in);
		int linha, coluna;
		inicilizarTabuleiro();
		imprimirTabuleiro();

		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				// joga o jogador1
				System.out.println("Jogador 1 (X) joga...");
				jogador = jogador1;
			} else {
				// joga o jogador2
				System.out.println("Jogador 2 (0) joga...");
				jogador = jogador2;
			}

			do {
				System.out.println("Informe a linha da sua jogada (0 até 2): ");
				linha = sc.nextInt();
				System.out.println("Informe a coluna da sua jogada (0 até 2): ");
				coluna = sc.nextInt();
			} while (!verificaJogada(linha, coluna));

			System.out.println("Jogada aceita....");
			tabuleiro[linha][coluna] = jogador;// marca a jogada...

			// System.out.println("Linha: "+ linha);
			// System.out.println("Coluna: "+ coluna);

			System.out.println("=============================");

			if (verificaVencedor()) {
				System.out.println("Houve um vencedor!");
				System.exit(0);
			}

			imprimirTabuleiro();
		}

		System.out.println("Não houve vencedor!!");
	}

	public static void inicilizarTabuleiro() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
	}

	public static boolean verificaJogada(int linha, int coluna) {
		boolean ok = true;
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == '0') {
			ok = false;
			System.err.println("Jogada não permitida... \n" + "espaço já foi marcado...\n" + "tente novamente...\n");
		}
		return ok;
	}

	public static boolean verificaVencedor() {

		boolean venceu = false;
		// seu código deve ser implementado aqui
		return venceu;
	}

	public static void imprimirTabuleiro() {
		System.out.println("\n === JOGO DA VELHA === \n");
		System.out.println("\t " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
		System.out.println("\t------------");
		System.out.println("\t " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
		System.out.println("\t------------");
		System.out.println("\t " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
	}

}
