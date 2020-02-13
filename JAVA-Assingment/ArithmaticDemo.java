import java.io.DataInputStream;
import java.io.IOException;
class ArithmaticDemo

{
	public static void main(String args[])
	{
		int fno=0,sno=0,ans;
		DataInputStream d= new DataInputStream(System.in);
		System.out.println("Addition of Two NO");
		try
		{
			System.out.print("Enter the value of FNO=");
			fno=Integer.parseInt(d.readLine());

			System.out.print("Enter the value of SNO=");
			sno=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{
		}
		ans=fno+sno;

	System.out.println("Addition of " +fno+ " and " +sno+ " = " +ans);

	System.out.println("\nSubtraction of Two NO");
				try
				{
					System.out.print("Enter the value of FNO=");
					fno=Integer.parseInt(d.readLine());

					System.out.print("Enter the value of SNO=");
					sno=Integer.parseInt(d.readLine());
				}
				catch(IOException ioe)
				{
				}
		ans=fno-sno;
		System.out.println("Subtraction of " +fno+ " and " +sno+ " = " +ans);

		System.out.println("\nMultiplication of Two NO");
					try
					{
						System.out.print("Enter the value of FNO=");
						fno=Integer.parseInt(d.readLine());

						System.out.print("Enter the value of SNO=");
						sno=Integer.parseInt(d.readLine());
					}
					catch(IOException ioe)
					{
					}
			ans=fno*sno;
			System.out.println("Multiplication of " +fno+ " and " +sno+ " = " +ans);

			System.out.println("\nDivision of Two NO");
						try
						{
							System.out.print("Enter the value of FNO=");
							fno=Integer.parseInt(d.readLine());

							System.out.print("Enter the value of SNO=");
							sno=Integer.parseInt(d.readLine());
						}
						catch(IOException ioe)
						{
						}
				ans=fno/sno;
				System.out.println("Division of " + fno + " and " + sno + " = " +ans);

	}
}