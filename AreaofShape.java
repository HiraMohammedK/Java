import java.util.Scanner;

public class AreaofShape {

	void computeArea(float a)
	{
		System.out.print("Area of square is "+a*a+"sq unit");
	}
	void computeArea(float l,float b)
	{
		System.out.print("Area of rectangle is "+l*b+"sq unit");
	}
	void computeArea(double r)
	{
		double area=3.14*r*r;
		System.out.print("Area of circle is "+area+"sq unit");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		AreaofShape as = new AreaofShape();
		int choice = 1;
		
		while(choice!=2)
		{
			System.out.print("\nSelect a choice"
					+ "\n1.Rectangle"
					+ "\n2.Square"
					+ "\n3.Circle"
					+ "\nEnter your choice:");
			int option = sc.nextInt();
			switch(option)
			{
			 case 1:
				  System.out.print("Enter the length :");
		          float a =sc.nextFloat();
		          System.out.print("Enter the breadth :");
		          float b=sc.nextInt();
		          as.computeArea(a,b);
		          break;
		    case 2:
		    	 System.out.print("Enter the side : ");
		    	 float s =sc.nextFloat();
		         as.computeArea(s);
		         break;
		    case 3:
		         System.out.print("Enter the radius : ");
		         double ra =sc.nextDouble();
		         as.computeArea(ra);
		         break;
		    default:
		         System.out.println("Invalid choice");
			}
			System.out.print("\nDo you want to continue?"
					+ "\n1:Yes"
					+ "\n2:No");
			System.out.println("\n");
			System.out.println("Enter  your choice:");
			choice = sc.nextInt();
			 
		}
		
		
	
		
	  
	}
}
