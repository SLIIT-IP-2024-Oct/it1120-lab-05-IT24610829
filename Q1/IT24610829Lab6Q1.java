import java.util.Scanner;

public class IT24610829Lab6Q1{
       public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         
        double square;
        double square_root;
        

        System.out.println("Enter no:");
        int x = input.nextInt();


        square = Math.pow(x,2);
        square_root = Math.sqrt(x);
        System.out.println("square :"+square);
        System.out.println("square root :"+square_root);

    }

}
         