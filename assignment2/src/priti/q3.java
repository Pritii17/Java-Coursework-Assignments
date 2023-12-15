package priti;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) 
	{
  Scanner sc=new Scanner(System.in);
  double salary,DA,HRA,gross;
  
  System.out.println("Enter basic salary: ");
  salary=sc.nextDouble();
  
  DA=0.4*salary;
  HRA=0.2*salary;
  gross=salary + (DA+HRA);
  System.out.println("Basic salary is " +salary);
  System.out.println("DA is "+DA);
  System.out.println("HRA is " +HRA);
  System.out.println("Gross salary is " +gross);
  
	}

}
