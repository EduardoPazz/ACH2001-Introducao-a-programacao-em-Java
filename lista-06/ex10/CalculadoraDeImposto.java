package ex10;

class CalculadoraDeImposto {
    static float imposto(float totalRendimentos) {
        return (
            (
                totalRendimentos -
                TabelaDeAliquotasEDeducao.
                    valorADeduzir(
                    totalRendimentos
                )
            ) * TabelaDeAliquotasEDeducao.
                    aliquota(
                totalRendimentos
            )
        );
    }
}