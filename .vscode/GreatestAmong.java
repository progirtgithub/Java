import java.util.Scanner;

public class GreatestAmong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println((a>b&&a>c)?"a is greater":"not greater" );
        System.out.println((b>a&&b>c)?"b is greater":"not greater" );
        System.out.println((c>a&&c>b)?"cis greater":"not greater" );
    
    
    }
    
}
