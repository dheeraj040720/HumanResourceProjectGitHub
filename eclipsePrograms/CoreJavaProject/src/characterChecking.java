import java.util.Scanner;

public class characterChecking {
	
	
	static char checkingCharacter(char input)
	{
		
		
		if(input >='A' && input<='Z' || input>='a' && input<='z')
		{
			
			System.out.println("the given character is alphabet");
			
		}
		else if(input>=0 && input<=9)
		{
			System.out.println("the given char is number");
		}
		else {
			System.out.println("the given character is special character");
		}
		
		
		return input;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the character");
		
		char scan = new Scanner(System.in).next().charAt(0);
		
		char res=checkingCharacter(scan);
		
		

	}

}
