import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int  ch=sc.next().charAt(0);
        char ch=sc.next().charAt(0);
        if(ch=='i'||ch=='a'||ch=='e'||ch=='o'||ch=='u')
        System.out.println("it is A VOWEL");
        else
        System.out.println("it is a constant");
    }
    
}
