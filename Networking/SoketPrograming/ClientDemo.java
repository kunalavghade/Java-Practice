import java.io.*;
import java.net.*;

class ClientDemo
{  
	public static void main(String[] args)
	{  
        try
        {
            // build socket toward server
		    Socket socket = new Socket("localhost",1111);

            // object for sending data stream
            DataOutputStream data = new DataOutputStream(socket.getOutputStream());

            // encode data in UTF
            data.writeUTF("Hello from Client !");
            data.flush();
            data.close();

            socket.close();

        }
        catch(Exception e){}
	}
}
