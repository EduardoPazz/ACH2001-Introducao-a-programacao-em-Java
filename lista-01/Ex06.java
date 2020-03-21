class Ex06 {
    static double tax = 5.06; // tax on 21/03/2020

    static double exchange(double real) {return real/tax;}
    public static void main(String[] args) {
        System.out.format("%.2f", exchange(5.06));
    }
}