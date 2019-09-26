package loops;

import java.util.Scanner;

public class LeapYearByShort 
{

	public static void main(String[] args) 
	{
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=s.nextInt();
		if(year%4==0)
		{
			flag=true;
		}
		else if(year%1==0)
		{
			flag=false;
		}
		else
		{
			flag=false;
		}
		if(flag)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
	}

}
