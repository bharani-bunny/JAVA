package unit2;
import java.util.*;

public class InterfaceLab {
	public static void main(String arg[ ])
	 {
	  TA t=new TA();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Name,Age and Gender of the candidate:");
	  t.getNAG(sc.nextLine(),sc.nextInt(),sc.next());
	  System.out.println("Enter Sid and Course Name:");
	  t.getSC(sc.next(),sc.next());
	  System.out.println("Enter Eid and Basic Salary:");
	  t.getEidSal(sc.next(),sc.nextInt());
	  t.display();
	 }
}