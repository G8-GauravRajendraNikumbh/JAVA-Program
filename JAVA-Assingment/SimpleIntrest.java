import java.io.DataInputStream;
import java.io.IOException;
class SimpleIntrest
{
	public static void main(String args[])
	{
		int prc=1,noy=1;
		float si,rate=1;
		System.out.println("Calculating simple interest");
		DataInputStream d = new DataInputStream(System.in);
		try
	 	{
			System.out.print("Enter the principle amount = ");
			prc=Integer.parseInt(d.readLine());
			System.out.print("Enter the NO of years = " );
			noy=Integer.parseInt(d.readLine());
			System.out.print("Enter the Rate =");
			rate=Float.parseFloat(d.readLine());
		}
		catch(IOException ioe)
		{}
		si= (prc * noy * rate)/100;
		System.out.println("Simple interest = " +si);
		//System.out.println("Simple interest = "+ (prc * noy * rate)/100);

	}

}