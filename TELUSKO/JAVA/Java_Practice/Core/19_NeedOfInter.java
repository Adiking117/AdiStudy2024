// abstract class Computer{
//     public abstract void code();
// }

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding , compile , run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding , compile , run fast mode");
    }
}
class Developer{
    public void devApp(Computer lap){
        // System.out.println("Coding");
        lap.code();
    }
}

class NeedOfInter {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer adi = new Developer();

        adi.devApp(desk); // it will call method of desktop class
        adi.devApp(lap); // it will call method of laptop class
    }
}
