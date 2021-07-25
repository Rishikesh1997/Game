import java.util.Scanner;
public class GuessingGame 
{

	public static void main(String[] args)
	{
		int r=(int)(Math.random()*10+1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number below 10");
		int n = sc.nextInt();
		int c=1;
		
		while(n!=r)
		{
			c++;
			if (n<r)
				System.out.println(n+" is smaller");
			else 
				System.out.println(n+" is greater");
			System.out.println("Enter another number: ");
			n=sc.nextInt();
			
		}
		if (c==1)
			System.out.println("*****\nContrats!!!");
		else if (c==2)
			System.out.println("***\nContrats!!!");
		else if (c==3)
			System.out.println("*\nContrats!!!");
		else
			System.out.println("You Win!");
		
		
	}
	
	
	
	
	
	
}
