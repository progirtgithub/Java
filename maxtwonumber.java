import java.util.Scanner;
class maxtwonumber{

  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number:");
    int n1=sc.nextInt();
     System.out.println("enter the second number:");
    int n2=sc.nextInt();
   if(n1>n2) 
	System.out.println("max number is:"+n1);
     else if(n1<n2)
    System.out.println("max number is:"+n2);
  else
   System.out.println("both are same:"+n1);
}
}

    
    