package unit3;

public class Arithmetic {

	public static void main(String[] a) {
		try
		{
			int m = Integer.parseInt(a[1]);
			int n = Integer.parseInt(a[2]);
			if(a[0].equals("+"))
			{
				int s= m+n;
				System.out.println("Sum of "+a[1]+" and "+a[2]+" is : "+s);
			}
			else if(a[0].equals("-"))
			{
				int r=m-n;
				System.out.println("Differece of "+a[1]+" and "+a[2]+" is : "+r);
			}
			else if(a[0].equals("/"))
			{
				int q=m/n;
				System.out.println("Division of "+a[1]+" and "+a[2]+" is : "+q);
			}
			else if(a[0].equals("X"))
			{
				int e=m*n;
				System.out.println("Multiplication of "+a[1]+" and "+a[2]+" is : "+e);
			}
			else
				System.out.println("Invalid operation");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division by zerooo.."+ae);
		}
		catch(ArrayIndexOutOfBoundsException aobe)
		{
			System.out.println("Array index crossed exception.."+aobe);		
		}
		finally
		{
			System.out.println("Finally block was executed at any cost");
		}
		System.out.println("Rest of the code...");

	}

}
