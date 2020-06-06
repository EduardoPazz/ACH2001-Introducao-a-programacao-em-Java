package ex01;

public class LinkedList {
    protected int length;
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
        ) System.out.println(jumper.atr);
    }

    public void reverse() throws NullPointerException { // Referente ao Ex04
        Node j = this.head;
        try {
            Node jj = j.pointer;
            Node jjj = jj.pointer;
            while (jj != null) {
                jj.pointer = j;
                j = jj;
                jj = jjj;
                jjj = jjj.pointer;
            }      
        } catch (NullPointerException e) {} finally {
            this.head.pointer = null;
            this.head = j;
        }
    }

    public Object get(int index) {
        if (0 <= index && index < this.length) {
            Node jumper = this.head;
            for (int i = 0; i < index; i++) {
                jumper = jumper.pointer;
            }
            return jumper.atr;            
        }
        return null;
    }

    public void concat(LinkedList append) {
        Node last = this.head;
        while (last.pointer != null) {
            last = last.pointer;
        }
        last.pointer = append.head;
    } 

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert("one", 0);
        ll.insert("two", 1);
        ll.insert("three", 2);

    
        ll.print();
    }
}