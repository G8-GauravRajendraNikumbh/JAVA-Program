import java.util.Scanner;
class SumOfElement
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		int no,i,j,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for Sum of All Element ");

		System.out.print("Enter the Array of Size = ");
		no = sc.nextInt();
		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<no;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("The Sum of Array Elemnts is = " + sum);
	}
}