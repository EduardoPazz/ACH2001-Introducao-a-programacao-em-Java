import java.util.Scanner;

class Ex07 {
    static Scanner input = new Scanner(System.in);

    static final float g = 9.807f;

    static double freeFallTime(double h) {return Math.sqrt(2*h/g);}
    public static void main(String[] args) {
        double h;
        boolean negative;

        do { // I put the user in this loop to test a if the number provided is indeed a proper value
            System.out.print("Provide a height value (in meters)(use commas instead of dots in case of float numbers): ");
            h = input.nextDouble();
            negative = h <= 0; // it tests if the value provided is non-negative
        } while (negative);

        System.out.format("Falling from %.2f meters (without air resistance) takes %.2f seconds to hit the ground", h, freeFallTime(h));
    }
}