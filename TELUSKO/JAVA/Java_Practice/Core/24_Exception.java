class AdiExceptions extends Exception{
    public AdiExceptions(String string){
        super(string);
    }
}

class Exceptions{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int nums[] = new int[5];

        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException();
            if(j==1)
                throw new AdiExceptions("Adi alr re baba");
            
            System.out.println(nums[2]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("This is defailt value");
        }
        catch(AdiExceptions e)
        {
            System.out.println("Adi exception handled");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds");
        }
        catch(Exception e)
        {
            System.out.println("Something wnet wrog");
        }        // parent exception catch block must be always below

        finally
        {
            // irrespective of exception
            // close the resource
            System.out.println("Bye");
        }


        System.out.println(j);

        System.out.println("Bye");
    }
}
