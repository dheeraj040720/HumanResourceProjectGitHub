import java.util.Scanner;

class highest {
	 
	 
	 static  boolean checkTheGreatest(int num1,int num2)
	 {
		 
		 Scanner scan= new Scanner(System.in);
		 
		 
		// num1=scan.nextInt();

		 //num2=scan.nextInt();
		 
		 
		 if(num1>num2 )
		 {
			 
			 return  true;	
		 }
		 
		 else {
			 
			 return false;
		 }
		
	 }
	 
	 
	 
	 public static void main(String[] args)
	 {
		 
		 
		 Scanner scan = new Scanner(System.in);
		 int num1=scan.nextInt();
		 int num2=scan.nextInt();
	boolean res=checkTheGreatest(num1,num2);
	
	
	if(res)
	{
	System.out.println(num1);
		
	} else {
		
		System.out.println(num2);
	}
	
		 
	 }

}
