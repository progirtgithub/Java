import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int n=sc.nextInt();
        if(n%400==0){
            System.out.println("its a leap year" + n);
            if(n%100==0){
                System.out.println("year is leap year");
                if(n%4==0){
                    System.out.println("year is leap year");
                }
                else{
                    System.out.println("Not a eap year");
                }
            }
            else{
                System.out.println("not a leap year");
            }

        }
        else
        System.out.println("not a leap year");
    }
    
}
