import java.util.*;
import java.net.*;

class URLbasic
{  
	public static void main(String[] args)
	{  
		try{
            URL url = new URL("http://codepractice.in/");

            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Host Name : "+ url.getHost());
            System.out.println("Port Number : "+ url.getPort());
            System.out.println("File Name : "+ url.getFile());
        }
        catch(Exception e)
        {}
	}
}
