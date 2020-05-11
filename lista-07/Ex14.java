import java.util.Scanner;

class Ex14 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(
            "Provide the quantity of values to be inputed: "
        );
        byte length = input.nextByte();

        float[] arr = new float[length];

        for (byte i = 0; i < length; i++) {
            System.out.print(
                "Provide the " + Ex09.order(++i) + " number: "
            );            
            arr[--i] = input.nextFloat();
        }

        Data data = new Data(arr);

        System.out.println(
            "Among the numbers provided, the lowest is " +
            data.min + " and the greatest is " + data.max + "."
        );        
    }
}

class Data {
    float min = Float.MAX_VALUE;
    float max = Float.MIN_VALUE;
    float[] data;

    Data(float[] arr) {
        data = arr;
        minMax();
    }

    void minMax() {
        for (float num : data) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
    }
}