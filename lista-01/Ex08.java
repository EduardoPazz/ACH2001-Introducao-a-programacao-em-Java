import java.util.Scanner;

class Ex08 {
    static Scanner input = new Scanner(System.in);

    static double delta(double a, double b, double c) {
        return Math.pow(b, 2) - 4*a*c;
    }

    static boolean deltaTest(double delta) {
        return delta >= 0; /* it tests if this delta is from a valid 2nd degree equation */
    }

    static double[] roots(double a, double b, double delta) {
        double x1 = (-b + Math.sqrt(delta)) / 2*a;
        double x2 = (-b - Math.sqrt(delta)) / 2*a;

        double roots[] = {x1, x2};
        return roots;
    }

    public static void main(String[] args) {
        System.out.println("Provide the A, B and C coeficients of your 2nd degree equation, in this order:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = delta(a, b, c);
        
        if (deltaTest(delta)) {
            double roots[] = roots(a, b, delta);

            System.out.format("The roots of \"(%.0f)*x^2 + (%.0f)*x + (%.0f)\" are %.0f and %.0f", a, b, c, roots[0], roots[1]);
        } else {
            System.out.format("\"(%.0f)*x^2 + (%.0f)*x + (%.0f)\" doesn't generate valid roots 'cause its delta (%.0f) is a negative number, sorry.", a, b, c, delta);
        }
    }
}