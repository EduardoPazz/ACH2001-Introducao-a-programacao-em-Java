package ex08;

public class TestaConversorMonetario {
    public static void main(String[] args) {
        ConversorMonetario.defineTaxaCompra(-2);
        ConversorMonetario.defineTaxaVenda(1.5f);
        
        System.out.println(ConversorMonetario.compraDólar(500f));
    }
}