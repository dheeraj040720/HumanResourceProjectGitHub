import java.util.Scanner;

public class GreatestOfThree {
	
	
	
	
	public static void main(String[] args)

	{
		
		
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt(); //10
		int num2=sc.nextInt(); //20
		int num3=sc.nextInt(); //30
		
		if(num1>num2 && num1>num3) // 
		{
			System.out.println(num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}
	}
	

}
