package ex04;

class LocalizadorBinario implements LocalizadorDePessoas{
    public Pessoa localizaPorRG(int rg, Pessoa[] vp) {
        Pessoa[] vpOrdenado = Insercao.ordenador(vp);
        int min = 0;
        int max = vpOrdenado.length - 1;
        int middle;

        while (min <= max) {
            middle = (max + min) / 2;

            if (rg == vpOrdenado[middle].RG()) return vpOrdenado[middle];

            if (rg > vpOrdenado[middle].RG()) min = middle + 1;
            else max = middle - 1;
        }

        return null;        
    }
}