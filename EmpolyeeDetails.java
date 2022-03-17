package Basic;

import java.util.Scanner;


public class EmpolyeeDetails {
	String name;
	int age;
	float salary;
	Scanner s;
	void add()
	{
		s= new Scanner(System.in);
		System.out.println("enter Name ");
		name= s.next();//take string as input from user
		System.out.println("enter Age ");
		age= s.nextInt();
		System.out.println("enter Salary ");
		salary= s.nextFloat();
	}
	void display()
	{
		System.out.println(name +"    "+ age+"    "+salary);
	}
	public static void main(String[] args) {
		EmpolyeeDetails e= new EmpolyeeDetails();
	   e.add();
	   e.display();
	   
	}


}
