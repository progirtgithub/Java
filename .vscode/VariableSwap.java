import java.util.Scanner;

public class VariableSwap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("value of a"+a);
        System.out.println("value of b" +b);
    }
    
}
