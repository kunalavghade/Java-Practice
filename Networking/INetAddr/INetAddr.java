import java.io.*;
import java.net.*;

class INetAddr
{  
    public static void main(String[] args)
    {  
        try
        {
            String url = "www.google.com";
            InetAddress ip = InetAddress.getByName(url);
            System.out.println("Hostname: "+ ip.getHostName());
            System.out.println("IP Address: "+ ip.getHostAddress());
        }
        catch(Exception e){}
    }
}
