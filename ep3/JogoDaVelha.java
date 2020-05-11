/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020194 - Norton Trevisan Roman                               **/
/**                                                                 **/
/**   Terceiro Exercicio-Programa                                   **/
/**                                                                 **/
/**   João Eduardo da Paz                   11845514	            **/
/**                                                                 **/
/**   10/05/2020                                                 	**/
/*********************************************************************/

/*
	Jogo da Velha - programa para verificar o status de um jogo.
	
	Lista de Status calculado:
	0 - Jogo não iniciado: o tabuleiro está 'vazio', isto é sem peças X e O;
    1 - Jogo encerrado1: o primeiro jogador (que usa as peças X) é o ganhador;
    2 - Jogo encerrado2: o segundo jogador (que usa as peças O) é o ganhador;
    3 - Jogo encerrado3: empate - todas as casas do tabuleiro estão preenchidas com X e O, mas nenhum dos jogadores ganhou;
    4 - Jogo já iniciado e em andamento: nenhuma das alternativas anteriores.	
*/

public class JogoDaVelha {
	static final char pecaX = 'X';
	static final char pecaY = 'O';
	static final char espacoVazio = ' ';

	/*
		Determina o status de uma partida de Jogo da Valha
		
		Entrada:
			tabuleiro - matriz 3x3 de caracteres representando uma 
				partida válida de Jogo da Velha
			
		Saída:
			um inteiro contendo o status da partida (valores 
				válidos de zero a quatro)
	*/
	static int verificaStatus(char[][] tabuleiro) {
		/* Explicação dos diferentes testes assumidos:

			*** Entre 1: (testar cada possibilidade (coluna / linha / diagonais)
			utilizando uma dupla de "for" para cada) e 2: (testar 
			todas as possibilidades em uma única dupla de for
			utilizando diversas variáveis), a opção 2 pareceu-me 
			mais performática, e foi a que escolhi.


			*** Testando os status 0, 1 e 2:
				Levando em conta que o unicode de 'X' é 88, o de 'O' é 79
				e de que o de ' ' é 32, ao final do for será testado o total
				acumulado por sua respectiva variável:
					- 88 * 3 (264) para uma sequência de 3 'X's
					- 79 * 3 (237) para uma sequência de 3 'O's
					- 32 * 9 (288) para todas as células vazias
				Estas somas serão armazenadas nas variáveis soma* e naoIniciado
				e serão testadas após o looping.


			*** Testando o status 4:
				Será o último teste, caso os status 0, 1 ou 2 tenham falhado
				, e será válido caso a variável emAndamento tenha 
				recebido true em alguma célula.


			*** O status 3:
				Por conveniência o status inicial é o próprio 3 e 
				caso o tabuleiro não passe em nenhum teste, 
				o output da função será 3.


			*** A lógica das diagonais: 
				Dado a matrix[i][j], sendo i a representação da linha  
				e j a representação da coluna de uma matriz: 
				- células cujo (i == j) são da diagonal primária
				- células cujo (i + j == 4) são da diagonal secundária
		*/		

		int status = 3;

		short somaLinha1 = 0;
		short somaLinha2 = 0;
		short somaLinha3 = 0;

		short somaColuna1 = 0;
		short somaColuna2 = 0;
		short somaColuna3 = 0;

		short somaDP = 0; // DP == Diagonal Primária
		short somaDS = 0; // DS == Diagonal Secundária

		boolean emAndamento = false;
		short naoIniciado = 0;

		for (byte j = 0; j < 3; j++) {
			for (byte i = 0; i < 3; i++) {
				if ((byte) tabuleiro[i][j] == 32) {
					emAndamento = true;
					naoIniciado += 32;
				}

				if (i == 0) somaLinha1 += (byte) tabuleiro[i][j];
				if (i == 1) somaLinha2 += (byte) tabuleiro[i][j];
				if (i == 2) somaLinha3 += (byte) tabuleiro[i][j];

				if (j == 0) somaColuna1 += (byte) tabuleiro[i][j];
				if (j == 1) somaColuna2 += (byte) tabuleiro[i][j];
				if (j == 2) somaColuna3 += (byte) tabuleiro[i][j];

				if (i == j) somaDP += (byte) tabuleiro[i][j];
				if (i + j == 3) somaDS += (byte) tabuleiro[i][j];	
			}		
		} 

		if (naoIniciado == 288) status = 0;

		else if ( /* X */
			somaLinha1 == 264 ||
			somaLinha2 == 264 ||
			somaLinha3 == 264 ||
			somaColuna1 == 264 ||
			somaColuna2 == 264 ||
			somaColuna3 == 264 ||
			somaDP == 264 ||
			somaDS == 264
		) status = 1;

		else if ( /* O */
			somaLinha1 == 237 ||
			somaLinha2 == 237 ||
			somaLinha3 == 237 ||
			somaColuna1 == 237 ||
			somaColuna2 == 237 ||
			somaColuna3 == 237 ||
			somaDP == 237 ||
			somaDS == 237
		) status = 2;	
		 
		else if (emAndamento) status = 4;

		return status;
	}
	
	public static void main(String[] args) {

		char[][] tab0 = {
			{' ',' ',' '},
			{' ',' ',' '},
			{' ',' ',' '}
		};

		char[][] tab1 = {
			{'X','X','X'},
			{'O','O',' '},
			{' ',' ',' '}
		};

		char[][] tab2 = {
			{'O','X','X'},
			{'X','O','O'},
			{' ',' ','O'}
		};

		char[][] tab3 = {
			{'O','X','X'},
			{'X','O','O'},
			{'O','X','X'}
		};

		char[][] tab4 = {
			{' ',' ',' '},
			{'X','O','X'},
			{' ',' ',' '}
		};

		System.out.println("Status calculado: " + verificaStatus(tab0));
		System.out.println("Status esperado para o tabuleiro0: 0\n");

		System.out.println("Status calculado: " + verificaStatus(tab1));
		System.out.println("Status esperado para o tabuleiro1: 1\n");

		System.out.println("Status calculado: " + verificaStatus(tab2));
		System.out.println("Status esperado para o tabuleiro2: 2\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab3));
		System.out.println("Status esperado para o tabuleiro3: 3\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab4));
		System.out.println("Status esperado para o tabuleiro4: 4\n");
	}
}
