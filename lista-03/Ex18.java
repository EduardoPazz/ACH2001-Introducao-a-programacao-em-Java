import java.util.Scanner;

public class Ex18 {

    static Scanner input = new Scanner(System.in);

    static byte numCasas(long num) {
        if (num / 10 < 1) return 1; // atesta se o número só possui uma casa 

        long casaRef = 10; // este número servirá de referencial: "Referencial de casas"
        byte numCasa = 2; // este número atesterá a quantidade de casas de num. Se num passar no primeiro if, quer dizer que ele possui 2 casas ao menos

        while (true) { // este algoritmo só sai do loop quando o return for alcançado
            /* 
                O teste sempre vai levar em consideração se um número dividido por x casas decimais é menor que 10. Por exemplo, o inteiro 156 (3 casas) dividido por 100 (3 casas) dá 1, que é menor que 10 retorna o resultado de 3 casas. Porém, o 156 teve que passar pelo teste de 2 casas antes (dividir por 10, no caso) e ter falhado, pois 156/10 não é menor que 10.
            */
            if (num / casaRef < 10) return numCasa;
            casaRef *= 10; 
            numCasa++;
        }
    }

    static boolean ePalindromo(long num, byte numCasa) {
        if (numCasa == 1) return true; // se o número tem uma casa só, assumirei que ele é um palíndromo

        boolean ePalindromo = true; // assumirei durante todo o método que num é um palíndromo, e os testes tentarão provar o contrário

        long casaRef = (long) Math.pow(10, numCasa - 1);// aqui eu precisei do casaRef novamente. Como já possuo o numCasa, basta utilizar-me da potência de base 10
        long casaRefAuxiliar = 10; 

        // as análises são numeradas de acordo com a ordem dos algarismos extremos. Ou seja, testar o primeiro e último algarismo faz parte da primeira análise; testar o segundo e penúltimo algarismo faz parte da segunda análise, e assim em diante.
        if (numCasa % 2 == 0) {
            if (num/casaRef != num%casaRefAuxiliar) { // a primeira análise é sempre diferente
                ePalindromo = false;
                return ePalindromo;
            }

            for (int numAnalise = 2; numAnalise <= (numCasa - 2)/2 + 1; numAnalise++) {
                casaRef /= 10;
                casaRefAuxiliar *= 10; 
                
                if ( ((num/casaRef) % 10) != ((num%casaRefAuxiliar) / (casaRefAuxiliar / 10)) ) {
                    ePalindromo = false;
                    break;
                }
            }
            /* 
                par: todos os pares extremos de números precisam ser analisados

                numCasa = 2 + (n-1)2
                (n-1)2 = numCasa - 2
                n-1 = (numCasa - 2)/2
                n = (numCasa - 2)/2 + 1

                2 casas * 33 | 1 análise 

                33/10 == 33%10

                4 casas * 3223 | 2 análises

                3223/1000 == 3223%10
                (3223/100) % 10 == (3223%100) / 10

                6 casas * 421124 | 3 análises

                421124/100000 == 421124%10
                (421124/10000) % 10 == (421124%100) / 10
                (421124/1000) % 10 == (421124%1000) / 100
            */               
        } else {
            if (num/casaRef != num%casaRefAuxiliar) { // a primeira análise é sempre diferente
                ePalindromo = false;
                return ePalindromo;
            }

            for (int numAnalise = 2; numAnalise <= (numCasa - 3)/2 + 1; numAnalise++) {
                casaRef /= 10;
                casaRefAuxiliar *= 10; 
                
                if ( ((num/casaRef) % 10) != ((num%casaRefAuxiliar) / (casaRefAuxiliar / 10)) ) {
                    ePalindromo = false;
                    break;
                }
            }
            /* 
                impar: o número central não precisa ser considerado

                numCasa = 3 + (n-1)2
                (n-1)2 = numCasa - 3
                n-1 = (numCasa - 3)/2
                n = (numCasa - 3)/2 + 1

                3 casas * 323 | 1 análise 

                323/100 == 323%10

                5 casas * 33233 | 2 análises

                33233/10000 == 33233%10
                (33233/1000) % 10 == (33233%100) / 10

                7 casas * 4332334 | 3 análises

                4332334/1000000 == 4332334%10
                (4332334/100000) % 10 == (4332334%100) / 10
                (4332334/10000) % 10 == (4332334%1000) / 100


                par: todos os pares extremos de números precisam ser analisados
            */            
        }
        return ePalindromo;
    }



    public static void main(String[] args) {
        System.out.print("Informe o número : ");
        long num = input.nextLong();

        System.out.format("%d é palíndromo? %b.", num, ePalindromo( num, numCasas(num) ));
    }
}    