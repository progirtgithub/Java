import java.util.Scanner;

public class CheckTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float celsius=sc.nextInt();
        
         float fahrenit=((celsius*9)/5)+32;
        System.out.println("it is a fahrenit" +fahrenit);

    }
    
}
