import java.io.DataInputStream;
import java.io.IOException;
class PrimeRange
{
	public static void main(String args[])
	{
		int str=0,end=0,i=0;
		boolean flag=false;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for printing all prime numbers in given range");
		try
		{
			System.out.print("Enter the any Starting number = ");
			str=Integer.parseInt(d.readLine());
			System.out.print("Enter the any Ending Number =");
			end=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(str<=end)
		{
			for(i=2;i<=str/2;i++)
			{
				if(str%i==0)
				{
					flag=true;
					break;
				}
			}
		if(flag==false)
			System.out.println("Number is Prime = "+str);
		else
			System.out.println("Number is not Prime = "+str);
		str++;
		}
		System.out.println("Please Enter your Valid Number");
	}

}
