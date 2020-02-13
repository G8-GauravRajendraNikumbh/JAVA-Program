import java.io.DataInputStream;
import java.io.IOException;
class Fibbo
{
	public static void main(String args[])
	{
		int no=0,a=0,b=1;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Fibbonacci Series");
		try
		{
			System.out.print("Enter the no = ");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		int sum=a+b;
		System.out.println(a);
		System.out.println(b);
		while(no>=3)
		{
			b=a;
			a=sum;
			sum=a+b;
			System.out.println(sum);
			no--;
		}
	}
}

/*
O/P

Enter the no = 10
0
1
1
2
3
5
8
13
21
34
*/