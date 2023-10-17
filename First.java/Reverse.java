public class Reverse {
    public static void main(String[] args){
        int n =12345;
        int Reverse=0;
        while(n!=0){
            int remainder=n%10;
            Reverse=Reverse*10+remainder;
            n=n/10;
        }
        System.out.println("the reverse of given number"+Reverse);
    }
    
}
