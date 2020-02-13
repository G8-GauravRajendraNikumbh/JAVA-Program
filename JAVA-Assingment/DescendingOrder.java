import java.util.Scanner;
class  DescendingOrder
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		int no, i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for given array element Descending Order ");

		System.out.print("Enter the Array of Size = ");
		no =sc.nextInt();

		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<no;i++)
		{
			for(j=i+1;j<no;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Descending Order Element is = ");
		for(i=0;i<no;i++)
		{
			System.out.println(arr[i]);
		}
	}
}