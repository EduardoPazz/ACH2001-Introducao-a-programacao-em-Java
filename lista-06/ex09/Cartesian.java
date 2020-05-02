package ex09;

class Cartesian {
    static void quadrant(float x, float y) {
        if (y == 0 || x == 0) {
            System.out.println("None");
            return;
        }

        boolean positiveX = x > 0;
        boolean positiveY = y > 0;

        if (positiveX) {
            if (positiveY) {
                System.out.println("Quadrant 1");
            } else {
                System.out.println("Quadrant 4");
            }
        } else {
            if (positiveY) {
                System.out.println("Quadrant 2");
            } else {
                System.out.println("Quadrant 3");
            }
        }
    }

    public static void main(String[] args) {
        Cartesian.quadrant(7, 0);
    }
}