import java.io.*;
import java.net.*;

class ServerDemo
{  
	public static void main(String[] args)
	{  
		try{
            // build soket server
            ServerSocket server = new ServerSocket(1111);
            Socket socket = server.accept();

            // get data stream from getIpStream
            DataInputStream data = new DataInputStream(socket.getInputStream());

            // decode UTF format
            String str = (String) data.readUTF();

            // print msg
            System.out.println("Message = "+ str);

            server.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
	}
}
