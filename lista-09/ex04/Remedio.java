package ex04;

class Remedio {
    private String nome;
    float precoFinal;

    String obterNome() {
        return nome;
    }

    void definirNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Remedio venenoDeRato = new Remedio();
        venenoDeRato.definirNome("Veneno de Rato");

        SubstanciaD alcool = new SubstanciaD();
        alcool.defineNome("Álcool");
        alcool.defineTipo(1);
        alcool.definePreco(1);

        SubstanciaD potassio = new SubstanciaD();
        potassio.defineNome("Potássio");
        potassio.defineTipo(2);
        potassio.definePreco(3);

        venenoDeRato.precoFinal = (float) (
            3 * alcool.obtemPreco() * alcool.obtemTipo() +
            5 * potassio.obtemPreco() * potassio.obtemTipo()
        );

        System.out.format(
            "Preço de uma unidade do remédio %s = %f\n",
            venenoDeRato.obterNome(), venenoDeRato.precoFinal
        );
    }
}