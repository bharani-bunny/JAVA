package unit4;

public class MulTable {
	synchronized void displayTable(int n)
	{
		System.out.println("\n"+n+"'s Multiplication Table is : ");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
