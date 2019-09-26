package loops;

import java.util.Scanner;

public class AmstrongNumber 
{

	public static void main(String[] args) 
	{
		int a=1,c=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the given number is Amstrong or not:");
		int num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
			
		}
		if(temp==c)
		{
			System.out.println("Number is Amstrong");
		}
		else
		{
			System.out.println("Number is not Amstrong");
		}
				
	}

}
