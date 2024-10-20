class A {
    public void show(){
        System.out.println("In Outer class show");
    }
}
// class B extends A {
//     public void show(){
//         System.out.println("In B show");
//     }
// }

abstract class C{
    public abstract void config();
}

class AnonyInner {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("In Inner class show");
            }
        };
        obj.show();


        C obj1 = new C()
        {
            public void config(){
                System.out.println("In Inner class show");
            }
        };
        obj1.config();
        // obj1 -> object of annonymous inner class 
    }
}
