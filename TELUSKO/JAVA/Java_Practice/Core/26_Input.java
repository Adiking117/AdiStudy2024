import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Input {
    public static void main(String[] args){
        System.out.println("Enter a number");
        
        // int num = System.in.read(); // gives a ascii vlaue
        // System.out.println(num);

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in); // we open a file
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();


        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println(num);
        } 
        finally{
            sc.close();
        }

        // println is a method of printstream class
        // out is object of type printstream
        // out is created in system class

        // try(Scanner sc = new Scanner(System.in)) {
        //     int num = sc.nextInt();
        //     System.out.println(num);
        // } 
        // scanner resource gets closed automatically
        // try with resources
    }
}
