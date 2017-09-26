import java.util.Scanner;
/*
 * git add *
 * git commit
 * git push url
 * username * 
 * 
 */

public class Main 
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		int answer = 0;
		
		System.out.print("Enter operation (a, s, m, or d): ");
		String choice = in.nextLine();
		
		System.out.print("Enter first: ");
		first = in.nextInt();
		
		System.out.print("Enter second: ");
		second = in.nextInt();
		
		if (choice.equalsIgnoreCase("a"))
		{
			answer = first + second;
		}
		
		else if (choice.equalsIgnoreCase("s"))
		{
			answer = first - second;
		}
		
		else if (choice.equalsIgnoreCase("m"))
		{
			answer = first * second;
		}
		
		else if (choice.equalsIgnoreCase("d"))
		{
			answer = first / second;
		}
		
		System.out.println("The answer is: " + answer);
	}
}
