import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try 
        {
            // Make Connection
            Socket s = new Socket("localhost", 3333);

            // Making input stream to receive data
            DataInputStream din = new DataInputStream(s.getInputStream());

            // Output stream to send data from server to client
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String client_str="", server_str="";

            while (!client_str.equals("End"))
            {
                client_str = br.readLine();
                dout.writeUTF(client_str);
                dout.flush(); 

                // store data coming from client
                server_str = din.readUTF();
                System.out.println("Server : " + server_str);

                // Sending Data To Client
            }

            dout.close();
            s.close();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
            
    }

}