import java.io.DataInputStream;
import java.io.IOException;
class Table3
{
	public static void main(String args[])
	{
		int no=1,j=0;
		DataInputStream d = new DataInputStream(System.in);
				System.out.println("program for printing table of 2");
				try
				{
					System.out.print("Enter the Number = ");
					j=Integer.parseInt(d.readLine());
				}
				catch(IOException ioe)
				{}

				while(no<=10)
				{

					System.out.println((no * j));
					no++;
				}

	}
}