// abstract class A {
//     public abstract void show();
//     public abstract void config();
// }

interface A{
    int age = 44;
    String name= "Aditya";

    void show();
    void config();
}
// interface is not a classs
// by default ecery variable in interface is final and static
// by default every method in interface is public nad abstact

interface X {
    void run();
}

interface Y extends X{

}

// class to class -> extends
// class to interface -> implements
// interface to interface -> extends

class B implements A,Y{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("Run");
    }
}

class interfaces {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age+" "+A.name);
        // A.age = 09; // cant change it

        // obj.run(); // A doesnt know about interface X method
        B obj1 = new B();
        obj1.show();
        obj1.run();

        // Y obj2 = new B();
        // obj2.show(); // Y does not have show method
        
    }   
}
