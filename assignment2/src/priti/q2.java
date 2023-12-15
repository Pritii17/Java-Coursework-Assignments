package priti;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double kilometers,meters,feet,inch,centimeters;
	    
		System.out.println("Enter distance in Kilometers: ");
		kilometers=sc.nextDouble();
		meters=kilometers *1000;
		feet=kilometers*3280.8399;
		inch=kilometers*39370.0787;
		centimeters=kilometers*100000;
		
		System.out.println(kilometers+ " kilometer is " +meters+ " meters ");
		System.out.println(kilometers+ " kilometer is " +feet+ " feet ");
		System.out.println(kilometers+ " kilometer is " +inch+ " inch");
		System.out.println(kilometers+ " kilometer is " +centimeters+ " centimeters ");
	}	
		
		
	}

