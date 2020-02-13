import java.io.DataInputStream;
import java.io.IOException;
class ArmstrongRange
{
	public static void main(String args[])
	{
		int rem=0,temp=0,str=0,end=0,sum=0;
		DataInputStream d =new DataInputStream(System.in);
		System.out.println("program for checking number is armstrong or not in given Range");
		try
		{

			System.out.print("Enter the Starting number = ");
			str=Integer.parseInt(d.readLine());
			System.out.print("Enter the Ending number = ");
			end=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}

		for(int i=str;i<end+1;i++)
		{
				sum=0;
				temp=i;

				while(temp!=0)
				{
					rem=temp%10;
					sum = sum + rem * rem * rem;
					temp=temp/10;
				}
				if(i==sum)
					System.out.println("Given number is Armstrong " +i);
		}





	}
}