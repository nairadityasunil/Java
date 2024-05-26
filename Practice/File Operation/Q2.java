import java.io.*;

public class Q2
{
    public static void main(String[] args) {
        try
        {
            FileInputStream fin = new FileInputStream("q2.txt");
            int n;
            while((n = fin.read())!=-1)
            {
                if((char)n == 'd' || (char)n == 'D')
                {
                    continue;
                }
                else
                {
                    System.out.print((char)n);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}