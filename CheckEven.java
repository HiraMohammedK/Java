import java.util.Scanner;

public class CheckEven
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        if(n % 2 == 0)

        {
            System.out.println("The given number "+n+" is even ");
        }
        else
        {
            System.out.println("The given number "+n+" is odd ");
	    }
		input.close();
	}
}
