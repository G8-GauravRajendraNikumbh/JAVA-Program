import java.io.DataInputStream;
import java.io.IOException;
class Greatest_Array
{
	public static void main(String args[])
	{
		int max_arr[] = new int[10];
		int max=0,no = 0, i=0;
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Find Greatest of 10 Numbers");

		try
		{
			System.out.println("Enter the Array Element ");
			no=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		for(i=0;i<no;i++)
		{
			max_arr[i] = Integer.parseInt(d.readLine())  ;

		}
		for(i=0;i<no;i++)
		{
			System.out.println(max_arr[i]);
		}
	}
}