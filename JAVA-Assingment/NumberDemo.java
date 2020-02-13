import java.io.DataInputStream;
import java.io.IOException;
class NumberDemo
{
	public static void main(String args[])
	{
		int no=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for printing 1 to 10 numbers");
		try
		{
			System.out.print("Enter any number");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(no<=10)
		{

			System.out.println(no);
			no++;
		}

	}
}