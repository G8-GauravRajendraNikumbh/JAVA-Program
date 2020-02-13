import java.io.DataInputStream;
import java.io.IOException;
class FibbonacciSeriesReverse
{
	public static void main(String args[])
	{
		int fno=21,sno=34,sum=0,no=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("FibboncciSeries in Reverse order");
		try
		{
			System.out.print("Enter the no = ");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		System.out.println(sno);
		System.out.println(fno);
		while(no>2)
		{
			sum=sno-fno;
			sno=fno;
			fno=sum;
			no--;
			if(sum>=0)
				System.out.println(sum);
		}
	}

}
/*

O/P
Enter the no = 10
34
21
13
8
5
3
2
1
1
0
*/