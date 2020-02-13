import java.io.DataInputStream;
import java.io.IOException;
class Triangle
{
	public static void main(String args[])
	{
		int x=0,y=0,z=0;
		System.out.println("program for accepting three numbers check whether they are angles of triangle or not");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the First Number =");
			x=Integer.parseInt(d.readLine());
			System.out.print("Enter the Second Number =");
			y=Integer.parseInt(d.readLine());
			System.out.print("Enter the Third Number =");
			z=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		int angle=x+y+z;
		if(angle==180)

			System.out.println("Angles is Triangle");
		else
			System.out.println("Angles is Not Triangle");



	}
}