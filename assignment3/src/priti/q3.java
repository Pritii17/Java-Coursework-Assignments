package priti;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>=num2&&num2>=num3)
			System.out.println("decreasing");
		else if(num1<=num2&&num2<=num3)
			System.out.println("increasing");
		else
			System.out.println("Neither increasing nor decreasing");
		
		
		

	}

}
