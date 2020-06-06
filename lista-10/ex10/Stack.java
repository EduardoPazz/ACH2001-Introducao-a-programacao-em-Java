package ex10;
import ex01.Node;

class Stack {
    int length;
    Node head;

    void insert(Object atr) {
        Node stage = new Node(atr);
        if (length == 0) this.head = stage;
        else {
            Node jumper = this.head;
            while (jumper.pointer != null) jumper = jumper.pointer;
            jumper.pointer = stage;            
        }
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