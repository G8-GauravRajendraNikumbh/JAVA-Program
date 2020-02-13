import java.io.DataInputStream;
import java.io.IOException;
class MeterKilometer
{
	public static void main(String args[])
	{
		int kg=1;
		int mtr=1;
		System.out.println( "program for converting metres into kilometres or vice versa.");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the Kilometer = ");
			kg=Integer.parseInt(d.readLine());
			System.out.print("Enter the Meter = ");
			mtr=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		System.out.println( kg + " Kilometer into "+ (kg * 1000)+ " meter ");
		System.out.println(mtr + " Meter into "+ (mtr / 1000.0)+ "Kilometer ");
	}
}