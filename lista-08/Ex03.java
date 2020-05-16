class Ex03 {
    static void selection(byte[] numbers) {
        byte lowest;
        byte stage;
        byte index;

        for (byte min = 0; min < numbers.length; min++) {
            lowest = numbers[min];
            index = -1;

            for (byte i = min; i < numbers.length; i++) {
                if (lowest > numbers[i]) {
                    lowest = numbers[i];
                    index = i;
                }
            }

            if (index > -1) {
                stage = numbers[min];
                numbers[min] = numbers[index];
                numbers[index] = stage;                
            }
        }
    }

    static void insertion(byte[] numbers) {
        byte stage;

        for (byte i = 1, j = 1; i < numbers.length; i++, j = i) {
            stage = numbers[j];

            while (j > 0 && numbers[j-1] > stage) {
                numbers[j] = numbers[--j];
            }

            numbers[j] = stage;
        }
    }

    static byte[] random(byte quant) {
        byte[] numbers = new byte[quant];

        for (byte i = 0; i < quant; i++) {
            numbers[i] = (byte) (Math.random() * 128);
        }

        return numbers;
    }

    public static void main(String[] args) {
        byte[] numbersA = random((byte) 5);
        byte[] numbersB = random((byte) 5);

        System.out.println("Selection | Unsorted:");
        for (byte num : numbersA) {
            System.out.println(num);
        }

        selection(numbersA);

        System.out.println("Selection | Sorted:");
        for (byte num : numbersA) {
            System.out.println(num);
        }

        System.out.println("\n\nInsertion | Unsorted:");
        for (byte num : numbersB) {
            System.out.println(num);
        }

        insertion(numbersB);

        System.out.println("Insertion | Sorted:");
        for (byte num : numbersB) {
            System.out.println(num);
        }
    }
}