class Queue {
    private int front, rear, size;
    private int[] Q;

    public Queue(int size) {
        this.size = size;
        this.front = this.rear = -1;
        this.Q = new int[this.size];
    }

    public void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            Q[++rear] = x;
        }
    }

    public int dequeue() {
        int x = -1;
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            x = Q[++front];
        }
        return x;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void display() {
        System.out.print("The elements in queue are ");
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue adi = new Queue(10);
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
