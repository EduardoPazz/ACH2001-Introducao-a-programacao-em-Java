class Ex03 {

    static long[] somaComplexo(long[] complexoA, long[] complexoB) {
        long[] soma = {complexoA[0] + complexoB[0], complexoA[1] + complexoB[1]};
        return soma;
    }

    static long[] subtracaoComplexo(long[] complexoA, long[] complexoB) {
        long[] subtracao = {complexoA[0] - complexoB[0], complexoA[1] - complexoB[1]};
        return subtracao;
    }

    static long[] produtoComplexo(long[] complexoA, long[] complexoB) {
        long[] produto = {complexoA[0] * complexoB[0] - complexoA[1] * complexoB[1], complexoA[0] * complexoB[1] + complexoB[0] * complexoA[1]};
        return produto;        
    }

    static long[] quocienteComplexo(long[] complexoDividendo, long[] complexoDivisor) {
        long[] quociente = {(complexoDividendo[0] * complexoDivisor[0] - complexoDividendo[1] * complexoDivisor[1]) / (complexoDivisor[0] * complexoDivisor[0] + complexoDivisor[1] * complexoDivisor[1]), (complexoDividendo[0] * complexoDivisor[1] + complexoDividendo[1] * complexoDivisor[0]) / (complexoDivisor[0] * complexoDivisor[0] + complexoDivisor[1] * complexoDivisor[1])};
        return quociente;
    }

    static long[] conjugadoComplexo(long[] complexo) {
        long[] conjugado = {complexo[0], -complexo[1]};
        return conjugado;
    }

    static double moduloComplexo(long[] complexo) {
        return Math.sqrt(complexo[0] * complexo[0] + complexo[1] * complexo[1]);
    }

    public static void main(String[] args) {
        long[] complexoA = {1, 2};
        long[] complexoB = {3, 4};

        System.out.format("%d + (%d)i\n", somaComplexo(complexoA, complexoB)[0], somaComplexo(complexoA, complexoB)[1]);
        System.out.format("%d + (%d)i\n", subtracaoComplexo(complexoA, complexoB)[0], subtracaoComplexo(complexoA, complexoB)[1]);
        System.out.format("%d + (%d)i\n", produtoComplexo(complexoA, complexoB)[0], produtoComplexo(complexoA, complexoB)[1]);
        System.out.format("%d + (%d)i\n", quocienteComplexo(complexoA, complexoB)[0], quocienteComplexo(complexoA, complexoB)[1]);
        System.out.format("%d + (%d)i\n", conjugadoComplexo(complexoA)[0], conjugadoComplexo(complexoA)[1]);

    
        System.out.println(moduloComplexo(complexoA));
    }
}