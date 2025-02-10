import java.util.Scanner;

public class gradeClass {
	
	
	static char gradeChecking(char input)
	{
		
		
		switch(input) {
		
		case 'E' : System.out.println("You have chosen : Excellent");
		break;
		
		case 'V':System.out.println("You have chosen : Very Good");
		break;
		
		case 'G': System.out.println("You have chosen : Good");
		break;
		
		case 'A':System.out.println("You have chosen : Average");
		break;
		
		case 'F': System.out.println("You have chosen : Fail");
		break;
		
		default:System.out.println("Wrong grade please choose between E V G A F for your grade ");
		break;
		
		}
		return input;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter your grade:"); //d
		
		char res= new Scanner(System.in).next().charAt(0); //d
		
		char output=gradeChecking(res); //d
		
		System.out.println(output);
		
		

	}

}
