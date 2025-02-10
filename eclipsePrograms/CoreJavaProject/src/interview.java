import java.util.Scanner;

public class interview {
	
	
	public static void main(String[] args)
	{
		
		
		Scanner scan = new Scanner(System.in);
		int tenth=scan.nextInt();
		int pu=scan.nextInt();
		int degree=scan.nextInt();
		
		if(tenth>80 && pu>80 && degree>80) {
			
			System.out.println("eligible to interview");
			
			
		} else {
			System.out.println("not eligible to interview");
		}
		
		
	}

}
