// Make a server socket and passing port number
            ServerSocket ss = new ServerSocket(3333);
            // Socket to receive the connection from the client
            Socket s = ss.accept();
    
            // Making input stream to receive data 
            DataInputStream din = new DataInputStream(s.getInputStream());
    
            // Output stream to send data from server to client
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));