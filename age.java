//wap to print age of student

import java.util.Scanner;

class age{

public static void main(String[] args)
{
	
   Scanner sc=new Scanner(System.in); 
   Scanner salary=new Scanner(System.in);
   Scanner status=new Scanner(System.in);
   Scanner byteValue = new Scanner(System.in);
   Scanner longValue=new Scanner(System.in);
 
 System.out.println("please enter your age");
 short studentAge=sc.nextShort();
 System.out.println(studentAge);

 System.out.println("please enter your salary");
 double salaryOfEmployee=salary.nextDouble();
 System.out.println("Salary" + salaryOfEmployee);
 System.out.println("print your status");
 boolean statusofProgram=status.nextBoolean();
 System.out.println("status" + statusofProgram );
 System.out.println("enter byte value");
byte byteVariable=byteValue.nextByte();
System.out.println("byte value" + byteVariable);
System.out.println("print long value");
long longVariable=longValue.nextLong();
System.out.println("long value" + longVariable );




 


}



}