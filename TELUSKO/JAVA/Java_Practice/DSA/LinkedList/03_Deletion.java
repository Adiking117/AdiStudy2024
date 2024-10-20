package DSA.LinkedList;

class Node {
    int data;
    Node next;
}

class Deletion {
    Node first = null;

    public void create(int[] A, int n) {
        Node t, last;
        first = new Node();
        first.data = A[0];
        first.next = null;
        last = first;

        for (int i = 1; i < n; i++) {
            t = new Node();
            t.data = A[i];
            t.next = null;
            last.next = t;
            last = t;
        }
    }

    public void display(Node p) {
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public int delet(Node p, int pos) {
        int x = -1;
        if (pos == 0) {
            p = first;
            x = p.data;
            first = p.next;
        } else {
            p = first;
            Node q = null;
            for (int i = 1; i < pos; i++) {
                q = p;
                p = p.next;
            }
            if (p != null) {
                q.next = p.next;
                x = p.data;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Deletion list = new Deletion();
        int[] A = {1, 2, 5, 6, 9};

        list.create(A, 5);

        System.out.println("The element deleted is " + list.delet(list.first, 4));

        list.display(list.first);
    }
}

