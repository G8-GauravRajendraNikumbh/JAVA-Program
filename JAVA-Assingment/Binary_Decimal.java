import java.io.DataInputStream;
import java.io.IOException;
class Binary_Decimal
{
	public static void main(String args[])
	{
		int no=0,sum=1,exp=0,temp=0,p=0,sum1=0,a=0;
		DataInputStream d= new DataInputStream(System.in);
		System.out.println("Convert program in Binary To Decimal");
		try
		{
			System.out.print("Enter the Number = ");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(no!=0)
		{
			temp=no%10;
			if(temp==1)
			{
				if(p<=1)
				{
					exp=2*p;
					sum=sum+temp*exp*p;
				}
				else if(p>=2)
				{
					exp=2*p;
					sum1=sum1+temp*exp+exp;

				}
			}
			else if(temp==0)
			{
				if(p==0)
				{
					exp=2*p;
					sum=sum+temp*exp+exp;
				}
				else if(p>=1)
				{
					exp=2*p;
					sum1=sum1+temp*exp+exp;
				}
			}
			p++;
			no=no/10;

		}


	}
}