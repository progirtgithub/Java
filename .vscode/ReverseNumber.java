import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int Reverse=0;
        for(int i=n;i>=1;i--){
            int remainder=n%10;
            Reverse=Reverse*10+remainder;
            n=n/10;
        }
        System.out.println("reverse of number " +Reverse);
    }
    
}
