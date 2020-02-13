import java.util.Scanner;
class SmallestArray1
{
	public static void main(String args[])
	{

		int arr[] = new int[20];
		int min = 1,i,no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for Find Smallest of 10 Numbers");

		System.out.print("Enter the Array of Size = ");
		no = sc.nextInt();
		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		//System.out.println("The Minimum Array Element is = ");
		for(i=0;i<no;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("The Minimum Array Element is = " + min);
	}
}