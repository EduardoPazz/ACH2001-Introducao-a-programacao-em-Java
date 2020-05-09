class Ex01 {
    static boolean equals(
        String string1, String string2
    ) {
        return string1.equals(string2);
    }

    public static void main(String[] args) {
        String string1 = "Example";
        String string2 = "example";

        System.out.println(
            Ex01.equals(string1, string2)
        );
    }
}