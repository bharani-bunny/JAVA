package unit2;

import std.*;
import std.grd.*;
import java.util.Scanner;

class StudentResult
{
	public static void main(String arg[ ])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of the student:");
		String name=sc.nextLine();
		System.out.println("Enter Roll num of the student:");
		int no=sc.nextInt();
		System.out.println("Enter Marks in first subject:");
		int s1=sc.nextInt();
		System.out.println("Enter Marks in second subject:");
		int s2=sc.nextInt();
		System.out.println("Enter Marks in third subject:");
		int s3=sc.nextInt();
		Student s=new Student(name,no,s1,s2,s3);
		int t=s.getTotal();
		Grade gr=new Grade(t);
		char g=gr.getGrade();
		s.display();
		System.out.println("Grade is: "+g);
	}
}