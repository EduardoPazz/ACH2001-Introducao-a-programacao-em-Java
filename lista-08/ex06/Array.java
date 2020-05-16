package ex06;

class Array {
    static byte[] array;

    static void activateArray(byte[] array) {
        Array.array = new byte[array.length];

        for (byte i = 0; i < array.length; i++) {
            Array.array[i] = array[i];
        }
    }

    static byte repetitions(byte test) {
        byte counter = 0;

        for (byte number : array) {
            if (number == test) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        try {
            for (byte num : array) {
                System.out.print(num + ' ');
            }            
        } catch (NullPointerException e) {
            System.out.println("Deu erro, mermão");
        }
        

        activateArray(new byte[] {1, 2, 2, 3});

        System.out.println();
        for (byte num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n" + repetitions((byte) 4));
    }
}