package unit3;

import java.io.*;

class AgeLimitException extends Exception
{
	int age;
	AgeLimitException(int ag)
	{
		age = ag;
	}
	public String toString()
	{
		return("Age is not enough! "+age+" only!!");
	}
}

public class StudentRegistration {
	public static void studentDetails(String i, String j, int k) throws AgeLimitException
	{
		if(k < 16)
			throw new AgeLimitException(k);
		System.out.println("Details of students are : ");
		System.out.println("Name of the student : "+i);
		System.out.println("Name of the course : "+j);
		System.out.println("Age of the student : "+k);
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the student : ");
		String name = br.readLine();
		System.out.println("Enter course name : ");
		String course = br.readLine();
		System.out.println("Enter age of the student : ");
		String ag = br.readLine();
		int age = Integer.parseInt(ag);
		try
		{
			studentDetails(name,course,age);
		}
		catch(AgeLimitException ale)
		{
			System.out.println("Exception handeled....."+ale);
		}
	}
}