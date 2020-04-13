public class Ex05 {

    static void forMethod() {
        byte sum = 0;
        for (byte num = 0; num <= 20; num += 2) sum += num;
        System.out.print(sum);
    }

    static void arithmaticProgressionMethod() {
        System.out.print((0 + 20) * 11 / 2);
    }
    public static void main(String[] args) {
        forMethod();
        arithmaticProgressionMethod();
    }
}