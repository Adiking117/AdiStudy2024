package DSA.LinkedList;
class Node {
    Node prev;
    int data;
    Node next;
}

class DoublyLinkedList {
    Node first = null;

    public void create(int[] A, int n) {
        Node t, last;
        first = new Node();
        first.data = A[0];
        first.prev = null;
        first.next = null;
        last = first;

        for (int i = 1; i < n; i++) {
            t = new Node();
            t.data = A[i];
            t.prev = last;
            t.next = last.next;
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

    public void insert(int pos, int x) {
        Node p = first;
        Node q = new Node();
        q.data = x;

        if (pos == 0) {
            if (first == null) {
                first = q;
                q.prev = q.next = null;
            } else {
                q.next = first;
                q.prev = null;
                first.prev = q;
                first = q;
            }
        } else {
            for (int i = 0; i < pos - 1; i++) {
                p = p.next;
            }
            q.prev = p;
            if (p.next != null) {
                q.next = p.next;
                p.next.prev = q;
            } else {
                q.next = null;
            }
            p.next = q;
        }
    }

    public int delete(int pos) {
        Node p = first;
        int x = -1;

        if (pos == 1) {
            if (first.next == null) {
                x = first.data;
                first = null;
            } else {
                p = first;
                first = first.next;
                first.prev = null;
                x = p.data;
            }
        } else {
            for (int i = 0; i < pos - 1; i++) {
                p = p.next;
            }
            p.prev.next = p.next;
            if (p.next != null) {
                p.next.prev = p.prev;
            }
            x = p.data;
        }
        return x;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        int[] A = {7, 2, 5, 6, 8};
        list.create(A, 5);

        // list.insert(3, 4);

        System.out.println("Deleted element: " + list.delete(3));
        list.display(list.first);
    }
}
