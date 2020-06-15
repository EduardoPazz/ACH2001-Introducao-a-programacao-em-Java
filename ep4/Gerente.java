public class Gerente extends Pessoa implements InterfaceGerente{
	private static final String tipo = "G";
	private Cliente[] clientes;
	private int numClientes;

	/* Construtor da Classe Gerente
	 * Este construtor invoca o construtor da classe Pessoa e inicializa os dois atributos 
	 * do objeto que esta sendo instanciado.
	 */
	Gerente(String nome, int cpf){
		super(nome, cpf);
		clientes = new Cliente[20];
		numClientes = 0;
	}

	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
	
	/* Metodo para imprimir informacoes sobre os clientes gerenciados pelo gerente atual
	 */
	void imprimirClientes(){
		Cliente atual;
		System.out.println("\tNumero de clientes: " + numClientes);
		for (int c = 0; c < numClientes; c++){
			atual = clientes[c];
			System.out.println("\t" + (c+1) + "\t" + atual.retornaTipo() + "\t" + atual.nome + "\t" + atual.cpf + "\t" + atual.getValorContaCorrente() + "\t" + atual.getValorDaDivida() + "\t" + atual.negativado());
		}
	}


	/* Metodo para adicionar um cliente no arranjo de clientes do gerente atual.
	 * Caso o numero de clientes seja igual a 20, nao deve adicionar e deve retornar false.
	 * Caso contrario, ha duas situacoes: 
	 *   1a: o cliente ja consta no arranjo de clientes (verifique isso usando o numero do cpf),
	 *       neste caso o cliente nao deve ser reinserido e o metodo deve retornar false; 
	 *   1a: o cliente passado como parametro nao consta no arranjo de clientes: o cliente 
	 *       deve ser adicionado na posicao numClientes, o atributo numClientes deve ser 
	 *       incrementado em 1 e o metodo deve retornar true. 
	 */
	public boolean adicionarCliente(Cliente cliente) {
		// Testa o limite de clientes
		if (numClientes == 20) return false;

		// Testa um cliente já existente
		for (Cliente clienteTeste : clientes) {
			/*
			 * Assim que algum clienteTeste for null, quer dizer
			 * que desta posição e adiante não há mais nenhum cliente
			 * cadastrado, o que valida a inserção de um novo
			*/ 
			if (clienteTeste == null) break;

			if (clienteTeste.cpf == cliente.cpf) return false;
		}

		clientes[numClientes++] = cliente;

		return true;
	}

	
	/* Metodo para cobrar os emprestimos de todos os clientes do gerente atual.
	 * Para cada um dos clientes presentes no arranjo clientes, este metodo deve:
	 *   - nao fazer nada para o cliente, caso seu valorDaDivida seja igual a zero
	 *   - caso contrario, ha duas situacoes:
	 *     1a) se o valorContaCorrente do cliente for maior ou igual ao valorDaDivida, deve
	 *         fazer o cliente pagar a divida, isto e, o valorContaCorrente sera atualizado, 
	 *         descontando-se o valor da divida e o valorDaDivida sera zerado.
	 *     2a) se o valorContaCorrente do cliente for menor do que o valorDaDivida, 
	 *         deve fazer o cliente pagar parte da divida, isto e, o valorDaDivida 
	 *         sera atualizado, tendo seu valor diminuido pelo valorContaCorrente e 
	 *         o valorContaCorrente sera zerado.
	 */
	public void cobrarTodosEmprestimos() {
		for (Cliente cliente : clientes) {
			/*
			 * Assim que algum cliente for null, quer dizer
			 * que desta posição e adiante não há mais nenhum cliente
			 * cadastrado, o que marca o fim do loop.
			*/
			if (cliente == null) return;
			
			if (cliente.getValorDaDivida() == 0) continue;

			// A partir daqui, apenas clientes com dívidas

			if (cliente.getValorContaCorrente() > cliente.getValorDaDivida()) {
				// Neste bloco, clientes que podem pagar a dívida inteira

				int debito = (
					cliente.getValorContaCorrente() - 
					cliente.getValorDaDivida()
				);

				cliente.setValorContaCorrente(debito);

				cliente.setValorDaDivida(0);
			} else {
				// Neste bloco, clientes que podem apenas pagar 
				// parte da dívida e terão sua conta zerada.

				int debito = (
					cliente.getValorDaDivida() -
					cliente.getValorContaCorrente()
				);

				cliente.setValorDaDivida(debito);

				cliente.setValorContaCorrente(0);
			}
		}
	}



}
