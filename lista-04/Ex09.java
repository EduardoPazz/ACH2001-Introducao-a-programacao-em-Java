class Ex09 {
    static byte[] indicesPares(byte[] array) {
        byte length = 0;

        for (byte elemento : array) if (elemento % 2 == 0) length++;

        byte[] novoArray = new byte[length];

        for (byte i = 0, j = 0; i < array.length; i++) if (array[i] % 2 == 0) novoArray[j++] = i;

        return novoArray;
    }

    public static void main(String[] args) {
        byte[] array = {2, 3, 2, 3, 3, 2, 2};
        
        byte[] arrayPares = indicesPares(array);

        for (byte element : arrayPares) System.out.println(element);
    }
}