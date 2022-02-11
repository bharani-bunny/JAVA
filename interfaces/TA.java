package unit2;

public class TA implements student,staff{
	 String name,gender,sid,eid,coname;
	 int age,basicsal;
	 double grossCalculate()
	 {
		 return(basicsal+basicsal*hra+basicsal*da);
	 }
	 public void getNAG(String n,int a,String g)
	 {
		  name=n;
		  age=a;
		  gender=g;
	 }
	 public void getSC(String id,String cn)
	 {
		  sid=id;
		  coname=cn;
	 }
	 public void getEidSal(String e,int bs)
	 {
		  eid=e;
		  basicsal=bs;
	 }
	 public void display()
	 {
		  System.out.println("Name,Age and Gender of the candidate are:");
		  System.out.println(name+" "+age+" "+gender);
		  System.out.println("Sid and Course name of the candidate are:");
		  System.out.println(sid+" "+coname);
		  System.out.println("Employee ID,Basic salary and Gross salary are:");
		  System.out.println(eid+" "+basicsal+" "+grossCalculate());	
	 }
}

