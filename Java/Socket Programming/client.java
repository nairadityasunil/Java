
import java.net.*;
import java.io.*;

// For making main function
public class client{
    public static void main(String[] args){   
        try
        {
            // Socket to connect with the server
            Socket s = new Socket("localhost",3333);
            // Making input stream to receive data
            DataInputStream din = new DataInputStream(s.getInputStream());

            // Making output stream to send data to the server
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            // Creating an input stream to collect data from the user
            InputStreamReader is = new InputStreamReader(System.in);

            // Buffered reader to receive data from the user
            BufferedReader br = new BufferedReader(is);

            String server_data="", client_data="";

            while(!client_data.equals("End"))
            {
                // Reading data from the inputstream
                client_data = br.readLine();
                // Writing data into the output stream
                dout.writeUTF(client_data);
                // Clearing the output buffer
                dout.flush();

                // Displaying data received from the client
                server_data = din.readUTF();
                System.out.println("Server : "+server_data);
            }
            dout.close();
            din.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}