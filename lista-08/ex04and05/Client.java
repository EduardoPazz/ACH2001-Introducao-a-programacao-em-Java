package ex04and05;

class Client {
    short id;
    String name;
    float salary;

    Client(String name) {
        id = (short) (Math.random() * 32767 + 1);
        this.name = name;
        salary = (float) (Math.random() * 90001 + 10000);
    }
}