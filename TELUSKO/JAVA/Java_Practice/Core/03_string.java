class string {
    public static void main(String[] args) {
        
        // String name = new String("Adiking117");
        // //name = "Adi";
        // System.out.println(name);

        // System.out.println(name.hashCode());

        // System.out.println(name.charAt(3));

        // System.out.println(name.concat("Danger"));

        String name = "ADiking";
        System.out.println(name.hashCode());
        name += "227";
        System.out.println(name.hashCode());


        String s1 = "aditya";
        String s2 = "parth";
        String s3 = "aditya";
        // in heap there will be a string constant pool
        
        System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1==s3);

    }
}
