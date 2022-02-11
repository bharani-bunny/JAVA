package unit2;

public class Staff 
{
	private int eid;
	private String ename;
	private String address;
	Staff(int no, String name, String addr)
	{
		eid = no;
		ename = name;
		address = addr;
	}
	void dispDetails()
	{
		System.out.print("Staff Id, Name and Address are : ");
		System.out.println(eid+" "+ename+" "+address);
	}
}
