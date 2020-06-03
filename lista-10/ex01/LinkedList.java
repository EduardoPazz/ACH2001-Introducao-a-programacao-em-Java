package ex01;

public class LinkedList {
    private int length = 0;
    public Node head;

    public int length() {
        return this.length;
    }

    public void insert(Object atr, int index) {
        Node stage = new Node(atr);
        if (index == 0) {
            stage.pointer = this.head;
            this.head = stage;
        } else {
            Node jumper = this.head;
            for (int i = 0; i < index - 1; i++) {
                jumper = jumper.pointer;
            }
            stage.pointer = jumper.pointer;
            jumper.pointer = stage;
        }
        this.length++;
    }

    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.pointer;
        } else {
            Node jumper = this.head;
            for (int i = 0; i < index - 1; i++) {
                jumper = jumper.pointer;
            }
            jumper.pointer = jumper.pointer.pointer;
        }
        this.length--;
        System.gc();
    }

    public void close() {
        this.head = null;
        this.length = 0;
        System.gc();
    }

    public void print() {
        for (
            Node jumper = this.head;
            jumper != null;
            jumper = jumper.pointer
        ) {System.out.println(jumper.atr);}
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert("three", 0);
        ll.insert(0, 0);
        ll.insert(0.458, 0);

        ll.print();
    }
}