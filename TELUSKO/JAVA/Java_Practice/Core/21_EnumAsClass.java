enum Laptop{
    Macbook(2000),Windows(5000),Ubuntu(9000),XP;
    // objects of Laptop enum class
    
    private int price;

    private Laptop(){
        price = 900;
    }

    private Laptop(int price) {
        this.price = price;
    }

    // we are using provate cosntructore because the 
    // objects are defined in same class

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class EnumAsClass{
    public static void main(String[] args) {
        for(Laptop lap: Laptop.values()){
            System.out.println(lap+ " "+ lap.getPrice());
        }
    }
}