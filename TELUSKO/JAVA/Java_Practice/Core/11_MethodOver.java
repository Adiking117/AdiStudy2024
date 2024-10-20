class A {
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class B extends A {
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}

class MethodOver {
    public static void main(String[] args) {
        B obj = new B();
        int r = obj.add(4,9);
        System.out.println(r);
    }
}
