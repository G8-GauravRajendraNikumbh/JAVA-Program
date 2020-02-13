import java.io.DataInputStream;
import java.io.IOException;
class SquareCube
{
	public static void main(String args[])
	{
		int fno=1;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Program for Square and Cube Given Number");
		try
		{
			System.out.print("Enter the any NO=");
			fno=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{
		}
		System.out.println("Square of "+ fno + " = "+(fno*fno));
		System.out.println("Cube of "+ fno + " = "+(fno*fno*fno));
	}
}