import java.io.*;
import java.net.*;

class DatagramSocketClient
{  
	public static void main(String[] args) throws Exception
    {
        int port = Integer.parseInt(args[0]);
        DatagramSocket socket = new DatagramSocket(port);

        byte[] buff = new byte[1024];

        DatagramPacket data = new DatagramPacket(buff,1024);

        socket.receive(data);

        String msg = new String(data.getData(),0,data.getLength());

        System.out.println(msg);
        
        socket.close();
	}
}
