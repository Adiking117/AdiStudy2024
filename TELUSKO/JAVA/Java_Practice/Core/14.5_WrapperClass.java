class WrapperClass {
    public static void main(String[] args) {
        int num = 9;
        Integer num1 = new Integer(6); 
        // num1 = new Integer(num); // storing primitive typw in object
        num1 = num; // auto-boxing

        int num2 = num1.intValue(); // storing object type in primitive
        num2 = num1; // auto-unboxing

        String str = "Adi";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);
    }
}
