import java.util.Scanner;
class Matrix2D
{
	public static void main(String args[])
	{
		int arr[][] = new int[20][20];
		int arr1[][] = new int[20][20];
		int sum[][] = new int[20][20];
		int sub1[][] = new int[20][20];
		int mult1[][] = new int[20][20];
		int row , col , i ,j , k;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Program for Addition, Substraction, Multiplication of 2 Matrices");

		System.out.print("Enter the First Array of Row Size = ");
		row = sc.nextInt();
		System.out.print("Enter the First Array of Column Size = ");
		col = sc.nextInt();

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Print the matrix");

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.print("Enter the Second Array of Row Size = ");
		row = sc.nextInt();

		System.out.print("Enter the Second Array of Row Column = ");
		col = sc.nextInt();

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Print the matrix");

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				sum[i][j] = arr[i][j] + arr1[i][j];
				sub1[i][j] = arr[i][j] - arr1[i][j];

			}
		}

		System.out.println("Addition of Matrix");

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(sum[i][j]+ "  ");
			}
			System.out.println();
		}

		System.out.println("Subtraction of Matrix");

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(sub1[i][j]+ "  ");
			}
			System.out.println();
		}

		System.out.println("Multiplication of Matrix");

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mult1[i][j] = 0;

				for(k=0;k<row;k++)
				{
					mult1[i][j]  = mult1[i][j] + arr[i][k] * arr1[k][j];
				}
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mult1[i][j]+"  ");
			}
			System.out.println();
		}
	}
}