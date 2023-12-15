package priti;
import java.util.Scanner;

public class q6 {

	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    double seconds,distance;
    
    System.out.println("Enter the number of seconds: ");
    seconds=sc.nextDouble();
    
    distance=(1.0/2)*32.174*(seconds*seconds);
    
    System.out.println("Distance travelled: " +distance);
    
	}

}
