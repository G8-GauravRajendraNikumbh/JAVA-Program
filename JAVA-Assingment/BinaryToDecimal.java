import java.io.DataInputStream;
import java.io.IOException;
class BinaryToDecimal
{
	public static void main(String args[])
	{
		long bin = 0;
		int add_factor=1,sum = 0,rem = 0, pow = 0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println(" program to convert Binary to Decimal");
		try
		{
			System.out.print("Enter the Binary Number = ");
			bin=Long.parseLong(d.readLine());
		}
		catch(IOException ioe)
		{}
		long back = bin;
		while(bin>0)
		{
			if(pow==0)
				add_factor = 1;
			else
				add_factor = add_factor * 2;

				rem = (int) ( bin % 10);
				sum = sum + (rem * add_factor);
				bin = bin/10;
				pow = pow+1;
		}
		System.out.println("Binary Number = " + back + " = " + sum);

	}

}