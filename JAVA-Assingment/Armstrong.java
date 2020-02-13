import java.io.DataInputStream;
import java.io.IOException;
class Armstrong
{
	public static void main(String args[])
	{
		int no=0,temp=0,rem,sum=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for checking number is armstrong or not");
		try
		{
			System.out.print("Enter any Number =");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		temp=no;

		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}

			if(temp==sum)
				System.out.println("Number is Armstrong Number");
			else
				System.out.println("Number is Not Armstrong Number");

	}
}