package priti;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    double radius,area,volume;
    
    System.out.println("Enter the radius of the hemisphere: ");
    radius=sc.nextDouble();
    
    area=3*Math.PI*(radius*radius);
    volume=(2.0/3)*Math.PI*(radius*radius*radius);
    
    System.out.println("The surface area of the hemisphere is " +area);
    System.out.println("The volume area of the hemisphere is " +volume);
    
		    
	}

}
