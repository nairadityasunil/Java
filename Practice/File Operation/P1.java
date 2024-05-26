// Byte file operation

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class P1
{
    public static void main(String[] args) {


        // Writing data into file
        try {
            FileOutputStream fout = new FileOutputStream("byte.txt");
            String s="Hello World1";
            byte b[] = s.getBytes();
            // fout.write(b);
            for(int i =0; i<b.length;i++)
            {
                fout.write(b[i]);
            }
            fout.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        try {
            FileInputStream fin = new FileInputStream("byte.txt");
            int n;
            while((n = fin.read())!=-1)
            {
                // System.out.print((char)n);
                System.out.print((char)n);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
