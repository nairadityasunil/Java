import java.util.Scanner;

class Custom_exception extends Exception{
    Custom_exception(String str)
    {
        super(str);
    }
}

public class user_defined{
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age : ");
        age = sc.nextInt();

        try
        {
            if(age < 18)
            {
                throw new Custom_exception("Cannot Vote Age Less Than 18.");
            }
            else
            {
                System.out.println("Can Vote.");
            }
        }
        catch(Custom_exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}