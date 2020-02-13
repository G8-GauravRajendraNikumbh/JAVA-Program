import java.io.DataInputStream;
import java.io.IOException;
class EvenOdd
{
	public static void main(String args[])
	{
		int no=0;
		System.out.println(" program for checking number is odd or even");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the any No =");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		if(no==0)
			System.out.println("No is Null");
		else if(no%2!=1)
			System.out.println("No is Positive");
		else
			System.out.println("NO is ODD");
	}
}
