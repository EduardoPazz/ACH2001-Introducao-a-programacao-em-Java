import ex01.*;

class Ex02 {
    static LinkedList a(int[] arr) {
        LinkedList ll = new LinkedList();
        for (int num : arr) {
            ll.insert(num, 0);
        }
        return ll;
    }

    static void b(LinkedList ll, Object ban) {
        while (ll.head.atr.equals(ban)) {
            ll.head = ll.head.pointer;
        }

        Node jumper = ll.head;

        while (jumper.pointer != null) {
            if (jumper.pointer.atr.equals(ban)) {
                jumper.pointer = jumper.pointer.pointer; // no final, será null
            } else {
                jumper = jumper.pointer;
            }
        }
        System.gc();
    }

    static void c(LinkedList ll) {
        for (
            Node jumper = ll.head;
            jumper != null;
            jumper = jumper.pointer
        ) {System.out.println(jumper.atr);}
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 2, 2, 2, 3, 2, 2};
        LinkedList ll = a(arr);

        ll.print();

        b(ll, 2);

        ll.print();
    }
}