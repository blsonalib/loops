package loops;

import java.util.Scanner;

public class FourteenTable 
{

	public static void main(String[] args) 
	{
		int i,a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the table of any number:");
		int n=s.nextInt();
		for(i=1;i<=10;i++)
		{
			a=n*i;
			System.out.println(+a);
		}
		
	}

}
