package loops;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int temp ;
		boolean fact=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the given number is prime or not:");
		int num=s.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				fact=true;
				break;
			}
			
		}
		if(fact)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
