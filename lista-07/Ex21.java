import java.util.Scanner;

class Ex21 {
    static Scanner input = new Scanner(System.in);

    static final byte QUANT = 0;
    static final byte PRICE = 1;
    static final byte SUBTOTAL = 2;

    public static void main(String[] args) {
        System.out.print(
            "Inform how many differents products were bought: "
        );
        byte length = input.nextByte();

        float[][] bill = new float[length][3];

        System.out.println();

        for (byte i = 0; i < length; i++) {
            System.out.format(
                "Inform the quantity of the %s product: ",
                order((byte) (i + 1))
            );
            bill[i][QUANT] = input.nextByte();

            System.out.format(
                "Inform the price of the %s product: ",
                order((byte) (i + 1))
            );
            bill[i][PRICE] = input.nextFloat();

            bill[i][SUBTOTAL] = bill[i][QUANT] * bill[i][PRICE];
        }

        float total = 0;
        for (byte i = 0; i < length; i++) {
            total += bill[i][SUBTOTAL];
        }

        System.out.format(
            "\nBill:\n\n\t\tQUANT\tPRICE\tSUBTOTALS\n"
        );
        for (byte i = 0; i < length; i++) {
            System.out.format(
                "%s product:\t%.0f\t%.2f\t%.2f\n",
                order((byte) (i + 1)),
                bill[i][QUANT],
                bill[i][PRICE],
                bill[i][SUBTOTAL]
            );
        }
        System.out.format("\nTOTAL:\t\t\t\t%.2f", total);        
    }

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
}