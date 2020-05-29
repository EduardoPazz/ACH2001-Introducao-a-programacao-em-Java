class A {
    static private byte counter;
    A() {
        counter++;
    }

    static byte getCounter() {
        return counter;
    }
}

class B extends A {
    float y;
}

class Ex02 {
    public static void main(String[] args) {
        B newb = new B();
        System.out.println(newb.y);
    }
}