class Stringbuilder {
    public static void main(String[] args) {

        //StringBuilder str = new StringBuilder();
        //System.out.println(str.capacity());
        StringBuilder str1 = new StringBuilder("Aditya");
        //System.out.println(str1.capacity());
        str1.append("king");

        // mutable
        StringBuffer sb = new StringBuffer("aditya");
        //System.out.println(sb.capacity());
        //System.out.println(sb.length());
        sb.append("king");
        System.out.println(sb);

    }
    
}
