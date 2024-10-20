final class A{
    public final void show(){
        System.out.println("In A show");
    }
}
// class B extends A{
//     public void show(){
//         System.out.println("In A show");
//     }
// }

// when a class is declared final , it cant be inherited 
// whne a method is declared final it cant be overridden

class finale {
    public static void main(String[] args) {
        int num = 9;
        num = 59;
        System.out.println(num);
        // possible

        final int num1= 19;
        System.out.println(num1);
        // num1 = 98 ; // assignment to constant variable

    }
}
