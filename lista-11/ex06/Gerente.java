package ex06;

import ex05.SalarioFuncionario;

public class Gerente implements SalarioFuncionario {
    public String nome;
    public final int horasTrabalhadasOficiais = 180;
    public double valorHoraBase;
    public double recebimentoHoraExtra;
    public double recebimentoFinal;

    public Gerente(String nome, double valorHoraBase) {
        defineNome(nome);
        valorHoraBase(valorHoraBase);
    }

    public void defineNome(String nome) {
        this.nome = nome;
    }

    public void valorHoraBase(double valorHoraBase) {
        this.valorHoraBase = valorHoraBase;
    }

    public void calculaHE(int quantidade) {
        recebimentoHoraExtra = quantidade * 1.2 * valorHoraBase;
    }


    public void calculaSalarioFinal() {
        recebimentoFinal = (
            2000 +
            horasTrabalhadasOficiais * valorHoraBase +
            recebimentoHoraExtra
        );
    }  
}