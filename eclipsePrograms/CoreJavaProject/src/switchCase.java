import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		char letter;
		
		System.out.println("enter the character");
		letter=scan.next().charAt(0);
		

		switch(letter)
		{
		
		case 'a': System.out.println("vowel");
		break;
		case 'e': System.out.println("vowel");
		break;
		case 'i': System.out.println("vowel");
		break;
		case 'o': System.out.println("vowel");
		break;
		case 'u': System.out.println("vowel");
		break;
		default:System.out.println("consonent");
		
		}
	}

}
