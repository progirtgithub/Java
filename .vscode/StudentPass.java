import javax.lang.model.util.ElementScanner14;

public class StudentPass {
    public static void main(String[] args) {
        int marks=80;
        if(marks>70)
        {
            System.out.println("Distinction");
            System.out.println("Congrulation");
        }
        else if(marks>35)
        {
            System.out.println("pass");
        }
        else 
        {
            System.out.println("fail");
            System.out.println("BETTER LUCK NEXT TIME");
        }

        }
    }

    

