import java.io.DataInputStream;
import java.io.IOException;
class PositiveNegative
{
	public static void main(String args[])
	{
		int no=0;
		System.out.println("program for checking number is +ve or -ve ");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter any NO = ");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		if(no == 0)
			System.out.println("Null No");

		else if(no>0)
		{
			System.out.println("Given Number is Positive ");
		}
		else
		{
			System.out.println("Given Number is Negative ");
		}
	}
}