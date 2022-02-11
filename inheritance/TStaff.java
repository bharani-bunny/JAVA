package unit2;

public class TStaff extends Staff
{
	private String qualification;
	private int yoexp;
	TStaff(int no,String name, String addr, String q, int exp)
	{
		super(no , name, addr);
		qualification = q;
		yoexp = exp;
	}
	void display()
	{
		System.out.print("Staff qualification and years of experience are : ");
		System.out.println(qualification+" "+yoexp);
	}
}
