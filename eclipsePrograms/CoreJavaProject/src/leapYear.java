import java.util.Scanner;

public class leapYear {
	
	
	static int leapYearProblem(int year)
	{
	 
	 if(year%4==0 && year %100!=0 || year % 400==0 )
		 
	 {
	   return 1;
	}
	 else {
		 return 0;
	 }
	
	}
	
	public static void main(String[] args)
	
	{
		System.out.println("enter the year");
		int  scan = new Scanner(System.in).nextInt();
		
		if(leapYearProblem(scan)==1)
		{
			System.out.println("the given year is leap year");
			
		} else {
			
			System.out.println("the given year is not a leap year");
		}
		
		
		
		
		
	}

}
