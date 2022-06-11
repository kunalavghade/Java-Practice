import java.net.*;
import java.io.*;

class DatagramSocketServer
{  
	public static void main(String[] args) throws Exception
	{  
		String host = args[0];
        int port = Integer.parseInt(args[1]);

        DatagramSocket socket = new DatagramSocket();

        String msg = "Hello welcome to www.kunal.com";

        InetAddress ip = InetAddress.getByName(host);

        DatagramPacket data = new DatagramPacket(msg.getBytes(),msg.length(),ip,port);

        socket.send(data);
        socket.close();
	}
}
