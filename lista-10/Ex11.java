import java.util.Scanner;
import ex01.Node;

class Ex11 {
    static Scanner input = new Scanner(System.in);

    Node head;

    void insert(int num) {
        Node stage = new Node(num);
        if (this.head == null || num <= Integer.valueOf(this.head.atr)) {
            stage.pointer = this.head;
            this.head = stage;
        } else {
            Node jumper = this.head;
            while (jumper.pointer != null) {
                if (num < Integer.valueOf(this.head.atr)) {
                    stage.pointer = jumper.pointer;
                    jumper.pointer = stage;
                    return;
                }
                jumper = jumper.pointer;
            }
            jumper.pointer = stage;
        }
    }

    void print() {
        for (
            Node jumper = this.head;
            jumper != null;
            jumper = jumper.pointer
        ) System.out.println(jumper.atr);
    }

    public static void main(String[] args) {
        Ex11 ll = new Ex11();
        boolean stop;
        do {
            System.out.print("Insert a integer: ");
            ll.insert(input.nextInt());
            System.out.print("Wanna stop [Y/N] ?");
            if (input.next().charAt(0) == 'Y') stop = true;
        } while (!stop);
        ll.print();
    }
}