import java.util.Scanner;
class numbertype{

   public static void main(String[]args){

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();
      if(num>0)
      System.out.println("number is positive"+num);
       else if(num<0)
      System.out.println("number is negative"+num);
      else if(num==0)
      System.out.println("number is zero"+num) ; 
      else
       System.out.println("in valid number");
}
} 
     
     