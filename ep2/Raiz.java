/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   2020194 - Norton Trevisan Roman                               **/
/**                                                                 **/
/**   Segundo Exercício-Programa                                    **/
/**                                                                 **/
/**   João Eduardo da Paz                   11845514	            **/
/**                                                                 **/
/**   16/04/2020                                                 	**/
/*********************************************************************/

/*
	Cálculo para raiz quadrada
*/
public class Raiz {
	/*
		Calcula a raiz quadrada de um valor, com uma determinada
		precisão. Retorna esse valor, ou -1 quando:
		
		* a < 0
		* epsilon <= 0
		* epsilon >= 1

		Parâmetros:
			a - valor cuja raiz quadrada será calculada
			epsilon - precisão do cálculo
		
		Variáveis locais:
			x - array que conterá consecutivas aproximações da raiz de a até 
				que limite atinga a condição necessária:
					* O retorno do método será o último elemento diferente de zero deste array 
					* Convencionei de atribuir a x um length de 64 após alguns testes. Números 
						extremamente grandes e com epsilon baixíssimos tendem a ter de 40 a 50 
						iterações até que a condição de escape seja atingida. Eu até pensei em
						elaborar um outro método que calculasse o length ideal, mas seria um 
						processamento desnecessário frente ao fato de que o Java 
						descartará a memória deste array após o fim do método.
			limite - a diferença entre o último e penultimo elemento diferente de 0 de x.
				É atualizado a cada iteração. A condição de escape é: limite < epsilon
			i - iterador, que começa em 1 porque o primeiro elemento possui um
				cálculo diferente.
	*/
	static double raizQuadrada(double a, double epsilon) {
		if (a < 0 || epsilon <= 0 || epsilon >= 1) return -1;
		if (a == 0) return 0;

		double[] x = new double[64];

		x[0] = a / 2;
		
		int i = 1;
		
		for (double limite = 1; limite >= epsilon; i++) {
			x[i] = ((a / x[i-1]) + x[i-1]) / 2;	

			limite = x[i] - x[i-1];

			/*
				Caso a seja maior ou igual a 1, limite será negativo, e precisamos do 
				módulo deste valor.
			*/ 
			if (limite < 0) limite *= -1; // Multiplicar por -1 substitui o Math.abs()
		}

		/* 
			Como o iterador sofre um incremento na última iteração do for, 
			este decremento é necessário no retorno
		*/
		return x[--i]; 
		
	}
	public static void main(String[] args) {
		double valor = 42;
		double precisao = 0.4815162342;
		
		System.out.println("\nRaiz de : "+valor+" = "+raizQuadrada(valor, precisao));
	}
}
