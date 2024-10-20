class Mobile{
    String brand;
    int price; // object member

    static String name; // class member

    static{
        name = "Phone";
        System.out.println("Static block");
    }

    public Mobile(){
        brand = "";
        price = 2000;
        //name = "Phone";
        // every time constructior is called name will be instantiailzie
        System.out.println("Consturctr block");
    }

    public void show(){
        System.out.println(brand+ " "+ price + " "+ name);
    }

    public static void show1(Mobile o){
        System.out.println("In static method");
        // We can use static variable in static methof but not other instance variables
        System.out.println(o.brand+ " "+ o.price + " "+ name);
    }
}

class satic {
    public static void main(String[] args) {

        // if we dont make the objejct it wont call class loader
        // only class loadeer can call static block

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        //obj1.name = "Smartphone";
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 4000;
        Mobile.name = "Lund";

        // Mobile obj3 = new Mobile();
        // obj3.brand = "Realme";
        // obj3.price = 9000;
        // obj3.name = "Smartphone";

        // obj1.name = "button";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
    
}
