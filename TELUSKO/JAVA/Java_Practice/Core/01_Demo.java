class Computer{
    public void playMusic(){
        System.out.println(("Music playing"));
    }

    public String getMePen(int cost){
        if(cost<10){
            return "Fuckoff";
        }
        return "Pen";
    }
}

class Calculator 
{
    int num= 8; // instance variable


    public int add(int num1,int num2)
    {
        System.out.println(num);
        return num1+num2;
    }

    public int add(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    }

    public int add(double num1, int num2){
        return (int)num1+num2;
    }
}

class Demo {
    public static void main(String a[]) {

        //int data = 20; // local variable

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(2);
        System.out.println(str);

        Calculator obj1 = new Calculator();
        int r = obj1.add(4,9);
        System.out.println(r);
        int p = obj1.add(4,8,7);
        System.out.println(p);

    }
}
