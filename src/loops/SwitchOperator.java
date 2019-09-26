package loops;

import java.util.Scanner;

public class SwitchOperator 
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice which operation to be performe by using a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		String ch=s.next();
		switch(ch)
		{
		case "+":
			System.out.println("Addition:"+(a+b));
			break;
		case"-":
			System.out.println("Substraction:"+(a-b));
			break;
		case"%":
			System.out.println("Mod"+(a%b));
			break;
		case"/":
			System.out.println("Division:"+(a/b));
		    break;
		default:
			System.out.println("Invalid choice");
		}
		
	}

}
