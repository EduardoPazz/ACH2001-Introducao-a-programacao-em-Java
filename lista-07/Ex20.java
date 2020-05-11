import java.util.Scanner;

class Ex20 {
    static Scanner input = new Scanner(System.in);

    static boolean isNumber(byte code) {
        return 48 <= code && code <= 57;
    }      

    static String numberPointer(String string) {
        char[] arr = new char[string.length()];

        for (byte i = 0; i < arr.length; i++) {
            if (isNumber((byte) string.charAt(i))) {
               arr[i] = '^';
            } else arr[i] = ' ';
        }

        String pointer = new String(arr);

        return (string + '\n' + pointer);
    }



    public static void main(String[] args) {
        System.out.print(
            "Provide a phrase to the numbers " + 
            "to be sinalized: "
        );
        String string = input.nextLine();

        System.out.println(numberPointer(string));
    }
}