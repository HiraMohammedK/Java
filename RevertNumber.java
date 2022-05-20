import java.util.Scanner;

public class RevertNumber
{
	public static void main(String[] args) 
	{
	 Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        int reverse=0;
        while(n!=0)
        {
         int remainder = n%10;  
	 reverse = reverse*10 + remainder;  
	 n = n/10;  
	 }
	
		
	System.out.print("Reverse is "+reverse);	
	input.close();
	}
}
