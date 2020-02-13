import java.io.DataInputStream;
import java.io.IOException;
class NumberDemo2
{
	public static void main(String args[])
	{
		int no=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println(" program for printing 10 to 1 numbers");
		try
		{
			System.out.print("Enter any number");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(no>=1)
		{
			System.out.println(no);
			no--;
		}
	}
}