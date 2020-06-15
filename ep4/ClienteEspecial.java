
public class ClienteEspecial extends Cliente{
	static final int dividaMaxima = 50000;
	static final String tipo = "CE";
	
	/* Construtor da Classe ClienteEspecial
	 * Este construtor invoca o construtor da classe Cliente.
	 */
	ClienteEspecial(String nome, int cpf, int valor){
		super(nome, cpf, valor);
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
	
	public boolean obterEmprestimo(int valor) {
		/*
		* Este método sobrescreve o da classe Cliente 
		* para que o atributo dividaMaxima de ClienteEspecial
		* seja considerado, e não o de Cliente
		*/ 
		if (valor <= 0) return false;

		if (getValorDaDivida() + valor > dividaMaxima) return false;

		int incrementoDivida = valor + getValorDaDivida();
		int incrementoContaCorrente = valor + getValorContaCorrente();

		setValorDaDivida(incrementoDivida);
		setValorContaCorrente(incrementoContaCorrente);

		return true;		
	}
	
}
