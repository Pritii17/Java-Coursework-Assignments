package priti;

import java.util.Scanner;
public class q1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	     double Fahrenheit,cel;
	     
	     System.out.println("Enter degree in Fahrenheit: ");
	     Fahrenheit=sc.nextDouble();
	     cel=(Fahrenheit-32) *5.0/9;
	      
	     System.out.println(Fahrenheit+ " Fahrenheit is " +cel+ " celsius  ");
	}

}
