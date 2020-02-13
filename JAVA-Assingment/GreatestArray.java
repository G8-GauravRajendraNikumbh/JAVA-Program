import java.util.Scanner;
class GreatestArray
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		int no,i,max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for Find Greatest of 10 Numbers");

		System.out.print("Enter the Array Size = ");
		no = sc.nextInt();
		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(i=0;i<no;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
			System.out.println("The Maximum Array Element is = " + max);
	}
}