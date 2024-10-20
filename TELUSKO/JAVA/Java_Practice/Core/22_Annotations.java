class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }
}
class B extends A {
    @Override // annotation
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show");
    }
}


class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
