class Calculator 
{
    int a;

    public int add(int num1,int num2)
    {
        int r = num1 + num2;
        //System.out.println("In Addituon");
        return r;
    }
}


class Hello 
{
    public static void main(String a[])
    {
        int num = 5;
        int bum = 9;

        // Calculator calc; // creating reference
        Calculator calc = new Calculator(); // creating object 

        int result = calc.add(num,bum);
        //int result = num + bum;
        System.out.println(result);

    }
}

