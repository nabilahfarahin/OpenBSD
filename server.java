import java.net.*;
import java.io.*;
import java.util.*;

public class server
{
	public static void main(String[]args)throws IOException
	{
		String text, temp;
		String as = "Assalamualaikum ? ";
		System.out.println("Connection Successful");
		ServerSocket s1 = new 
ServerSocket(52051);
		Socket s = s1.accept();
		Scanner sc = new Scanner(s.getInputStream());
		text = sc.next();

		if(text.equalsIgnoreCase(as))
			temp = "Waalaikumussalam !";
		else
			temp = "Are you Muslim ??";
	
	System.out.println("Connection Successful");
	ServerSocket ss = new ServerSocket(52051);
	Socket so = ss.accept();
	Scanner sn = new Scanner(s.getInputStream());
	text = sn.next();

	if(text.equalsIgnoreCase(as))
		temp = "Waalaikumussalam";
	else
		temp = "Are you a Muslim??";

	PrintStream pr = new PrintStream(s.getOutputStream());
	pr.println(temp);
	
	}
}
#OpenBSD
