public class cmd {
    public static void main(String[] args) {
        // int num1=Integer.parseInt(args[0]);
        // int num2=Integer.parseInt(args[1]);
        // int num=num1+num2;
        // System.out.println(num);
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum=sum+Integer.parseInt(args[i])
        }
    }
    
}
