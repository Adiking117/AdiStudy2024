package DSA.LinkedList;

class Node {
    int data;
    Node next;
}

class LinkedListCreation {
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

    public int sum(Node p) {
        int s = 0;
        while (p != null) {
            s = s + p.data;
            p = p.next;
        }
        return s;
    }

    public int max(Node p) {
        int m = Integer.MIN_VALUE;
        while (p != null) {
            if (p.data > m)
                m = p.data;
            p = p.next;
        }
        return m;
    }

    public Node ls(Node p, int key) {
        Node q = null;
        while (p != null) {
            if (p.data == key) {
                if (q != null) {
                    q.next = p.next;
                    p.next = first;
                    first = p;
                }
                return first;
            }
            q = p;
            p = p.next;
        }
        return null;
    }


    public void remdup(Node p) {
        Node q;
        p = first;
        if (p != null) {
            q = p.next;
            while (q != null) {
                if (p.data == q.data) {
                    p.next = q.next;
                } else {
                    p = q;
                }
                q = q.next;
            }
        }
    }

    public void reverse(Node p) {
        Node q = null, r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        first = q;
    }


    public static void main(String[] args) {
        LinkedListCreation list = new LinkedListCreation();
        int[] adi = {3, 5, 91, 10, 14, 2, 34};

        list.create(adi, 7);
        list.display(list.first);

        System.out.println("The length is " + list.count(list.first));
        System.out.println("The sum is " + list.sum(list.first));
        System.out.println("The maximum element is " + list.max(list.first));

        Node temp;
        temp = list.ls(list.first, 10);
        temp = list.ls(list.first, 14);
        if (temp != null)
            System.out.println("Key is found " + temp.data);
        else
            System.out.println("Key not found");

        // list.remdup(list.first);
        // list.reverse(list.first);

        list.display(list.first);
    }
}

