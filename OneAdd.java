import java.util.*;
class OneAdd
{
  public static List<Integer> addOne(List<Integer> A)
  {
	int n= A.size()-1;
	A.set(n,A.get(n)+1);
	for(int i=n; i>0&& A.get(i)==10; --i)
	{
		A.set(i,0);
		A.set(i-1,A.get(i-1)+1);
	}
	if(A.get(0)==10)
	{
		A.set(0,0);
	        A.add(0,1);
	}
	return A;
  }
  public static void main(String args[ ])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	String num=sc.nextLine();
	List <Integer> al= new ArrayList<Integer>();
	for(int i=0;i<num.length();i++)
	{
		//al.add((int)num.charAt(i)-48);
		al.add(Integer.parseInt(String.valueOf(num.charAt(i))));
	}
	System.out.println(addOne(al));
        System.out.print("Result after adding one is: ");
	for(int st:al)
		System.out.print(st);
	System.out.println();
  }
}