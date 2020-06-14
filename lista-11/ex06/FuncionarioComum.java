package ex06;

import ex05.SalarioFuncionario;

public class FuncionarioComum implements SalarioFuncionario {
    public String nome;
    public String cargo;
    public String dataAdmissao;
    public final int horasTrabalhadasOficiais = 200;
    public double valorHoraBase;
    public double recebimentoHoraExtra;
    public double recebimentoFinal;

    public FuncionarioComum(String nome, String cargo, String dataAdmissao, double valorHoraBase) {
        defineNome(nome);
        defineCargo(cargo);
        defineDataAdmissao(dataAdmissao);
        valorHoraBase(valorHoraBase);
    }

    public void defineNome(String nome) {
        this.nome = nome;
    }

    public void valorHoraBase(double valorHoraBase) {
        if (valorHoraBase > 200) System.out.println("A hora base não pode exceder 200");
        else this.valorHoraBase = valorHoraBase;
    }

    public void defineCargo(String cargo) {
        this.cargo = cargo;
    }

    public void defineDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void calculaHE(int quantidade) {
        if (quantidade > 40) System.out.println("Um funcionário não pode exceder 40 horas extras");
        else recebimentoHoraExtra = quantidade * 2 * valorHoraBase;
    }


    public void calculaSalarioFinal() {
        recebimentoFinal = (
            horasTrabalhadasOficiais * valorHoraBase +
            recebimentoHoraExtra
        );
    }  
}