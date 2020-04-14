/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020194 - Norton Trevisan Roman                               **/
/**                                                                 **/
/**   Primeiro Exercício-Programa                                   **/
/**                                                                 **/
/**   João Eduardo da Paz                   11845514                **/
/**                                                                 **/
/**   14/04/2020                                                    **/
/*********************************************************************/

/*
	Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/
public class CaixaEletronico {

    /* 
        Para poupar atribuições de 0 à esses atributos quando eles não 
        passarem nos testes do método fazRetirada, eles serão inicializados
        com 0;
    */

	// Número de cédulas de B$50,00
	static int n50 = 0;
	
	// Número de cédulas de B$10,00
	static int n10 = 0;

	// Número de cédulas de B$5,00
	static int n5 = 0;
	
	// Número de cédulas de B$1,00
	static int n1 = 0;

	/*
		Determina a quantidade de cada nota necessária para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de cédulas entregues.
		
		Abastece as variáveis globais n50,n10, n5 e n1 com seu respectivo
		número de cédulas.
		
		Parâmetro:
            valor - O valor a ser retirado

        Há o uso de duas variáveis auxiliares para remeter às dezenas e unidades
        do valor para ajudarem nos cálculo.
        
        O segundo if checa se há necessidade de uso de notas de 10 com base na
        diferença do valor total com o valor obtido apenas com as notas de 50.

        O terceiro if checa se há necessidade de uso de notas de 5. Levando em 
        conta que o estoque de notas é ilimitado, se houver o uso de alguma 
        nota de 5, será de apenas 1, sempre.

        Independente das unidades do valor, o uso de notas de 1 será sempre regido
        pelo resto da divisão deles por 5.

        PS: Interessante que em Weblands existe nota de 1 valor monetário :D.
        PPS: A resolução deste exercício me lembrou o funcionamento do Abaco.
	*/
	static void fazRetirada(int valor) {
		if (valor <= 0) {
            n50 = -1;
            n10 = -1;
            n5 = -1;
            n1 = -1;
        } else {
            if (50 < valor) n50 = valor / 50;

            int valorDezena = valor - n50*50;
            if (10 <= valorDezena) n10 = valorDezena / 10;
    
            int valorUnidade = valor % 10;
            if (5 <= valorUnidade) n5 = 1;
            n1 = valorUnidade % 5;
        }
	}
	
	public static void main(String[] args) {
        int valor = 0;
        fazRetirada(valor);
        System.out.println("Valor: " + valor);
        System.out.println("n50\tn10\tn5\tn1");
        System.out.println(n50 + "\t" + n10 + "\t" + n5 + "\t" + n1);
	}
}