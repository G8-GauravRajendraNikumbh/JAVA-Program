import java.io.DataInputStream;
import java.io.IOException;
class Greatest
{
	public static void main(String args[])
	{
		int fno=0,sno=0,tno=0;
		System.out.println(" pregram for finding greatest number from three numbers");
		DataInputStream d= new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the value of FNO = ");
			fno=Integer.parseInt(d.readLine());
			System.out.print("Enter the value of SNO = ");
			sno=Integer.parseInt(d.readLine());
			System.out.print("Enter the value of TNO = ");
			tno=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}

		if((fno>sno) && (fno>tno))

			System.out.println("Fno is Greter value FNO = " +fno);
		else if((sno>fno) && (sno>tno))

				System.out.println("Sno is Greter value SNO = " +sno);
		else

			System.out.println("Tno is Greter value TNO = " +tno);




	}

}