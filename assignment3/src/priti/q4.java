package priti;
import java.util.Random;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args)
	{
		Random ran=new Random();
		int guess=ran.nextInt(1,9);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 and 9 ");
		int number=sc.nextInt();
		
		if(guess==number)
			System.out.println("You got it right");
		else if(guess==++number || guess==--number)
			System.out.println("You almost got it");
		else
			System.out.println("You got it wrong");
		
		System.out.println("Number guessed by the system: " +guess);
		
		
		
		

	}

}
