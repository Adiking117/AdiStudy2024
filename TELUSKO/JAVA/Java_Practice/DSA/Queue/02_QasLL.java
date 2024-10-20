class Node {
    int data;
    Node next;
}

class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int x) {
        Node t = new Node();
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            t.data = x;
            t.next = null;
            if (front == null) {
                front = rear = t;
            } else {
                rear.next = t;
                rear = t;
            }
        }
    }

    public int dequeue() {
        int x = -1;
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node t = front;
            x = t.data;
            front = front.next;
        }
        return x;
    }

    public void display() {
        System.out.print("The elements in queue are ");
        Node p = front;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        Node t = new Node();
        boolean r = t != null;
        return r;
    }

    public static void main(String[] args) {
        Queue adi = new Queue();
        adi.enqueue(5);
        adi.enqueue(6);
        adi.enqueue(7);
        adi.enqueue(8);
        adi.enqueue(9);
        adi.enqueue(10);

        adi.display();

        System.out.println("The element deleted is " + adi.dequeue());
        adi.display();
    }
}
