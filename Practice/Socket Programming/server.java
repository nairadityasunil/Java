import java.net.*;
import java.io.*;
public class server
{
    public static void main(String[] args) 
    {
        try
        {
            // Make a server socket and passing port number
            ServerSocket ss = new ServerSocket(3333);
            // Socket to receive the connection from the client
            Socket s = ss.accept();
    
            // Making input stream to receive data 
            DataInputStream din = new DataInputStream(s.getInputStream());
    
            // Output stream to send data from server to client
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String client_str="", server_str="";

            System.out.println("Server Started");

            while (!client_str.equals("stop"))
            {
                // store data coming from client
                client_str = din.readUTF();
                System.out.println("Client : "+client_str);
                // Sending Data To Client
                server_str = br.readLine();
                dout.writeUTF(server_str);
                dout.flush();
            }
            
            din.close();
            s.close();
            ss.close();

        }   
        catch(Exception e)
        {
            System.out.println(e);
        } 

    }
}
