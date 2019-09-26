package loops;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args)
	{
		int rev=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		temp=num;
		for(int i=1;i<num;i++)
		{
			num=num%10;
			rev=rev*10+temp;
			num=num/10;
		
		}
		if(temp==rev)
		{
			System.out.println(rev+" "+"Number is a palindrome");
		}
		else
		{
			System.out.println(rev+" "+"Number is not a palindrom");
		}
	}

}
