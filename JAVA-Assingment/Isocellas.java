import java.io.DataInputStream;
import java.io.IOException;
class Isocellas
{
	public static void main(String args[])
	{
		int x=0,y=0,z=0;
		System.out.println(" program for accepting three sides of triangle check whether this triangle is isocellas, scalene, equilateral or right angle triangle");
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
		if(x==y==z)
			System.out.println("Triangle is Equilateral Trianngle");

		else if((x==y) && (x==z) && (y==z))
			System.out.println("Triangle is Isoscale Triangle");

		else
		{
			System.out.println("Triangle is scalene Triangle");
		}
	}
}