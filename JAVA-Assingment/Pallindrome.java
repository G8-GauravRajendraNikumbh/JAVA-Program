import java.io.DataInputStream;
import java.io.IOException;
class Pallindrome
{
	public static void main(String args[])
	{
		int no=0,ans=0,temp=0,rev=0,rem=0;
		boolean flag=false;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println(" program for checking number is pallindrome or not");
		try
		{
			System.out.print("Enter the any Number");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}

			temp=no;

			while(no!=0)
			{
				rem = no%10;
				rev = rev * 10 + rem;
				no = no/10;
			}

			if(temp==rev)

				System.out.println("Given Number is Pallindrome ");
			else
				System.out.println("Number is not pallindrome");



	}
}