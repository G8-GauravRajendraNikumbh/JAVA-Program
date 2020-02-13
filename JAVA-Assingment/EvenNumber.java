import java.io.DataInputStream;
import java.io.IOException;
class EvenNumber
{
	public static void main(String args[])
	{
		int no=1,no1=1;
		DataInputStream d =new DataInputStream(System.in);
		System.out.println("program for printing 1 to 100 even numbers");
		try
		{
			//System.out.print("Enter any number = ");
			//no=Integer.parseInt(d.readLine());
			System.out.print("Enter Ending number = ");
			no1=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		while(no<=no1)
		{
			if(no%2!=1)
			{
				System.out.println(+no);
			}
			no++;
		}


	}
}