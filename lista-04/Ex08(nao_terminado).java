/* Neste programa, 0 não será um valor válido para armazenar em arrays */

class Ex08 {

    static byte[] removeDuplicado(byte[] conjunto) {
        byte[] whitelist = new byte[conjunto.length];
        byte newLength = 0;
        for (byte i = 0; i < conjunto.length; i++) {
            jIterator: for (byte j = 0; j < conjunto.length; j++) {
                if (i != j && conjunto[i] == conjunto[j]) {
                    for (byte elemento : whitelist) {
                        if (elemento == conjunto[i]) {
                            continue jIterator;
                        }
                    }
                    whitelist[newLength++] = conjunto[i];
                }
            }
        }

        newLength = 0;

        for (byte elemento : whitelist) if (elemento != 0) newLength++;

        byte[] novoConjunto = new byte[newLength];

        byte i = 0;

        for (byte elemento : whitelist) if (elemento != 0) {
            novoConjunto[i] = elemento;
            i++;
        }

        return novoConjunto;
    }

    static byte[] une(byte[] conjuntoA, byte[] conjuntoB) {

        byte[] conjuntoAUB = new byte[conjuntoA.length + conjuntoB.length];

        byte i = 0;

        for (byte elemento : conjuntoA) {
            conjuntoAUB[i] = elemento;
            i++;
        }

        for (byte elemento : conjuntoB) {
            conjuntoAUB[i] = elemento;
            i++;
        }

        return removeDuplicado(conjuntoAUB);
    }



    public static void main(String[] args) {
        byte[] conjuntoA = {2};
        byte[] conjuntoB = {5};


        byte[] novoConjunto = une(conjuntoA, conjuntoB);
        
        for (byte elemento : novoConjunto) System.out.println(elemento);
        
    }
}