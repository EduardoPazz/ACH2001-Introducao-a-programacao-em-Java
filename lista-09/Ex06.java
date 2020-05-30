class Singleton {
    private static Singleton copy = new Singleton();

    private Singleton() {}

    public static Singleton getCopy() {return copy;}
}

class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getCopy();
        System.out.println(singleton);
    }
}