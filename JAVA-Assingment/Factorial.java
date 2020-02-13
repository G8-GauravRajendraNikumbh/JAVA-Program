import java.io.DataInputStream;
import java.io.IOException;
class Factorial
{
	public static void main(String args[])
	{
		int fact=1,no=1,i=1;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for printing factorial of given number");
		try
		{
			System.out.print("Enter the number = ");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		for(i=1;i<=no;i++)
		{
			fact=fact * i;
		}
		System.out.println("Factorial is = " +fact);
	}
}