import java.util.Scanner;
class ReverseOfNumber
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		int i , rev = 0 , temp = 0 , no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for Reverse of Each Number ");

		System.out.print("Enter the Size of Array = ");
		no = sc.nextInt();

		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(i=0;i<no;i++)
		{
			temp = 0;
			rev = 0;
			while(arr[i]>0)
			{
				temp = arr[i]%10;
				rev = rev * 10 + temp;
				arr[i] = arr[i]/10;
			}
			System.out.println("Reverse of Each Number is = " + rev);
		}
	}
}