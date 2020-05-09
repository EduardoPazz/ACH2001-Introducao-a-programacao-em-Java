class Ex06 {
    static String newString(String string) {
        return new String(string);
    }

    public static void main(String[] args) {
        String string1 = "example";
        String string2 = newString(string1);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string1 == string2); // It should return false
    }
}