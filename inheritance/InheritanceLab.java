package unit2;

public class InheritanceLab 
{
	public static void main(String[] args) 
	{	
		NStaff ns = new NStaff(1,"vamsi","knl",50);
		RTStaff rts = new RTStaff(2,"madesh","kdmr","MTech",2,10000);
		ATStaff ats = new ATStaff(201,"bharani","knl","MSC",7,50000);
		System.out.println("Non Teaching staff Details");
		System.out.println("______________________________________");
		ns.updateWages(100);
		System.out.println("Regular Teaching Staff Details : ");
		System.out.println("_______________________________________");
		rts.calcGross();
		System.out.println("Ad-hoc Teaching staff Details");
		System.out.println("________________________________________");
		ats.salaryDetails();
	}
}
