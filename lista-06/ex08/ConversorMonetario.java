package ex08;

public class ConversorMonetario {
    static float taxaDolarReal;
    static float taxaRealDolar;

    static void defineTaxaCompra(float taxa) {
        taxaRealDolar = taxa;
    }

    static void defineTaxaVenda(float taxa) {
        taxaDolarReal = taxa;
    }

    static void imprimeTaxas() {
        System.out.format(
            "Dolar / Real:\t%f\nReal / Dolar:\t%f\n",
            taxaDolarReal, taxaRealDolar
        );
    }

    static float vendeDólar(float quantia) {
        if (testaTaxa(taxaDolarReal)) {
            return quantia * taxaDolarReal;
        }

        return -1;
    }

    static float compraDólar(float quantia) {
        if (testaTaxa(taxaRealDolar)) {
            return quantia * taxaRealDolar;
        }

        return -1;
    }

    static boolean testaTaxa(float taxa) {
        return taxa > 0;
    }
}