package priti;
import java.util.Scanner;

public class ha_q1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of minutes: ");
		long minutes=sc.nextLong();
		
		long year=minutes/(365*24*60);
		long rem=minutes%(365*24*60);
		long days=rem;
		
		System.out.println(minutes+ "  minutes is approximately " +year+ " years and  " +days+ " days ");
		
		

	}

}
