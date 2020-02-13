import java.io.DataInputStream;
import java.io.IOException;

class Bin2Dec
{
	public static void main(String args[])
	{
		long bin = 0;
		int rem = 0, add_factor = 1, pow = 0, dec = 0;
		DataInputStream d = new DataInputStream(System.in);

		System.out.println("\n\n For Converting Binary to Decimal");
		try
		{
			System.out.print("\n\n Enter Binary Value = ");
			bin = Long.parseLong(d.readLine());
		}
		catch(IOException ioe){}
		long back = bin;

		while(bin > 0)
		{
			if(pow == 0)
				add_factor = 1;
			else
				add_factor = add_factor * 2;

			rem = (int) (bin % 10);
			dec = dec + (rem * add_factor);
			bin = bin / 10;

			pow = pow + 1;
		}
		System.out.println("\n\n " + back + " = " + dec);
	}
}

