class A {
    public A(){
        super();
        // Every class in java extends from Object class
        System.out.println("In A class");
    }
    public A(int a){
        super();
        System.out.println("PArmater in A "+a);
    }
}

class B extends A {
    public B(){
        super(); // it will call default connstructor of its parent i.e A class
        // it is always there but its john cena
        System.out.println("In B class");
    }
    public B(int a){
        this();  // it will call deafult construvcotr of its own i.e B class
        // super(a); // it will call paramterized constructor of A class
        System.out.println("PArmater in B "+a);
    }
}

class ThisSuper {
    public static void main(String[] args) {
        // B obj = new B();
        // B obj = new B(5);
    }
}
