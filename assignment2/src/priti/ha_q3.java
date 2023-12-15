package priti;
import java.util.Scanner;

public class ha_q3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3,side1,side2,side3,s,area;
		
		System.out.println("Enter x1 ");
		x1=sc.nextDouble();
		System.out.println("Enter y1 ");
		y1=sc.nextDouble();
		System.out.println("Enter x2 ");
		x2=sc.nextDouble();
		System.out.println("Enter y2 ");
        y2=sc.nextDouble();
        System.out.println("Enter x3 ");
        x3=sc.nextDouble();
        System.out.println("Enter y3 ");
        y3=sc.nextDouble();
        
        side1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        side2=Math.sqrt(Math.pow(x3-x2,2)+ Math.pow(y3-y2, 2));
        side3=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
        
        s=(side1+side2+side3)/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
        System.out.println("The area of the triangle is " +area);
        
        		
	}

}
