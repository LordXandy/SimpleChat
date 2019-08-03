package server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	Socket client;
	ServerSocket server;
	DataInputStream in;
	
	public Server() {
		try { 
            server = new ServerSocket(9999); 
            System.out.println("Server started"); 
  
            System.out.println("Waiting for a client ..."); 
  
            client = server.accept(); 
            System.out.println("Client accepted"); 
  
            // takes input from the client socket 
            in = new DataInputStream( 
                new BufferedInputStream(client.getInputStream())); 
  
            String line = ""; 
  
            // reads message from client until "Over" is sent 
            while (!line.equals("Over")) 
            { 
                try
                { 
                    line = in.readUTF(); 
                    System.out.println(line); 
  
                } 
                catch(IOException i) 
                { 
                    System.out.println(i); 
                } 
            } 
            System.out.println("Closing connection"); 
  
            // close connection 
            client.close();
            in.close(); 
            
        } catch(IOException i) {
        	System.out.println(i); 
        }
    } 
}
