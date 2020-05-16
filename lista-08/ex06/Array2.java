package ex06;

class Array2 {
    static byte[] array;

    static void activateArray(byte[] array) {
        byte stage;

        for (byte i = 1, j = 1; i < array.length; i++, j = i) {
            stage = array[j];

            while (j > 0 && array[j-1] > stage) {
                array[j] = array[--j];
            }

            array[j] = stage;
        }

        Array.array = new byte[array.length];

        for (byte i = 0; i < array.length; i++) {
            Array.array[i] = array[i];
        }
    }

    static byte repetitions(byte test) {
        byte counter = 0;

        for (byte number : Array.array) {
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
        

        activateArray(new byte[] {3, 2, 1, -1, 5});

        System.out.println();
        for (byte num : Array.array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n" + repetitions((byte) 1));
    }
}