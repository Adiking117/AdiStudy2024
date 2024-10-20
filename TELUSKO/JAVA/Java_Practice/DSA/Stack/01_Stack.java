class Node {
    int data;
    Node next;
}

class StackDemo {
    private Node top;
    private int i, j;

    public StackDemo() {
        top = null;
    }

    public void push(int x) {
        Node t = new Node();
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            t.data = x;
            t.next = top;
            top = t;
        }
    }

    public int pop() {
        int x = -1;
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            Node p = top;
            x = p.data;
            top = top.next;
        }
        return x;
    }

    public int peek(int pos) {
        Node p = top;
        for (i = 0; i < pos - 1 && p != null; i++) {
            p = p.next;
        }
        return p != null ? p.data : -1;
    }

    public int stackTop() {
        return top != null ? top.data : -1;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        Node t = new Node();
        boolean r = t != null;
        return r;
    }

    public void display() {
        Node p = top;
        System.out.print("The elements of the stack are ");
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public int pre(char x) {
        if (x == '+' || x == '-') return 1;
        else if (x == '*' || x == '/') return 2;
        return 0;
    }

    public boolean isOperand(char x) {
        return !(x == '+' || x == '-' || x == '*' || x == '/');
    }

    public String intopo(String infix) {
        char[] post = new char[infix.length() + 1];
        i = j = 0;
        while (i < infix.length()) {
            if (isOperand(infix.charAt(i))) {
                post[j++] = infix.charAt(i++);
            } else {
                while (!isEmpty() && pre(infix.charAt(i)) <= pre((char) stackTop())) {
                    post[j++] = (char) pop();
                }
                push(infix.charAt(i++));
            }
        }
        while (!isEmpty()) {
            post[j++] = (char) pop();
        }
        post[j] = '\0';
        return new String(post).trim();
    }

    public int eval(String post) {
        for (i = 0; i < post.length(); i++) {
            if (isOperand(post.charAt(i))) {
                push(post.charAt(i) - '0');
            } else {
                int x2 = pop();
                int x1 = pop();
                int r = 0;
                switch (post.charAt(i)) {
                    case '+':
                        r = x1 + x2;
                        break;
                    case '-':
                        r = x1 - x2;
                        break;
                    case '*':
                        r = x1 * x2;
                        break;
                    case '/':
                        r = x1 / x2;
                        break;
                }
                push(r);
            }
        }
        return pop();
    }

    public static void main(String[] args) {
        StackDemo adi = new StackDemo();
        // adi.push(8);
        // adi.push(6);
        // adi.push(7);
        // adi.push(3);
        // adi.display();
        // System.out.println("The top of the stack is " + adi.stackTop());
        // System.out.println("The stack value at given index is " + adi.peek(2));
        // System.out.println("The popped element is " + adi.pop());
        // System.out.println("The popped element is " + adi.pop());
        // adi.display();
        // adi.push(20);
        // adi.display();

        String infix = "1+2*3-4/2";
        String postfix = adi.intopo(infix);
        System.out.println("The postfix expression is " + postfix);
        System.out.println("The value of the above expression is " + adi.eval(postfix));
    }
}
