//import java.io.DataInputStream;
//import java.io.IOException;
import java.util.Scanner;
class Character
{
	public static void main(String args[])
	{
		String ch;
	//	DataInputStream d = new DataInputStream(System.in);
		System.out.println("program for accepting any single character from keyboard check whether it is capital alphabet ,small alphabet, digit or some special symbol");
			System.out.print("Enter any Character =");
			ch=d.readLine();
				if((ch>=65) && (ch<=90))
			System.out.println("Character is Capital Alphabet");
		else if((ch>=97) && (ch<=122))
			System.out.println("Character is Small Alphabet");
		else
			System.out.println("Character is Digit or some Special Symbol");


	}
}