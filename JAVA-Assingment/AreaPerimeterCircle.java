import java.io.DataInputStream;
import java.io.IOException;
class AreaPerimeterCircle
{
	public static void main(String args[])
	{
		int r=1;

		System.out.println("program for calculating Area and Perimeter of the circle.");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the Redius=");
			r=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{
		}
		System.out.println(" Area of Circle = " + (3.14 * r * r));
		System.out.println(" Perimeter of Circle = " + (2 * 3.14 * r));
	}
}