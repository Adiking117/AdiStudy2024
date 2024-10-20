abstract class Car{

    // drive method is only declared here
    // only abstract classes can have abstarct methods

    // abstarct methods
    public abstract void drive();
    public abstract void fly();

    // concrete method
    public void playMusic(){
        System.out.println("Playing music...");
    }
}

abstract class BMW extends Car{

    // if a class is inherited from abstarct class it
    // must define all abstarct methods of its base class

    // if this class cannot define all the abstartc methods 
    // of its base class it must be decalred as abstarct too

    public void drive(){
        System.out.println("Driving...");
    }
}

class UpdatedBMW extends BMW{
    public void fly(){
        System.out.println("Flying ....");
    }
}

class Abstract {
    public static void main(String[] args) {
        // cant make objects of abstarct classes
        Car obj = new UpdatedBMW();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }   
}
