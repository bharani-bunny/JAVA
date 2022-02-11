package std;

public class Student {
	private String name;
	private int rno,m1,m2,m3;
	private char grade;
	private int total;
	public Student(String s,int no, int a, int b, int c)
	{
		name = s;
		rno = no;
		m1 = a;
		m2 = b;
		m3 = c;
	}
	public int getTotal()
	{
		total = m1+m2+m3;
		return total;
	}
	public void display()
	{
		System.out.println("name of student is : "+name);
		System.out.println("Roll num of student is : "+rno);
		System.out.println("Marks in four subjects are : sub1 = "+m1+" sub2 = "+m2+" sub3 = "+m3);
		System.out.println("total marks are : "+total);
	}
}
