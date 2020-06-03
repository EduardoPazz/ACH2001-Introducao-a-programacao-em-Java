import ex01.*;

class Ex03 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        for (int i = 0; i < args.length; i++) {
            ll.insert(Integer.parseInt(args[i]), i);
        }

        Ex02.b(ll, 5);

        ll.print();
    }
}