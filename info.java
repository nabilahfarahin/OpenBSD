import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.*;
import java.net.*;

public class info
{
	public static void main(String args[])
	{
	
		Socket conn = null;

		try{   

			InetAddress ipAddr = InetAddress.getLocalHost();
			System.out.println(ipAddr.getHostAddress());
			String hostname = ipAddr.getHostName();
			System.out.println("Hostname of system is: " 
+hostname);
		while(true)
		{
		
		echo("Connection received from " 
+conn.getInetAddress().getHostName() +" : " +conn.getPort());
		
		}

		   }

		catch(UnknownHostException e) {
		System.err.println("IOException");  }
		
	
	}
		public static void echo(String msg) {
		System.out.println(msg);  }
}
assignment2Server
