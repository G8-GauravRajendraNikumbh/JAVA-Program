import java.io.DataInputStream;
import java.io.IOException;
class TempretureDemo
{
	public static void main(String args[])
	{
		float fer=1F,c;
		System.out.println("program to convert temperature from farenhite to degree centigrate");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the Farenhite = ");
			fer = Float.parseFloat(d.readLine());
		}
		catch(IOException ioe)
		{}
		//c = 5.0/9.0 * (fer-32.0);
		//System.out.println("The Degree Centigrate ="+c);

		System.out.println("The Degree Centigrate = "+(5.0/9.0) * (fer-32.0));




	}
}
