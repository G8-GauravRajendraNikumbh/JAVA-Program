import java.io.DataInputStream;
import java.io.IOException;
class Arm
{
	public static void main(String args[])
	{
		int str=0,end=0,rem=0,sum=0,temp=0,i=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Program for Armstrong Number");
		try
		{
			System.out.print("Enter the Starting Number = ");
			str=Integer.parseInt(d.readLine());
			System.out.print("Enter the Ending Number = ");
			end=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		for(i=str;i<=end;i++)
		{
			sum=0;
			temp=i;
			while(temp!=0)
			{
				rem=temp%10;
				sum=sum+rem*rem*rem;
				temp=temp/10;
			}
			if(i==sum)
			System.out.println("Ginev number Aemstrong"+i);
		}
	}
}