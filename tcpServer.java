import java.net.InetAddress;
import java.io.*;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.net.UnknownHostException;

public class tcpServer
{	public static void main(String[] args)
	{	try
		{
			System.out.println("Listening...");
			ServerSocket s = new ServerSocket(7778);
			Socket so = s.accept();
			System.out.println("Connection Established");
			
			BufferedReader in = new BufferedReader(new 
InputStreamReader(so.getInputStream()));

			PrintWriter out = new 
PrintWriter(so.getOutputStream(),true);

			int a = Integer.parseInt(in.readLine());
			//System.Out.Println(a);

			//char result = a.charAt(11);
			//char result2 = a charAt(12);
			//System.out.println(result);
			//System.out.println(result2);
			
			if(a<= 11)
			{
				out.println("Good Morning!");
			}
			else if(a>= 13&& a<=19)
			{	
				out.println("Good Evening!");
			}
			else if(a>= 20)
			{
				out.println("Good Night!");
			}
			else
			{
				out.println("Good Afternoon!");
			}

		so.close();
}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
				
