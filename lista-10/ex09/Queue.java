package ex09;
import ex01.Node;

class Queue {
    int length;
    Node head;

    void insert(Object atr) {
        Node stage = new Node(atr);
        stage.pointer = this.head;
        this.head = stage;
    }

    Object remove() {
        Object atr = null;
        if (this.length < 2) {
            atr = this.head.atr;
            this.head = null;
        } else {
            Node out = this.head;
            while (out.pointer.pointer != null) out = out.pointer;
            atr = out.pointer.atr
            out.pointer = null;
        }
        return atr;
    }

    void empty() {
        this.head = null;
    }

    public static void main(String[] args) {
        
    }
}