import java.net.*;
import java.io.*;

public class server{
    public static void main(String[] args) {
        try {
            
            // Creating a server with a specified port number
            ServerSocket ss = new ServerSocket(3333);

            // Accept the connection request coming from the client side
            Socket s = ss.accept();

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
                // Displaying the data coming from the client side
                client_data = din.readUTF();
                System.out.println("Client : "+client_data);

                server_data = br.readLine();
                dout.writeUTF(server_data);
                dout.flush();
            }
            dout.close();
            din.close();
            s.close();
            ss.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}