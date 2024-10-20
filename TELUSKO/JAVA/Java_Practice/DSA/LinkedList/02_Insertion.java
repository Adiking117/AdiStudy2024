package DSA.LinkedList;

class Node {
    int data;
    Node next;
}

class Insertion {
    Node first = null;

    public void create(int A[], int n) {
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

    public int count(Node p) {
        int c = 0;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }

    public void insert(Node p, int pos, int x) {
        if (pos < 0 || pos > count(p))
            return;

        Node t = new Node();
        t.data = x;

        if (pos == 0) {
            t.next = first;
            first = t;
        } else {
            p = first;
            for (int i = 1; i < pos; i++) {
                p = p.next;
            }
            if (p != null) {
                t.next = p.next;
                p.next = t;
            }
        }
    }

    public void insort(Node p, int x) {
        Node q = null;
        Node t = new Node();
        t.data = x;

        while (p != null && p.data < x) {
            q = p;
            p = p.next;
        }

        if (q == null) { // If q is null, we're inserting at the beginning
            t.next = first;
            first = t;
        } else {
            t.next = p;
            q.next = t;
        }
    }

    public static void main(String[] args) {
        Insertion list = new Insertion();
        int[] adi = {1, 2, 5, 6, 9};

        list.create(adi, 5);
        
        // list.insert(list.first, 5, 96);
        // list.insort(list.first, 4);

        list.display(list.first);
    }
}

