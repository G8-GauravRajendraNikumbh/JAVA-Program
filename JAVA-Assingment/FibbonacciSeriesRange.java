import java.io.DataInputStream;
import java.io.IOException;
class  FibbonacciSeriesRange
{
	public static void main(String args[])
	{
		int a=0,b=1,end=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for printing fibbonacci series in Given Range");
		try
		{
			System.out.print("Enter the Ending number = ");
			end=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		int sum=a+b;
		System.out.println(a);
		System.out.println(b);

			while(a<=end)
			{
				b=a;
				a=sum;
				sum=a+b;
				if(sum<=end)
					System.out.println(sum);

			}
	}
}

/*
O/P

Enter the Ending number = 10
0
1
1
2
3
5
8

*/