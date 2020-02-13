import java.io.DataInputStream;
import java.io.IOException;
class Subtraction
{
	public static void main(String args[])
	{
		int fno=0,sno=0,ans;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Subtraction of Two No");
		try
		{
			System.out.println("Enter the First NO=");
			fno=Integer.parseInt(d.readLine());
			System.out.print("Enter the Second No=");
			sno=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{
		}
		System.out.println("Subtraction ="+ans);


	}
}