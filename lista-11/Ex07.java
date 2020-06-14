import ex06.*;

class Ex07 {
    static void testaFunc() {
        FuncionarioComum func = new FuncionarioComum(
            "José Bezerra",
            "Empacotador",
            "18/04/7894",
            201
        );

        func.calculaHE(40);
        func.calculaSalarioFinal();

        System.out.println(
            "Nome: " + func.nome +
            "\n Cargo: " + func.cargo +
            "\n Data Admissão: " + func.dataAdmissao +
            "\n Valor Hora Base: " + func.valorHoraBase +
            "\n Horas Trabalhadas: " + func.horasTrabalhadasOficiais +
            "\n Valor Hora Extra: " + func.recebimentoHoraExtra +
            "\n Recebimento Final " + func.recebimentoFinal
        );        
    }

    static void testaGerente() {
        Gerente ger = new Gerente(
            "Zé Maria",
            50
        );

        ger.calculaHE(5);

        ger.calculaSalarioFinal();

        System.out.println(
            "Nome: " + ger.nome +
            "\n Horas Trabalhadas: " + ger.horasTrabalhadasOficiais +
            "\n Valor Hora Base: " + ger.valorHoraBase +
            "\n Valor Hora Extra: " + ger.recebimentoHoraExtra +
            "\n Recebimento Final " + ger.recebimentoFinal
        );
    }

    public static void main(String[] args) {
        testaGerente();
        testaFunc();

        String mystring = "oi";

        System.out.println(mystring.charAt(0) + mystring.charAt(1) > 200);
    }
}