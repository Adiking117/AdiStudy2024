class A{
    int marks;

    public void show(){
        System.out.println("In show");
    }

    class B {
        public void config(){
            System.out.println("In config of B");
        }
    }

    static class C {
        public void config(){
            System.out.println("In config of C");
        }
    }

}

class inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        // for static classes no need to make obejcts
        A.C obj2 = new A.C();
        obj2.config();

    }
}
