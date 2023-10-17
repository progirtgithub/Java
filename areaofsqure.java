import java.util.Scanner;
public class areaofsqure{

    public static void main(String[]args)
{  
    System.out.println("enter the value of a");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    a=a*a;
    System.out.println("area of squre "+a);
}
}