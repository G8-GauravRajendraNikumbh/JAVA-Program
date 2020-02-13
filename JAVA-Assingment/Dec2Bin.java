import java.io.DataInputStream;
import java.io.IOException;
class Dec2Bin
{
	public static void main(String args[])
	{
		long dec = 0,arr[]=new long[20];
		int rem = 0,rev=0,sum = 0,temp = 0;
		System.out.println("program to convert Decimal to Binary ");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the Decimal Number = ");
			dec=Long.parseLong(d.readLine());
		}
		catch(IOException ioe)
		{}
		long back = dec;
		while(dec>0)
		{
			rem = (int) (dec % 2);
			temp = temp * 10 + rem;

			//System.out.print(rem);
			dec = dec / 2;

		}
		System.out.println("Binary No = ");
		System.out.println(temp);
	}

}