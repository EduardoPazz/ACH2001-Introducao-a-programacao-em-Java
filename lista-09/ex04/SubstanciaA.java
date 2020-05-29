package ex04;

class SubstanciaA {
    private String nome;
    private int tipo; // 1=simples    2=nobre
    private double preco;
    
    public void defineNome(String pnome) {
        nome = pnome;
    }

    public String obtemNome() {
        return nome;
    }

    public void defineTipo(int ptipo) {
        tipo = ptipo;
    }

    public int obtemTipo() {
        return tipo;
    }

    private void definePreco(int ppreco) {
        preco = ppreco;
    }
    
    private double obtemPreco() {
        return preco;
    }
}