import java.io.DataInputStream;
import java.io.IOException;
class AreaPerimeterRectangel
{
	public static void main(String args[])
	{
		int l=1,b=1;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println(" program for calculating Area and Perimeter of the Rectangle.");
		try
		{
			System.out.print("Enter the Length =");
			l=Integer.parseInt(d.readLine());
			System.out.print("Enter the Breath =");
			b=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{
		}
		System.out.println("Area of Rectangle = " +(l * b));
		System.out.println("Perimeter of Rectangle = "+(2 * (l+b)));
}

}