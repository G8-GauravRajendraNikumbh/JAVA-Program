import java.io.DataInputStream;
import java.io.IOException;
class StudentMarks
{
	public static void main(String args[])
	{
		int m1=0,m2=0,m3=0;
		System.out.println("program for accepting marks of student in three subject calculate total and percentage and also print the class of student for example First class,second class or something else");
		DataInputStream d = new DataInputStream(System.in);
		try
		{
			System.out.print("Enter the Mark of Math-I = ");
			m1=Integer.parseInt(d.readLine());
			System.out.print("Enter the Mark of Math-II = ");
			m2=Integer.parseInt(d.readLine());
			System.out.print("Enter the Mark of Math-III = ");
			m3=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{}
		int total = m1+m2+m3;
		System.out.println(" Total of Marks = " +total);
		//System.out.println(" Total of Marks = " +(m1+m2+m3));
		float perc = total/3;
		System.out.println(" Total percentage = " +perc);
		//System.out.println(" Total percentage = " +(total/3));

		if((perc>=70) && (perc<=100))

			System.out.println("Student is First class");
		else if((perc>=55) && (perc<70))
			System.out.println("Student is Second class");
		else if((perc>=35) && (perc<55))
			System.out.println("Student is Third class");
		else
			System.out.println("Stydent is Fail");
	}

}