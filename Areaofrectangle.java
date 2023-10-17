import java.util.Scanner;
public class Areaofrectangle{

    public static void main(String[]args){

       Scanner sc= new Scanner(System.in);
       System.out.println("enter the length");
       int l= sc.nextInt();
       System.out.println("enter the width");
       int w= sc.nextInt();
       int a= l*w;
       System.out.println("area of rectangle "+a);
}
}
        