import java.io.DataInputStream;
import java.io.IOException;
class ProfitLoss
{
	public static void main(String args[])
	{
		int sels=0,purches=0;
		System.out.println("program for accepting sale price and purchase price and check whether there is profit or loss");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the Seling Price = ");
			sels=Integer.parseInt(d.readLine());
			System.out.print("Enter the Purchsing Price = ");
			purches=Integer.parseInt(d.readLine());

		}
		catch(IOException ioe)
		{}
		if(purches==sels)
			System.out.println("No Profit And NO Loss");
		else if(purches<sels)
			System.out.println("Profit");
		else
			System.out.println("Loss");


	}
}