
import java.util.Scanner;
class average{

public static void main(String[] args){


Scanner scan=new Scanner(System.in);


System.out.println("enter first number");

int a=scan.nextInt();

System.out.println("enter second number");
int b =scan.nextInt();

System.out.println("enter third number");
int c =scan.nextInt();



System.out.println("enter fourth number");
int d =scan.nextInt();


int average=(a+b+c+d)/4;

System.out.println("average:" + average);

}
}