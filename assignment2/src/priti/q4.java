package priti;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num,sum,digit;
	System.out.println("Enter a anumber between 0 to 1000: ");
	num=sc.nextInt();
	
	if(num>0 && num<1000) {
		sum=0;
		digit=num%10;
		sum=sum+digit;
		num=num/10;
		digit=num%10;
		sum=sum+digit;
		num=num/10;
		digit=num%10;
		sum=sum+digit;
		
		
		System.out.println("The sum of the digits is " +sum);
		
		
			
		}
	}
	        }
	    
	
