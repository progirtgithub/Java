import java.util.Scanner;

public class Swaptwonumber {
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int  b=sc.nextInt();
        System.out.println("before the swaping");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping "+a+" "+b);
        
    }
}
