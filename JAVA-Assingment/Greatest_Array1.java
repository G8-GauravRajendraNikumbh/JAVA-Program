import java.io.DataInputStream;
import java.io.IOException;
class Greatest_Array1
{
	public static void main(String args[])
	{
		int arr[]= new int[10];
		int max=0,i=0,no=0;
		System.out.println("program for print the array of maximum element");
		//Scanner sc = new Scanner(System.in);
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the size of array = ");
			no=Integer.parseInt(d.readLine());
			for(i=0;i<no;i++)
			{
			arr[i] = Integer.parseInt(d.readLine());
			}
		}
		catch(IOException ioe)
		{}
		System.out.println("Print the Array Element = ");
			for(i=0;i<no;i++)
			{
				System.out.println(arr[i]);
			}

	}
}