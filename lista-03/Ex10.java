public class Ex10 {
    public static void main(String[] args) {
        // 14 caracteres
        // 4 linhas


        /* 
            linha 1: 2 asteriscos e 12 pontos | 4º e 11º caractere
            linha 2: 6 asteriscos e 8 pontos | 3-5º e 10-12º caractere
            linha 3: 10 asteriscos e 4 pontos | 2-6º e 9-13º caractere
            linha 4: 14 asteriscos e 0 pontos | 1-7º e 8-14º caractere
        */
        char character;
        
        // como os dois focos de asteriscos partem da posição 4 e 11 de cada linha, eu criei essas "âncoras"
        byte anchor4 = 4;
        byte anchor11 = 11;

        // farão o teste sobre qual caractere deve ser usado
        boolean testAnchor4;
        boolean testAnchor11;

        for (byte row = 0; row <= 3; row++) { // este for é para cada linha
            for (byte counter = 1; counter <= 14; counter++) { // este for é pra cada caractere, seja ponto ou asterisco
                testAnchor4 = (counter >= anchor4 - row) && (counter <= anchor4 + row);
                testAnchor11 = (counter >= anchor11 - row) && (counter <= anchor11 + row);
                
                character = testAnchor4 || testAnchor11 ? '*' : '.';
                System.out.print(character);
            }
            System.out.println();
        }
    }
}