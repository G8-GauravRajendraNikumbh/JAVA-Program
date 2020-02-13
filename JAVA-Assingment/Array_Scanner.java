import java.util.Scanner;
class Array_Scanner
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		int i,no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for Print array Element");
		System.out.print("Enter the Array Size = ");
		no = sc.nextInt();
		for(i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Print Array Element = ");
		for(i=0;i<no;i++)
		{
			System.out.println("Element At Index " +  i +" = "+arr[i]);
		}
	}
}