import ex06.*;

// Esse código é declaradamente uma monstruosidade

public class ArrayFunc {
    static String[] nomesAleatorios = {
        "Gelslag Lipes",
        "Tamoso Plian",
        "Ploxozis Tyuma",
        "Luana Gixio",
        "Veanaon Xofar",
        "Dudugia Caer",
        "Erzie Suigi",
        "Inrie Cuewo",
        "Mieteuhu Roiur",
        "Putyiol Kibau"
    }

    static String[] cargosAleatorios = {
        "Recepcionista",
        "Professor(a)",
        "Empacotador(a)",
        "Assistente Administrativo",
        "Vendedor(a)",
        "Técnico(a)",
        "Estagiário(a)",
        "Contador(a)",
        "Pesquisador(a)",
        "Degustador(a)"
    }

    static String dataAleatoria() {
        int dia = (int) Math.floor(Math.random() * 31) + 1;
        int mes = (int) Math.floor(Math.random() * 12) + 1;
        int ano = (int) Math.floor(Math.random() * 121) + 1900;

        return dia + '/' + mes + '/' + ano;
    }

    static int valorHoraBaseAleatorio() {
        return (int) Math.floor(Math.random() * 200) + 1;
    }

    public static FuncionarioComum[] cria10Func() {
        FuncionarioComum[] arrayFunc = new FuncionarioComum[10];

        for (byte i = 0; i < 10; i++) {
            arrayFunc[i] = new FuncionarioComum (
                nomesAleatorios[i], // não tão aleatório assim
                cargosAleatorios[i],
                dataAleatoria(),
                valorHoraBaseAleatorio()
            );
        }
    }

    static void imprimeOrdenado(FuncionarioComum[] arrayFunc, byte criterio) {
        /*
         *  1: Hora-Base
         *  2: Nome
         *  3: Data de Admissão
        */
        switch (criterio) {
            case 1: ordenaHora(arrayFunc);
                break;
            case 2: ordenaNome(arrayFunc);
                break;
            case 3: ordenaData(arrayFunc);
                break;
            default: System.out.println("Forneça um critério de ordenação válido.");
        }
        for (FuncionarioComum func : arrayFunc) {
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
    }

    static void ordenaHora(FuncionarioComum[] arrayFunc) {
        FuncionarioComum stage;

        for (byte i = 1, j = 1; i < arrayFunc.length; i++, j = i) {
            stage = array[i];

            while (
                j > 0 && 
                arrayFunc[j-1].valorHoraBase > stage.valorHoraBase
            ) {
                array[j] = array[--j];
            }

            array[j] = stage;
        }
    }

    static void ordenaData(FuncionarioComum[] arrayFunc) {
        FuncionarioComum stage;

        for (byte i = 1, j = 1; i < arrayFunc.length; i++, j = i) {
            stage = arrayFunc[i];

            while (
                j > 0 && 
                test(
                    arrayFunc[j-1].dataAdmissao,
                    stage.dataAdmissao
                )
            ) {
                arrayFunc[j] = arrayFunc[--j];
            }

            arrayFunc[j] = stage;
        }
    }

    static boolean test(String arrayFunc, String stage) {
        if (arrayFunc.charAt(6) + arrayFunc.charAt(7) + arrayFunc.charAt(8) + arrayFunc.charAt(9) > stage.charAt(6) + stage.charAt(7) + stage.charAt(8) + stage.charAt(9)) return true;
        
        // Aqui, apenas se o ano à esquerda for menor ou igual ao ano teste        
        if (arrayFunc.charAt(6) + arrayFunc.charAt(7) + arrayFunc.charAt(8) + arrayFunc.charAt(9) != stage.charAt(6) + stage.charAt(7) + stage.charAt(8) + stage.charAt(9)) return false;

        // Aqui, apenas se o ano for igual ao ano teste
        if (arrayFunc.charAt(6) + arrayFunc.charAt(7) + arrayFunc.charAt(8) + arrayFunc.charAt(9) != stage.charAt(6) + stage.charAt(7) + stage.charAt(8) + stage.charAt(9)) return false;
    }

    static void ordenaData(FuncionarioComum[] arrayFunc) {}

    static void ordenaNome(FuncionarioComum[] arrayFunc) {}
}