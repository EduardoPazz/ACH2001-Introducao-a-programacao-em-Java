class Ex08 {
    static float floater(String floatString) {
        return Float.valueOf(floatString);
    }

    public static void main(String[] args) {
        String floatString = "44";

        System.out.println(floater(floatString));
    }
}