import java.io.DataInputStream;
import java.io.IOException;
class AdditionDigit
{
	public static void main(String args[])
	{
		int no=0,ans=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for printing the reverse of given number");
		try
		{
			System.out.print("Enter the any number");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(no!=0)
		{
			no=no%10;
			ans = ans + no;
			no--;
		}
		System.out.println(ans);
	}
}