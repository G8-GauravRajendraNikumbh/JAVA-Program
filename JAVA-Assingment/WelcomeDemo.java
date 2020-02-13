import java.io.DataInputStream;
import java.io.IOException;
class WelcomeDemo
{
	public static void main(String args[])
	{
		int no=1;

		DataInputStream d = new DataInputStream(System.in);
		System.out.println(" program for printing welcome 5 times");

		try
		{
			System.out.println("Enter any number");
			no = Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(1<=no)
		{
			System.out.println("Welcome");
			no--;
		}
	}
}
