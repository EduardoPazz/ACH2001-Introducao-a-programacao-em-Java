
public class Ex11 {

    static byte soma;
    public static void main(String[] args) {
        soma = 0;
        for (int k = 4; k <= 9; k++) soma += k; // 0; 4; 9; 15; 22; 30; 39
        System.out.println(soma); // 39
    }
}