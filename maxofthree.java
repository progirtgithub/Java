import java.util.Scanner;
class maxofthree{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the first number:");
     int n1= sc.nextInt();
	System.out.println("enter the 2nd number:");
     int n2= sc.nextInt();
	System.out.println("enter the 3rd number:");
     int n3= sc.nextInt();
     if(n1>=n2&&n1>=n3)
     System.out.println("max number is:"+n1);
     else if(n2>=n1&&n2>=n3)
     System.out.println("the mmx number is:"+n2);
     else

       System.out.println("max is:"+n3);
}
} 

 		