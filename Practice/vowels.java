import java.io.FileInputStream;
import java.io.FileOutputStream;

public class vowels {
    public static void main(String[] args) {
        try
        {
            // Creating a file input stream
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream f1 = new FileOutputStream("vowels.txt");
            FileOutputStream f2 = new FileOutputStream("consonents.txt");
            int n;
            char a;
            Byte b;
            while((n = fin.read())!=-1)
            {
                a = (char)n;
                if(a == 'A' || a == 'a' || a == 'e' || a == 'E' || a == 'I' || a == 'i' || a == 'o' || a == 'O' || a == 'U' || a == 'u')
                {
                    
                    f1.write(a);
                    f1.write('\n');
                }
                else
                {
                    f2.write(a);
                    f2.write('\n');

                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
