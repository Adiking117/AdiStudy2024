class A {
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A {
    public void show2(){
        System.out.println("In B show");
    }
}


class Casting{
    public static void main(String[] args) {
        A obj = (A) new B();
        // A obj2 = new B();  // implicit upcasting
        // obj2.show1();
        obj.show1();
        // Casting from Derived class to base class (upcasting)
        // obj.show2(); // Reference is of A

        B obj1 = (B) obj;
        obj1.show2();
        obj1.show1();
        // casting from base to derived class (downcasting)
    }
}