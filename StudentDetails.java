import java.util.*;
class Student
{
	int rno;
	String name;
	float cgpa;
	void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		rno = sc.nextInt();
		name = sc.next();
		cgpa = sc.nextFloat();
	}
	void putDetails()
	{
		System.out.println(rno+" "+name+" "+cgpa);
	}
}
class StudentDetails
{
	public static void main(String args[])
	{
		int n,i;
		System.out.println("Enter number of students : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Student s[] = new Student[n];
		for(i = 0; i<n; i++)
		{
			s[i] = new Student();
			System.out.println("Enter student"+(i+1)+"Number,Name and CGPA : ");
			s[i].getDetails();
		}
		System.out.println("\nThe details of student are : ");
		for(i = 0; i < n; i++)
		{
			System.out.println("Student"+(i+1)+"Number,Name and CGPA are : ");
			s[i].putDetails();
		}
	}
}

			
