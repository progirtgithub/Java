import java.util.Scanner;

 public class Areaoftriangle{
   
    public static void main(String[]args){

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of base");
      int b= sc.nextInt();
      System.out.println("enter the value of height");
      int h= sc.nextInt();
      int A= b*h/2;
       System.out.println(" the area of triangle is "+A);
}
}
      