package priti;
import java.util.Scanner;

public class ha_q2 {

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     int eggs,gross,dozen,remaining,rem;
     
     System.out.println("Enter number of eggs you have:  ");
     eggs=sc.nextInt();
     
     gross=eggs/144;
     rem=eggs%144;
     dozen=rem/12;
     remaining=rem%12;
     
     System.out.println("Your number of eggs is " +gross+ " gross, " +dozen+ " dozen, and " +remaining);
     
    		
	}

}
