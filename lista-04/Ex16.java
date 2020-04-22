class Ex16 {
    static byte[] lowestAndGreatest(byte a, byte b, byte c) {
        byte lowest = 0;
        byte greatest = 0;

        if (a <= b && a <= c) lowest = a; else
        if (b <= a && b <= c) lowest = b; else
        if (c <= a && c <= b) lowest = c;

        if (a >= b && a >= c) greatest = a; else
        if (b >= a && b >= c) greatest = b; else
        if (c >= a && c >= b) greatest = c;

        byte[] lowestAndGreatest = {greatest, lowest};
        return lowestAndGreatest;
    }

    public static void main(String[] args) {
        byte[] numbers = lowestAndGreatest((byte) 88, (byte) 1, (byte) 54);

        for (byte i : numbers) {
            System.out.print(i);   
        }
    }
}