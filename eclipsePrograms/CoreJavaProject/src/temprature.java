import java.util.Scanner;

public class temprature {
	
	static int tempratureChecking(int temp)
	{
		
		
		//int temp = new Scanner(System.in).nextInt();
	
		
		
		if(temp <=0)
		{
			
			System.out.println("the temprature is freezing");
			
		} else if(temp >=40)
		{
			
			System.out.println("the temprature is  hot ");
		}
		
		else if(temp > 20 && temp<35)
				
		{
			
			System.out.println("the temprature is normal");
		}
		
		else if(temp>50)
		{
			System.out.println("the temprature is too hot");
		}
		else {
			System.out.println("the temprature is cool");
		}
		
		
		return temp;
		
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.out.println("Enter the temprature");
		
		int res=new Scanner(System.in).nextInt();
		
	
		tempratureChecking(res);
		
		

	}

}
