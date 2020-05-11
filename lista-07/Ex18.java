import java.util.Scanner;

class Ex18 {
    static Scanner input = new Scanner(System.in);

    static String order(byte order) {
        if (order < 21) {
            switch (order) {
                case 1: return "1st";
                case 2: return "2nd";
                case 3: return "3rd";
                default: return order + "th";
            }
        } else {
            switch (order % 10) {
                case 1: return order + "st";
                case 2: return order + "nd";
                case 3: return order + "rd";
                default: return order + "th";
            }            
        }
    }    

    public static void main(String[] args) {
        System.out.println(
            "Provide up to 10 differents numbers!\n" +
            "Enter -1 to stop at any time.\n" +
            "Attention! Numbers beyond 10th will be ignored.\n"
        );

        float[] numbers = new float[10];
        float num;
        byte i = 1;

        do {
            
            System.out.print(
                "Provide a number: "
            );

            try {
                num = input.nextFloat();

                if (num == -1f) break;

                numbers[i - (byte) 1] = num;

                i++;
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(
                    "Sorry, you've reached the limit. " + 
                    "Enter -1 to end up the inputs."
                );
            }
        } while (true);


        for (i -= 2; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}