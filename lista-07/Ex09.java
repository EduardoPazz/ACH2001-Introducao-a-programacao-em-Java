import java.util.Scanner;

class Ex09 {
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

    static String tester(String three) {
        char[] charArray = three.toCharArray();       

        if (
            charArray[0] < charArray[1] &&
            charArray[1] < charArray[2]
        ) return "crescent"; else if (
            charArray[0] > charArray[1] &&
            charArray[1] > charArray[2]
        ) return "descending"; else if (
            charArray[0] == charArray[1] &&
            charArray[1] == charArray[2]
        ) return "totally identical between each other"; else {
            return "a disorder";
        }
    }

    public static void main(String[] args) {
        System.out.print("How many three-chars-groups are going to be? ");
        byte rowsQuant = input.nextByte();
        
        if (rowsQuant > 0) {
            String three;

            for (byte counter = 1; counter <= rowsQuant; counter++) {
                System.out.print(
                    "Provide the " + order(counter) + " three-chars string: "
                );

                three = input.next();

                System.out.println(
                    '\n' + three + " is " + tester(three) + '\n'
                );
            }            
        }
    }
}