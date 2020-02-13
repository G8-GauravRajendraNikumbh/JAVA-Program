import java.io.DataInputStream;
import java.io.IOException;
class Range
{
	public static void main(String args[])
	{
		int str=0,end=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for printing numbers between given range means starting number and ending number should be given by user ");
		try
		{
			System.out.print("Enter Starting Number = ");
			str=Integer.parseInt(d.readLine());
			System.out.print("Enter Ending Number = ");
			end=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(str<=end)
		{
			System.out.println(str);
			str++;
		}

	}
}