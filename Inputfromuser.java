import java.util.Scanner ;
class Inputfromuser
{
  public static void main(String[]args)
{     
      Scanner input=new Scanner(System.in);
      System.out.println("enter first number");
      int a= input.nextInt();
      System.out.println("enter second number");
      int b=input.nextInt();
      int c=a+b;
      System.out.println("the sym of two number"+c);
}
}