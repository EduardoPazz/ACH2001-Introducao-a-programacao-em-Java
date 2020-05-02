package ex11;

class CalculadoraDeImposto {
    TabelaDeAliquotasEDeducao tabela = new TabelaDeAliquotasEDeducao();
    Rendimentos rend = new Rendimentos();

    float imposto() {
        return (
            (
                rend.totalRendimentos -
                tabela.
                    valorADeduzir(
                    rend.totalRendimentos
                )
            ) * tabela.
                    aliquota(
                rend.totalRendimentos
            )
        );
    }

    CalculadoraDeImposto(float totalRendimentos) {
        rend.totalRendimentos = totalRendimentos;
    }
}