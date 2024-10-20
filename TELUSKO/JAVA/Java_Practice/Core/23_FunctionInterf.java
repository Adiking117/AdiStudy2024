
// only one method
// SAM -> Single Abstart method
@FunctionalInterface
interface A {
    void show(int i);
    //void run();
}

@FunctionalInterface
interface B {
    int add(int a,int b);
}

// class B implements A {
//     public void show(int i){
//         System.out.println("In show"+i);
//     }
// }

class FunctionInterf {
    public static void main(String[] args) {
        // A obj = new A()
        // {
        //     public void show(int i){
        //         System.out.println("In show "+ i);
        //     }
        // };
        // obj.show(5);

        // lamda expression works with only functional interfaces
        // A obj = (i) -> 
        // {
        //     System.out.println("In show"+i);
        // };

        // can be written w/o block if one single line
        // dont need to specify data type in paramter
        // as it is already in innterface
        A obj = i -> System.out.println("In show "+ i);
        obj.show(5);

        B obj1 = (a,b) -> a+b;
        System.out.println(obj1.add(7,8));
    }
}
