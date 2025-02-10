import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size=s.nextInt();
		
		System.out.println("enter the character");
		char arr[]=new char[size];  
		
		
		

		for(int i=0;i<arr.length;i++)
		{
			
			
			arr[i]=sc.next().charAt(0);
			
			
			
			}
		
		
		for(int i=0;i<arr.length;i++)
		{
			if( arr[i]>=97 && arr[i]<=122 )
			{
				System.out.println(arr[i] + "");
			}
			
		}
			
		}
		
		
		
	}

