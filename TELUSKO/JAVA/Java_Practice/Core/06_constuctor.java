class Human{

    private int age;
    private String name;

    public Human(){
        age = 24;
        name = "Pranav";
        //System.out.println("in constructor");
    }

    public Human(int age,String name){
        // this -> refers to instance varibale
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }

}

class constuctor {
    public static void main(String[] args) {

        new Human(); // anonymous object

        Human adi = new Human(18,"Adiking");
        Human pani = new Human();
        // every time we create object a aconstructor is called

        // adi.setAge(50);
        // adi.setName("Adiking");

        System.out.println(adi.getAge()+" "+adi.getName());
        System.out.println(pani.getAge()+" "+pani.getName());

    }
    
}
