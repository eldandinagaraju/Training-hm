package demo.java;
import java.util.*;
class Test{
	int age;
	int salary=60000;
	String desig="Developer";
	Test(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your ID");
		int id=input.nextInt();
		System.out.println("Enter your name");
		String name=input.next();
		System.out.println("Enter your age");
		age=input.nextInt();
		System.out.println("Enter your salary");
		float salary=input.nextFloat();
		System.out.println("Enter your designation");
		String designation=input.next();
		System.out.println(name+" "+id+" "+salary+" "+designation+" "+age);
	}
}
public class demo{
	public static void main(String args[]) {
		Test obj=new Test();
	}
}