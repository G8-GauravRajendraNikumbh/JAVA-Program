import java.io.DataInputStream;
import java.io.IOException;
class Prime
{
	public static void main(String args[])
	{
		int num=0,i=2;
		boolean flag=false;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for checking the given number is prime or not");
		try
		{
			System.out.print("Enter any number = ");
			num=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");


	}

}