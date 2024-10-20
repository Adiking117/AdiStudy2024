import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Queue {
    private int front, rear, size;
    private TreeNode[] Q;

    public Queue(int size) {
        this.size = size;
        this.front = this.rear = -1;
        this.Q = new TreeNode[this.size];
    }

    public void enqueue(TreeNode x) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            Q[++rear] = x;
        }
    }

    public TreeNode dequeue() {
        TreeNode x = null;
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
}

class Stack {
    private class StackNode {
        TreeNode data;
        StackNode next;
    }

    private StackNode top;

    public Stack() {
        top = null;
    }

    public void push(TreeNode x) {
        StackNode t = new StackNode();
        t.data = x;
        t.next = top;
        top = t;
    }

    public TreeNode pop() {
        TreeNode x = null;
        if (top == null) {
            System.out.println("Stack underflow");
        } else {
            x = top.data;
            top = top.next;
        }
        return x;
    }

    public TreeNode stackTop() {
        return top != null ? top.data : null;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public void create() {
        try (Scanner scanner = new Scanner(System.in)) {
            Queue q = new Queue(100);

            System.out.print("Enter the root node: ");
            int x = scanner.nextInt();

            root = new TreeNode(x);
            q.enqueue(root);

            while (!q.isEmpty()) {
                TreeNode p = q.dequeue();
                System.out.print("Enter left child of " + p.data + ": ");
                x = scanner.nextInt();
                if (x != -1) {
                    TreeNode t = new TreeNode(x);
                    p.left = t;
                    q.enqueue(t);
                }
                System.out.print("Enter right child of " + p.data + ": ");
                x = scanner.nextInt();
                if (x != -1) {
                    TreeNode t = new TreeNode(x);
                    p.right = t;
                    q.enqueue(t);
                }
            }
        }
    }

    public void preorder(TreeNode t) {
        if (t != null) {
            System.out.print(t.data + " ");
            preorder(t.left);
            preorder(t.right);
        }
    }

    public void inorder(TreeNode t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.data + " ");
            inorder(t.right);
        }
    }

    public void postorder(TreeNode t) {
        if (t != null) {
            postorder(t.left);
            postorder(t.right);
            System.out.print(t.data + " ");
        }
    }

    public void levelorder(TreeNode p) {
        Queue q = new Queue(100);
        System.out.print(p.data + " ");
        q.enqueue(p);
        while (!q.isEmpty()) {
            p = q.dequeue();
            if (p.left != null) {
                System.out.print(p.left.data + " ");
                q.enqueue(p.left);
            }
            if (p.right != null) {
                System.out.print(p.right.data + " ");
                q.enqueue(p.right);
            }
        }
    }

    public int count(TreeNode p) {
        if (p != null) {
            int x = count(p.left);
            int y = count(p.right);
            if ((p.left == null && p.right != null) || (p.left != null && p.right == null)) {
                return x + y + 1;
            } else {
                return x + y;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Tree adi = new Tree();
        adi.create();
        System.out.println("The preorder traversal is ");
        adi.preorder(adi.root);
        System.out.println();
        System.out.println("The inorder traversal is ");
        adi.inorder(adi.root);
        System.out.println();
        System.out.println("The postorder traversal is ");
        adi.postorder(adi.root);
        System.out.println();
        System.out.println("The levelorder traversal is ");
        adi.levelorder(adi.root);
        System.out.println();
        System.out.println("The count of nodes with exactly one child is " + adi.count(adi.root));
    }
}
