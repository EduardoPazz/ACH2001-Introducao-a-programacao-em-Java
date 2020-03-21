class Ex05 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 8;
        int d = a * (b + c * 3) - 7; // 80
        int e = a - b - c; // -10
        System.out.println(a+" "+b+" "+c+" "+d+" "+e); // 3 5 8 80 -10
        a = a + 1; // 4
        b = (4 * a + 1) / 10; // 1
        c = (4 * a + 1) % 10; // 7
        System.out.println(a+" "+b+" "+c+" "+d+" "+e); // 4 1 7 80 -10

    }
}