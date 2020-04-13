import java.util.Scanner;

public class Ex10General {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int maxRows;
        do {
            System.out.print("Informe um número de linhas (PAR): ");
            maxRows = input.nextShort();    
        } while (maxRows % 2 != 0);

        /* an = a1 + (n-1)2
            1   8
            2   10
            3   12
            4   14
            5   16
            6   18
        */

        
        int maxLength = 8 + (maxRows - 1)*2; // O maxLength será o termo da PA conforme o comentário acima.


        char character;
        
        /* 14 = a1 + (4-1)*2
           8 = a1

            14  4
            16  5
            18  6
            20  8
        */

        int minorAnchor = maxRows; // por coincidência, a posição do primeiro asterisco sempre será igual à quantidade de linhas
        int greaterAnchor = minorAnchor + 7; // deve sempre haver uma diferença de 6 pontos entre os dois asteriscos da primeira linha

        maxRows--; // O maxRows deve sofrer o decremento pois o for que o usa começa em 0, e não em 1


        // farão o teste sobre qual caractere deve ser usado
        boolean minorAnchorTest;
        boolean greaterAnchorTest;

        for (byte row = 0; row <= maxRows; row++) { // este for é para cada linha
            for (byte counter = 1; counter <= maxLength; counter++) { // este for é pra cada caractere, seja ponto ou asterisco
                minorAnchorTest = (counter >= minorAnchor - row) && (counter <= minorAnchor + row);
                greaterAnchorTest = (counter >= greaterAnchor - row) && (counter <= greaterAnchor + row);
                
                character = minorAnchorTest || greaterAnchorTest ? '*' : '.';
                System.out.print(character);
            }
            System.out.println();
        }
    }
}