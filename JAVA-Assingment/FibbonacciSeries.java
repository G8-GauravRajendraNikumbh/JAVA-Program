import java.io.DataInputStream;
import java.io.IOException;
class FibbonacciSeries
{
	public static void main(String args[])
	{
		int no=0,a=0,b=1,no1=0,c=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println(" program for printing fibbonacci series");
		try
		{
			System.out.print("Enter the any number");
			no=Integer.parseInt(d.readLine());
			System.out.print("Enter the number");
			no1=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		int sum=a+b;
			System.out.println(a);
			System.out.println(b);
			//System.out.println(sum);
		while(no>=3)
		{
			b=a;
			a=sum;
			sum=a+b;
			System.out.println(sum);
			no--;
		}
		//System.out.println(sum);
		//System.out.println(a);
		while(sum>=c)
		{
			c=sum-b;
			System.out.println(c);


		}
	}
}