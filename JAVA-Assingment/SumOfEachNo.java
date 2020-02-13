import java.util.Scanner;
class SumOfEachNo
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		int i , no , sum = 0 ,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for Sum of Digits of Each Number = ");

		System.out.print("Enter the Size of Array = ");
		no = sc.nextInt();

		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(i=0;i<no;i++)
		{
			temp = 0;
			sum = 0;
			while(arr[i]>0)
			{
				temp = arr[i]%10;
				sum = sum + temp;
				arr[i] = arr[i]/10;
			}
			System.out.println("Sum of Digits of Each Number is = " + sum);
		}
	}
}