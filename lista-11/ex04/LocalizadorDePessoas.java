package ex04;

interface LocalizadorDePessoas {
    Pessoa localizaPorRG(int rg, Pessoa[] vp);

    public static void main(String[] args) {
        Pessoa[] vp = {
            new Pessoa("Eduardo da Paz", 386379804, 52579802),
            new Pessoa("Giullia Bataglia", 65464565, 63238776),
            new Pessoa("Andreia Paula", 65464565, 68738776)
        };

        Pessoa escolha = new LocalizadorSequencial().localizaPorRG(386379804, vp);
        Pessoa escolha2 = new LocalizadorBinario().localizaPorRG(386379804, vp);

        System.out.println(
            escolha.nome()
        );

        System.out.println(
            escolha2.nome()
        );        
    }
}