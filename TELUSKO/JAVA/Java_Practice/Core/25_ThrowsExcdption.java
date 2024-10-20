class A {
    public void show() throws ClassNotFoundException{
        // try {
        //     Class.forName("Ball");
        // } catch (ClassNotFoundException e) {
        
        // }
        Class.forName("Ball");
        // either we can sorround it by trycatch block or
        // use throws -> which depends on main fucntion
        // it says whoever will call this mthod must handle this exception
    }
}

class Throws{
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
        
        }
        
    }
}