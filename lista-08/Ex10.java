import java.util.Scanner;

class Ex10 {
    static Scanner input = new Scanner(System.in);

    static byte[] biDimensionalBinarySearch(byte[][] matrix, byte number) {

        byte minI = 0;
        byte maxI = (byte) (matrix.length - 1);
        byte middleI;

        byte minJ = 0;
        byte maxJ = (byte) (matrix[0].length - 1);
        byte middleJ;

        while (minI <= maxI) {
            middleI = (byte) ((minI + maxI) / 2);            

            if (number < matrix[middleI][0]) {
                maxI = (byte) (middleI - 1);
            } else if (number > matrix[middleI][maxJ]) {
                minI = (byte) (middleI + 1);
            } else {
                // If it gets here, it means that we found the right row
                while (minJ <= maxJ) {
                    middleJ = (byte) ((maxJ + minJ) / 2);

                    if (number < matrix[middleI][middleJ]) {
                        maxJ = (byte) (middleJ - 1);
                    } else if (number > matrix[middleI][middleJ]) {
                        minJ = (byte) (middleJ + 1);
                    } else if (number == matrix[middleI][middleJ]) {
                        // If it gets here, it means that we found the element
                        return new byte[] {
                            middleI, middleJ
                        };
                    }
                }
                /*
                    If it gets here, the number doesn't exist,
                    and both "while"s will be left;
                */ 
            }
        }

        return new byte[] {-1, -1};
    }

    public static void main(String[] args) {
        byte[][] matrix = {
            {-55, -50, -42, -33, -30},
            {-30, -21, -4, 0, 0},
            {3, 5, 18, 33, 34},
            {39, 45, 59, 87, 122},
        };

        System.out.print("Number test: ");
        byte[] coordenates = biDimensionalBinarySearch(matrix, input.nextByte());

        System.out.format(
            "\nIts coordenates: (%d, %d)\n", 
            coordenates[0], coordenates[1]
        );
    }
}