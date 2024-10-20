import Calci.VeryAdvCalculator;

class Calc {
    public static void main(String[] args) {
        VeryAdvCalculator obj = new VeryAdvCalculator();
        int r = obj.add(4,9);
        int s = obj.sub(7,9);
        System.out.println(r+" "+s);
    }
}