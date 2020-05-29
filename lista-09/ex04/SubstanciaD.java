package ex04;

class SubstanciaD {
    private String nome;
    private int tipo; // 1=simples    2=nobre 
    private double preco;
    int counter;
    final float cotacao = 5.41f; // $1 == R$5,41    Dados de 29/05/2020 

    void mostraTudo() {
        System.out.println(
            "Nome: " + nome +
            "\nTipo: " + tipo +
            "\nPreço: " + preco +
            "\nQuantidade: " + counter +
            "\nCotação Dólar => Real:" + cotacao
        );
    }
    
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

    public void definePreco(int ppreco) {
        preco = ppreco;
    }
    
    public double obtemPreco() {
        return preco;
    }
}