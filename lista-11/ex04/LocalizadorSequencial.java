package ex04;

class LocalizadorSequencial implements LocalizadorDePessoas{
    public Pessoa localizaPorRG(int rg, Pessoa[] vp) {
        for (Pessoa pessoa : vp) {
            if (pessoa.RG() == rg) return pessoa;
        }

        return null;        
    }
}