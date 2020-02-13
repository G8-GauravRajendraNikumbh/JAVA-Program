import java.util.Scanner;
class TransposMatrix
{
	public static void main(String args[])
	{
		int arr[][] = new int[20][20];
		int transp[][] = new int[20][20];
		int i , j , row,col;
		Scanner sc = new Scanner(System.in);

		System.out.println("Program for Transpose of the given Matrix");
		System.out.print("Enter the Array of Row Size = ");
		row = sc.nextInt();
		System.out.print("Enter the Array of Colunm Size = ");
		col = sc.nextInt();

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Print the Array");

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("Transpose of Matrix is = ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				transp[i][j] = arr[j][i];
			}
		}
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<col;j++)
			 {
				 System.out.print(transp[i][j]+ "  ");
			 }
			 System.out.println();
		}

	}
}