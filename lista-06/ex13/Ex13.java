package ex13;

class Ex13 {
    public static void main(String[] args) {
        IntervaloDeTempo relogio = new IntervaloDeTempo(System.currentTimeMillis() / 1000);

        System.out.println(relogio.representacao);
    }    
}