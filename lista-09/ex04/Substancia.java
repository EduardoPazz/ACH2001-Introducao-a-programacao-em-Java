package ex04;

class Substancia {
    String nome;
    int tipo; // 1=simples    2=nobredouble preco
    
    void defineNome(String pnome) {
        nome = pnome;
    }

    String obtemNome() {
        return nome;
    }

    void defineTipo(int ptipo) {
        tipo = ptipo;
    }

    int obtemTipo() {
        return tipo;
    }

    void definePreco(int ppreco) {
        preco = ppreco;
    }
    
    double obtemPreco() {
        return preco;
    }
}