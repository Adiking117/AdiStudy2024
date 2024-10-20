class Human{

    // when something is declared as private it 
    // can be used only within class

    // instance variables
    // private int age;
    // private String name;

    // variables can be used by its subclasses
    protected int age;
    protected String name;

    // within parameters are local variables
    // public void setAge(int age,Human obj){
    //     obj.age = age;
    // }
    public void setAge(int age){
        this.age = age;
        // this -> refers to current object 
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}

class Employee extends Human{
    private int id;

    public void setid(int id){
        this.id = id;
    }

    public void getid(){
        System.out.println("The id is "+id+age);
    }
}

class Clerk extends Employee {
    public void disp(){
        System.out.println(age);
    }
}

class encapsulation {
    public static void main(String[] args) {
        Clerk adi = new Clerk();
        // adi.age = 11;
        // adi.name = "Aditya";
        
        adi.setAge(50);
        adi.setName("Adiking");

        adi.setid(65);
        // adi.getid();
        adi.disp();

        // System.out.println(adi.getAge()+" "+adi.getName());

    }
    
}
