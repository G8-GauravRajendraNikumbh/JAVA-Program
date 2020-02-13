import java.util.Scanner;
class FrequencyMatrix
{
	public static void main(String args[])
	{
		int fre_mat[][] = new int[20][20];
		int i,j,row,col,Even_count=0,Odd_count=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Program for Find the frequency of odd and even numbers in a given matrix");
		System.out.print("Enter the Array of Row size = ");
		row = sc.nextInt();
		System.out.print("Enter the Array of Colunm size = ");
		col = sc.nextInt();

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				fre_mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Print the Array = ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(fre_mat[i][j]+ "  ");
			}
			System.out.println();
		}

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
					if(fre_mat[i][j]%2==0)
					{
						Even_count = Even_count + 1;
					}
					else
					{
						Odd_count = Odd_count + 1;
					}
			}

		}
		System.out.println("The frequency of Even numbers in a given matrix is = "+Even_count);
		System.out.println("The frequency of Odd numbers in a given matrix is = "+Odd_count);
	}
}