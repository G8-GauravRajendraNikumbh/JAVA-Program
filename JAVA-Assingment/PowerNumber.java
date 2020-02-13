import java.io.DataInputStream;
import java.io.IOException;
class PowerNumber
{
	public static void main(String args[])
	{
		int no=0,power=0,ans=1;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for accepting no and its power from keyboard and print the answer as no raise to power");
		try
		{
			System.out.print("Enter the any number = ");
			no=Integer.parseInt(d.readLine());
			System.out.print("Enter the power of number = ");
			power=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(power!=0)
		{
			ans=ans * no;
			power--;
		}
		System.out.println(ans);

	}
}