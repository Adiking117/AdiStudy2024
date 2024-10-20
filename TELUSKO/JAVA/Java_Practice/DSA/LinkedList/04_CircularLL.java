package DSA.LinkedList;

class Node {
    int data;
    Node next;
}

class CircularLinkedList {
    Node head;

    public void create(int[] A, int n) {
        Node t, last;
        head = new Node();
        head.data = A[0];
        head.next = head;
        last = head;

        for (int i = 1; i < n; i++) {
            t = new Node();
            t.data = A[i];
            t.next = last.next;
            last.next = t;
            last = t;
        }
    }

    public void display(Node p) {
        if (p == null) return;

        Node temp = p;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void insert(int pos, int x) {
        Node p = head;
        Node q = new Node();
        q.data = x;

        if (pos == 0) {
            if (head == null) {
                head = q;
                head.next = head;
            } else {
                while (p.next != head) {
                    p = p.next;
                }
                p.next = q;
                q.next = head;
                head = q;
            }
        } else {
            for (int i = 1; i < pos; i++) {
                p = p.next;
            }
            q.next = p.next;
            p.next = q;
        }
    }

    public int delet(int pos) {
        int x = -1;
        Node p = head;

        if (pos == 1) {
            while (p.next != head) {
                p = p.next;
            }
            x = head.data;
            if (p == head) {
                head = null;
            } else {
                p.next = head.next;
                head = p.next;
            }
        } else {
            for (int i = 1; i < pos - 1; i++) {
                p = p.next;
            }
            Node q = p.next;
            p.next = q.next;
            x = q.data;
        }
        return x;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        int[] A = {7};
        list.create(A, 1);

        // list.insert(0, 8);
        // System.out.println("Deleted element: " + list.delet(1));

        System.out.println("Deleted element: " + list.delet(1));
        list.display(list.head);
    }
}

