import java.util.Scanner;
class MenuDrivenDemo
{
	public static void main(String args[])
	{
		long bin = 0,back=0;
		int ch,fno=0,sno=1,tno=0,ans=1,no=1,str =1, end = 0,sum=0,rem=0, rev=0, temp=0,fact=1,pow=0,add_factor=1,dec=0,num=0,i=2;
		float x = 0,y = 0,per_cent = 0,total = 0 ,sels_prc = 0 ,purch_prc = 0,m1=0,m2=0,m3=0;
		boolean flag=false;
		Scanner s = new Scanner(System.in);
		String c = new String();
//		MenuDrivenDemo m = new MenuDrivenDemo();

// do - main

		do
		{
			System.out.println("======= Main Menu =======");
			System.out.println("1.Arithmatic Menu ");
			System.out.println("2.If Else Menu ");
			System.out.println("3.Loop Menu ");
			System.out.println("4.Exit ");
			System.out.println("Enter the your Choice:-");
			ch = s.nextInt();

//Switch - Main

			switch(ch)
			{

//case 1 - switch main

				case 1:


// do - arith
					do
					{
						System.out.println("===== Arithmatic Menu =====");
						System.out.println("1.Addition Menu");
						System.out.println("2.Subtraction Menu");
						System.out.println("3.Multilication Menu");
						System.out.println("4.Division Menu");
						System.out.println("5.Exit");
						System.out.println("\nEnter your choice:-");
						ch=s.nextInt();
//switch - arith

						switch(ch)
						{
//case 1 - arith
							case 1:

//do - add menu
							do
							{
								System.out.println("====== Addition Menu =====");
								System.out.println("1.Addition of Two Integer Number");
								System.out.println("2.Addition of Two Folat Number");
								System.out.println("3.Exit");
								System.out.println("Enter your choice:-");
								ch = s.nextInt();
//switch add menu
								switch(ch)
								{

//case 1 - add menu
									case 1:
										do
										{
											System.out.println("===== Addition of Integer =====");
											System.out.print("Enter the First Integer Number = ");
											fno = s.nextInt();
											System.out.print("Enter the Second Integer Number = ");
											sno = s.nextInt();
											System.out.println("Addition of Two Integer " + fno + " and " + sno + " = " + (fno + sno));
											s.nextLine();
											System.out.println("Do you want to continue Addition (y/n) = ");
											c = s.nextLine();
										}while(c.equals("Y") || c.equals("y"));
										break;
//case 2 - add menu

									case 2:
										do
										{
											System.out.println("===== Addition of Float =====");
											System.out.print("Enter the First Float Number = ");
											x = s.nextFloat();
											System.out.print("Enter the Second Float Number = ");
											y = s.nextFloat();
											System.out.println("Addition of Two Float " + x + " and " + y + " = " + (x + y));
											s.nextLine();
											System.out.println("Do you want to continue Addition (y/n)");
											c = s.nextLine();

										}while(c.equals("Y") || c.equals("y"));
										break;
//case 3 - add menu
									case 3: System.exit(0);
//default - add menu
									default:System.out.println("Wrong Choice");
									break;
//end switch - add menu
								}
								s.nextLine();
								System.out.println("Do you want to continue Addition Menu(y/n):-");
								// s.nextLine();
								 c = s.nextLine();
//end do - add menu
							}while(c.equals("Y") || c.equals("y"));
							break;
//case 2 - arith
					case 2:
//do - substract menu
						do
							{
								System.out.println("===== Subtraction=====");
								System.out.println("1.Subtraction of Two Integer ");
								System.out.println("2.Subtraction of Two Float ");
								System.out.println("3.Exit");
								System.out.println("Enter your choice:-");
								ch = s.nextInt();
//switch substract menu
								switch(ch)
								{
//case 1 - substract menu
									case 1:
										do
											{
												System.out.print("Enter the First Integer = ");
												fno=s.nextInt();
												System.out.print("Enter the Second Integer = ");
												sno=s.nextInt();
												System.out.println("Subtraction of Two Integer " + fno + " and " + sno + " = " +(fno-sno));
												s.nextLine();
												System.out.println("Do you want to continue Subtraction of Two Integer(y/n)");
												c = s.nextLine();
											}while(c.equals("Y") || c.equals("y"));
											break;
//case 2 - substract menu
									case 2:
										do
											{
												System.out.print("Enter the First Float = ");
												x=s.nextFloat();
												System.out.print("Enter the Second Float = ");
												y=s.nextFloat();
												System.out.println("Subtraction of Two Float " + x + " and " + y + " = " +(x-y));
												s.nextLine();
												System.out.println("Do you want to continue Subtraction of Two Float(y/n)");
												c = s.nextLine();
											}while(c.equals("Y") || c.equals("y"));
											break;
//case 3 - substract menu

									case 3:	System.exit(0);
//default - substract menu
									default:System.out.println("Wrong Choice:-");break;

//end switch - substract menu

								}
								s.nextLine();
								System.out.println("Do you want to Continue Subtraction Menu(y/n)");
								// s.nextLine();
								 c=s.nextLine();
//end do - substract menu
							}while(c.equals("Y") || c.equals("y"));
							break;

						case 3:
							do
								{
									System.out.println("====== Multiplication ======");
									System.out.println("1.Multiplication of Two Integer");
									System.out.println("2.Multiplication of Two Float");
									System.out.println("Exit");
									System.out.println("Enter your Choice:-");
									ch = s.nextInt();
									switch(ch)
									{
										case 1:
											do
											{
												System.out.print("Enter the First Integer Number = ");
												fno=s.nextInt();
												System.out.print("Enter the Second Integer Number = ");
												sno=s.nextInt();
												System.out.println("Multiplication of Two Integer " + fno + " and " + sno + " = " +(fno * sno));
												s.nextLine();
												System.out.println("Do you want to continue(y/n)");
												c=s.nextLine();
											}while(c.equals("Y") || c.equals("y"));
											break;
										case 2:
											do
											{
												System.out.print("Enter the First Float Number = ");
												x = s.nextFloat();
												System.out.print("Enter the Second Float Number = ");
												y = s.nextFloat();
												System.out.println("Multiplication of Two Float " + x + " and " + y + " = " +(x * y));
												s.nextLine();
												System.out.println("Do you want to continue(y/n)");
												c=s.nextLine();
											}while(c.equals("Y") || c.equals("y"));
											break;
										case 3:
											System.exit(0);
										default:
											System.out.println("Wrong Choice");
										break;
									}
									s.nextLine();
									System.out.println("Do you want to continue Multilplication Menu(y/n)");
									c = s.nextLine();

								}while(c.equals("Y") || c.equals("y"));
								break;

						case 4:
							do
							{
								System.out.println("======Division======");
								System.out.println("1.Division of Two Integer");
								System.out.println("2.Division of Two Float");
								System.out.println("3.Exit");
								System.out.println("Enter your choice:-");
								ch = s.nextInt();
								switch(ch)
								{
									case 1:
										do
										{
											System.out.print("Enter the First Integer Number = ");
											fno=s.nextInt();
											System.out.print("Enter the Second Integer Number = ");
											sno=s.nextInt();
											System.out.println("Division of Two Integer Number " + fno + " and " + sno + " = " +(fno/sno));
											s.nextLine();
											System.out.println("Do you want to continue Division of Two Integer (y/n)");
											c = s.nextLine();
										}while(c.equals("Y") || c.equals("y"));
										break;
									case 2:
										do
										{
											System.out.print("Enter the First Float Number = ");
											x=s.nextFloat();
											System.out.print("Enter the Second Float Number = ");
											y=s.nextFloat();
											System.out.println("Division of Two Float Number " + x + " and " + y + " = " +(x/y));
											s.nextLine();
											System.out.println("Do you want to continue Division of Two Float (y/n)");
											c = s.nextLine();
										}while(c.equals("Y") || c.equals("y"));
										break;
									case 3:
										System.exit(0);
									default:
										System.out.println("Wrong Choice");
								}
								s.nextLine();
								System.out.println("Do you want to continue Division Menu(y/n)");
								c = s.nextLine();
							}while(c.equals("Y") || c.equals("y"));
							break;

						case 5:	System.exit(0);
//end switch - arith
					}
					s.nextLine();
					System.out.println("Do you want to Continue Arithamatic Menu(y/n)");
					c = s.nextLine();
//end do - arith
				}while(c.equals("Y") || c.equals("y"));
				break;
//end switch - main
//
			case 2:
				do
				{
					System.out.println("=========== If-Else Menu ==========");
					System.out.println("1.program for finding greatest number from three numbers.");
					System.out.println("2.program for checking number is +ve or -ve");
					System.out.println("3.program for checking number is odd or even");
					System.out.println("4.program for accepting marks of student in three subject calculate total and percentage and also print the class of student for example First class,second class or something else ");
					System.out.println("5.program for accepting three numbers check whether they are angles of triangle or not");
					System.out.println("6.program for accepting sale price and purchase price and check whether there is profit or loss");
					System.out.println("7.program for accepting any single character from keyboard check whether it is capital alphabet ,small alphabet, digit or some special symbol");
					System.out.println("8.Exit");
					System.out.println("Enter your choice:-");
					ch = s.nextInt();

					switch(ch)
					{
						case 1:
						do
						{
							System.out.println("Program for Greatest Number ");
							System.out.print("Enter the First Number = ");
							fno =s.nextInt();
							System.out.print("Enter the Second Number = ");
							sno =s.nextInt();
							System.out.print("Enter the Third Number = ");
							tno =s.nextInt();
							if((fno>sno) && (fno>tno))
								System.out.println("Fno is Greater value " + fno);
							else if((sno>fno) && (sno>tno))
								System.out.println("Sno is Greater value " + sno);
							else
								System.out.println("Tno is Greater value " + tno);
							s.nextLine();
							System.out.println("Do you want to continue(y/n)= ");
							c = s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 2:
						do
						{
							System.out.println("Program for Given Number is +ve or -ve");
							System.out.println("Enter the any number = ");
							fno =s.nextInt();
							if(fno==0)
								System.out.println("Given Number is Null " + fno);
							else if(fno>0)
								System.out.println("Given Number is Positive " + fno);
							else
								System.out.println("Given Number is Negative " + fno);
							s.nextLine();
							System.out.println("Do you wamt to continue(y/n)=");
							c = s.nextLine();

						}while(c.equals("Y") || c.equals("y"));
						break;

						case 3:
						do
						{
							System.out.println("Program for Given Number is Even or Odd ");
							System.out.println("Enter any Number = ");
							fno =s.nextInt();
							if(fno%2==0)
								System.out.println("Given Number is Even " + fno);
							else
								System.out.println("Given Number is Odd " + fno);
							s.nextLine();
							System.out.println("Do you want to continue(y/n) = ");
							c = s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 4:
						do
						{
							System.out.println("Student Result calculate ");
							System.out.println("Enter the marks of Subject m1 = ");
							m1 =s.nextFloat();
							System.out.println("Enter the marks of Subject m2 = ");
							m2 =s.nextFloat();
							System.out.println("Enter the marks of subject m3 = ");
							m3 =s.nextFloat();
							total = m1 + m2 + m3;
							per_cent = total / 3;
							System.out.println(" Percentage = " + per_cent);
							if((per_cent>70) && (per_cent<=100))
								System.out.println("Student pass out in First class " + per_cent);
							else if((per_cent>55) && (per_cent<=70))
								System.out.println("Student pass out in Second class " + per_cent);
							else if((per_cent>=35) && (per_cent<=55))
								System.out.println("Student pass out in Third class " + per_cent);
							else
								System.out.println("Student is Fail " + per_cent);
							s.nextLine();
							System.out.println("Do you want to continue(y/n) = ");
							c = s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 5:
						do
						{
							System.out.println("Given program is Angle of Triangle is not");
							System.out.print("Enter the First Number = ");
							fno =s.nextInt();
							System.out.print("Enter the Second Number = ");
							sno =s.nextInt();
							System.out.print("Enter the Third Number = ");
							tno =s.nextInt();
							ans = fno + sno + tno;
							if(ans==180)
								System.out.println("Given Triangle is Angle of Triangle = " + ans);
							else
								System.out.println("Given Triangle is not Angle of Triangle = " + ans);
							s.nextLine();
							System.out.println("Do you want to continue(y/n)= ");
							c = s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 6:
						do
						{
							System.out.println("Program for Profit or Loss ");
							System.out.print("Enter the seling price ");
							sels_prc = s.nextFloat();
							System.out.print("Enter the purches price ");
							purch_prc = s.nextFloat();
							if(sels_prc == purch_prc)
								System.out.println("No Profit OR No Loss ");
							else if(sels_prc>purch_prc)
								System.out.println(" Profit = " + (sels_prc - purch_prc));
							else
								System.out.println(" Loss = " + (purch_prc - sels_prc));
							s.nextLine();
							System.out.println("Do you want to continue(y/n)=");
							c = s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 7:
						do
						{
							System.out.println("check whether it is capital alphabet ,small alphabet, digit or some special symbol");
							System.out.println("Enter any character = ");
							c = s.nextLine();
							s.nextLine();
							System.out.println("Do you want to continue(y/n)=");
							c = s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 8: System.exit(0);
						default:
							System.out.println("Wrong choice:-");
					}
						s.nextLine();
					 	System.out.println("Do you to contonue If-Else Menu(y/n)=");
					 	c = s.nextLine();
				}while(c.equals("Y") || c.equals("y"));

///
			case 3:
			do
			{
				System.out.println("==========Loop Menu==========");
				System.out.println("1.program for printing welcome 5 times");
				System.out.println("2.program for printing 1 to 10 numbers");
				System.out.println("3.program for printing 10 to 1 numbers");
				System.out.println("4.program for printing table of 2");
				System.out.println("5.program for printing numbers between given range. means starting number and ending number should be given by user ");
				System.out.println("6.program for printing 1 to 100 EVEN numbers");
				System.out.println("7.program for printing 1 to 100 ODD numbers");
				System.out.println("8.program for printing fibbonacci series");
				System.out.println("9.program for checking the given number is prime or not");
				System.out.println("10.program for printing the reverse of given number");
				System.out.println("11.program for printing addition of digits in given number");
				System.out.println("12.program for checking number is pallindrome or not");
				System.out.println("13.program for checking number is armstrong or not");
				System.out.println("14.program for printing all prime numbers in given range");
				System.out.println("15.program for printing factorial of given number");
				System.out.println("16.program for accepting no and its power from keyboard and print the answer as no raise to power");
				System.out.println("17.program for printing all pallindrome numbers in given range");
				System.out.println("18.program to convert Binary to Decimal");
				System.out.println("19.program to convert Decimal to Binary");
				System.out.println("20.program to convert Binary to Octal");
				System.out.println("21.program to convert Decimal to Octal");
				System.out.println("22.program to convert Binary to HexaDecimal");
				System.out.println("23.program to convert Decimal to HexaDecimal");
				System.out.println("24.Exit");
				System.out.println("Enter your choice:-");
				ch = s.nextInt();
				switch(ch)
				{
					case 1:
					do
					{
						System.out.print("Enter any Number = ");
						fno=s.nextInt();
						while(fno>0)
						{
							System.out.println("Welcome Gaurav ");
							fno=fno-1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();
					}while(c.equals("Y") || c.equals("y"));
					break;

					case 2:
					do
					{
						System.out.println("printing 1 to 10 numbers");
						System.out.print("Enter the starint number number = ");
						no=s.nextInt();
						while(no<=10)
						{
							System.out.println(no);
							no=no+1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();

					}while(c.equals("Y") || c.equals("y"));
					break;

					case 3:
					do
					{
						System.out.println("printing 10 to 1 numbers");
						System.out.print("Enter the ending number = ");
						no=s.nextInt();
						while(0<no)
						{
							System.out.println(no);
							no=no-1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();
					}while(c.equals("Y") || c.equals("y"));
					break;

					case 4:
					do
					{
						System.out.println("Program for table of 2");
						//System.out.print("Enter the number = ");
						//no = nextInt();
						System.out.print("Enter the number = ");
						fno =s.nextInt();
						while(no<=10)
						{
							System.out.println((fno * no));
							no=no+1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();
					}while(c.equals("Y") || c.equals("y"));
					break;

					case 5:
					do
					{
						System.out.println("Printing the Number in Starting and Ending Range");
						System.out.print("Enter the Starting Number = ");
						str = s.nextInt();
						System.out.print("Enter the Ending Number = ");
						end = s.nextInt();
						while(str<=end)
						{
							System.out.println(str);
							str=str+1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();
					}while(c.equals("Y") || c.equals("y"));
					break;

					case 6:
					do
					{
						System.out.println("Printing the Even Number ");
						System.out.print("Enter the starting Number = ");
						str =s.nextInt();
						System.out.print("Enter the ending Number = ");
						end = s.nextInt();
						while(str<=end)
						{
							if(str % 2 != 1)
								System.out.println(str);
							str = str +1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();
					}while(c.equals("Y") || c.equals("y"));
					break;

					case 7:
					do
					{
						System.out.println("Printing the Odd Number ");
						System.out.print("Enter the starting Number = ");
						str = s.nextInt();
						System.out.print("Enter the ending Number = ");
						end = s.nextInt();
						while(str<end)
						{
							if(str % 2 == 1)
								System.out.println(str);
							str = str +1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();
					}while(c.equals("Y") || c.equals("y"));
					break;

					case 8:
					do
					{
						fno = 0;
						sno = 1;
						sum = 0;
						System.out.println("printing fibbonacci series");
						System.out.print("Enter the number = ");
						no = s.nextInt();
						System.out.println(fno);
						System.out.println(sno);
						while(no>=3)
						{
							sum=fno+sno;
							System.out.println(sum);
							sno=fno;
							fno=sum;
							no = no-1;
						}
						s.nextLine();
						System.out.println("Do you want to continue(y/n)=");
						c = s.nextLine();

					 }while(c.equals("Y") || c.equals("y"));
						break;

						case 9:
						do
						{
							i=2;
							flag=false;
							System.out.println("chekc Given number is prime or not");
							System.out.print("Enter the any number = ");
							no = s.nextInt();
							for(i=2;i<=no/2;i++)
							{
								if(no%i==0)
								{
									flag=true;
									break;
								}

							}
							if(flag==false)
								System.out.println("Number is Prime = " + no);
							else
								System.out.println("Number is not Prime = " + no);

							s.nextLine();
							System.out.println("Do you want to continue(y/n)=");
							c =s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 10:
						do
						{
							no = 0;
							rem = 0;
							rev = 0;
							System.out.println("Printing the Reverse of Given number");
							System.out.print("Enter the any number = ");
							no =s.nextInt();
							back = no;
							while(no>0)
							{
								rem = no%10;
								rev = rev * 10 + rem;
								no = no/10;
							}
							System.out.println("Given number is " + back + " = " + rev);
							s.nextLine();
							System.out.println("Do you want to continue(y/n)=");
							c = s.nextLine();

						}while(c.equals("Y") || c.equals("y"));
						break;

						case 11:
						do
						{
							//rem = 0;
							sum = 0;

							System.out.println("Addtion of digit in given number");
							System.out.print("Enter the any number = ");
							no = s.nextInt();
							back = no;
							while(no>0)
							{
								rem = no % 10;
								sum = sum + rem;
								no = no / 10;
							}
							System.out.println("Given number is" + back + " = " + sum);
							s.nextLine();
							System.out.println("Do you want to continue(y/n)=");
							c = s.nextLine();
						}while(c.equals("Y") || c.equals("y"));
						break;

						case 12:
						do
						{
							rem = 0;
							temp =0;

							System.out.println("Given Number is Pallidrome or not");
							System.out.print("Enter any number = ");
							no =s.nextInt();
							back = no;
							while(no>0)
							{
								rem = no%10;
								temp = temp * 10 + rem;
								no = no/10;
							}
							if(back == temp)
								System.out.println("Given Number is Pallindrome number " +temp);
							else
								System.out.println("Given Number is not Pallindrome number " +temp);
							s.nextLine();
							System.out.println("Do you want to continue(y/n)=");
							c = s.nextLine();
						 }while(c.equals("Y") || c.equals("y"));
						 break;

						 case 13:
						 do
						 {
							 System.out.println("Program for check Given Number is Armstrong or not");
							 System.out.print("Enter any Number = ");
							 no = s.nextInt();
							 back = no;
							 while(no>0)
							 {
								rem = no%10;
								temp = temp + rem * rem * rem;
								no = no/10;
							 }
							 if(back == temp)
							 	System.out.println("Given Number is Armstrong number " +temp);
							 else
							 	System.out.println("Given Number is not Armstrong number " +temp);
							 s.nextLine();
							 System.out.println("Do want to continue(y/n)=");
							 c = s.nextLine();
						 }while(c.equals("Y") || c.equals("y"));
						  break;

						  case 14:
						  do
						  {
							  System.out.println("program for printing the prime number in given range");
							  System.out.print("Enter any number = ");
							  no =s.nextInt();


							  s.nextLine();
							  System.out.println("Do you want to continue(y/n)=");
							  c = s.nextLine();
						  }while(c.equals("Y") || c.equals("y"));
						  break;

						  case 15:
						  do
						  {
							  System.out.println("program for printing factorial of given number");
							  System.out.print("Enter any number = ");
							  no = s.nextInt();
							  for( i=1;i<=no;i++)
							  {
								  fact = fact * i;
							  }
							  if(no==0)
								  fact=0;
							  System.out.println("Factorial of Given number is" + fact);
							  s.nextLine();
							  System.out.println("Do you want to continue(y/n)=");
							  c = s.nextLine();
						   }while(c.equals("Y") || c.equals("y"));
						    break;

						  case 16:
						  do
						  {
							 	System.out.println("16.program for accepting no and its power from keyboard and print the answer as no raise to power");
							 	System.out.print("Enter any number = ");
							 	no = s.nextInt();
							 	System.out.print("Enter the power of number = ");
							 	pow =s.nextInt();
							 	back = no;
								while(pow!=0)
									{
										ans = ans * no;
										pow = pow-1;
									}
								System.out.println("Given Number is" + back + " = " + ans );
								s.nextLine();
								System.out.println("Do you want to continue(y/n)=");
							    c = s.nextLine();
						   }while(c.equals("Y") || c.equals("y"));
						    break;

						  case 17:
						  do
						  {
							  System.out.println("program for printing all pallindrome numbers in given range");
							  System.out.print("Enter the starting number = ");
							  str = s.nextInt();
							  System.out.print("Enter the ending number = ");
							  end = s.nextInt();
							  if(str<=end)
							  {




							  }
							  s.nextLine();
							  System.out.println("Do you want to continue(y/n) = ");
							  c = s.nextLine();
						  }while(c.equals("Y") || c.equals("y"));
						   break;

						  /*case 18:
						  do
						  {
							System.out.println("Program for convert Number Binary to Decimal");
							System.out.print("Enter any Binary Number = ");
							bin = nextLong();
							long back = bin;
							while(bin>0)
							{

								if(pow == 0)
									add_factor=1;
								else
									add_factor = add_factor * 2;
								rem = (int) (bin%10);
								dec = dec + (rem * add_factor);
								bin = bin/10;

								pow = pow + 1;
							}
							System.out.println("\n\n " + back + " = " + dec);
							s.nextLine();
						    System.out.println("Do you want to continue(y/n) = ");
						    c = s.nextLine();
						  }while(c.equals("Y") || c.equals("y"));
						   break;

						  case 19:
						  do
						  {
							  System.out.println("Program for convert Number Decimal to Binary ");
						  }
						   break;

						   case 20:
						   do
						   {
							   System.out.println("Program for convert Number Binary to Octal ");
						   }
						   break;

						   case 21:
						   do
						   {
							   System.out.println("Program for convert Number Decimal to Octal ");

						   }
						   break;

						   case 22:
						   do
						   {
							   System.out.println("Program for convert Number Binary to Hexadecimal ");
						   }
						   break;

						   case 23:
						   do
						   {
							   System.out.println("Program for convert Number Decimal to Hexadecimal ");
						   }
						   break;*/

						   case 24: System.exit(0);
						   default:
						   	System.out.println("Wrong Choice:-");
						}
						s.nextLine();
						System.out.println("Do you want to continue Loop Menu (y/n)=");
						c = s.nextLine();
					}while(c.equals("Y") || c.equals("y"));








			}
			s.nextLine();
			System.out.println("Do you want to Continue Main Menu(y/n)");
			c = s.nextLine();
//end do - main
		}while(c.equals("Y") || c.equals("y"));
	}
}








