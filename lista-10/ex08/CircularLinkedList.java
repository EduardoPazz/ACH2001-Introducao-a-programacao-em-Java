package ex08;
import ex01.Node;

class CircularLinkedList {
    int length = 0;
    Node head;

    private void closeCircuit() {
        Node last = this.head;
        for (int i = 0; i < this.length; i++) {
            last = last.pointer;
        }
        last.pointer = this.head;
    }

    private void openCircuit() {
        Node last = this.head;
        for (int i = 0; i < this.length - 1; i++) {
            last = last.pointer;
        }
        last.pointer = null;
    }    

    void insert(Object atr, int index) {
        Node stage = new Node(atr);
        if (index == 0) {
            stage.pointer = this.head;
            this.head = stage;
            this.closeCircuit();
        } else {
            Node jumper = this.head;
            for (int i = 0; i < index - 1; i++) {
                jumper = jumper.pointer;
            }
            stage.pointer = jumper.pointer;
            jumper.pointer = stage;
            if (index == length) this.closeCircuit();
        }
        this.length++;
    }

    void print() {
        Node jumper = this.head;
        for (int i = 0; i < this.length; i++) {
            System.out.println(jumper.atr);
            jumper = jumper.pointer;
        }
    }

    void reverse() throws NullPointerException {
        openCircuit();
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
            this.head.pointer = this.head;
            this.head = j;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert("oone", 0);
        cll.insert("two", 1);
        cll.insert("trhee", 2);

        cll.print();
        System.out.println();
        cll.reverse();
        cll.print();
    }   
}