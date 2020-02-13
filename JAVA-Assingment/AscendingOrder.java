import java.util.Scanner;
class AscendingOrder
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		//int fno = arr[i] , sno = arr[i+1] , temp = 0 ,no , i;
		int i, j,temp,no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for given array in Ascending Order");

		System.out.print("Enter the Array of size = ");
		no = sc.nextInt();
		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<no;i++)
		{
			for(j=i+1;j<no;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("Ascending order Element = ");
		for(i = 0;i<no;i++)
		{
			System.out.println(arr[i]);
		}

	}
}