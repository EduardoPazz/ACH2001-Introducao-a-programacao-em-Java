package ex14;

class Pessoa {
    static final byte DIA = 0;
    static final byte MES = 1;
    static final byte ANO = 2;

    String nome;
    String genero;
    int rg;
    short[] dataNasc = new short[3]; // dd/mm/aaaa

    Pessoa(
        String nome,
        String genero,
        int rg,
        short[] dataNasc
    ) {
        this.nome = nome;
        this.genero = genero;
        this.rg = rg;
        this.dataNasc = dataNasc;
    }

    byte idade(short[] dataAtual) {
        byte anos = (byte) (dataAtual[ANO] - this.dataNasc[ANO]);

        if (anos < 0) return -1;

        byte meses = (byte) (dataAtual[MES] - this.dataNasc[MES]);

        if (meses == 0) {
            byte dias = (byte) (dataAtual[DIA] - this.dataNasc[DIA]);
            if (dias < 0) {
                anos--;
            }
        } else if (meses < 0) {
            anos--;
        }

        return anos;
    }
}