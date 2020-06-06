class Test {
    Object value;
    Test(int num) {
        this.value = num;
    }

    public static void main(String[] args) {
        System.out.println(new Test(5).value == 5);
    }
}