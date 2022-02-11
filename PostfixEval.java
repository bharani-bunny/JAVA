import java.util.*;
class PostfixEval
{
  public static int evaluate(String pexp) 
  {
	Deque<Integer> res = new LinkedList<Integer>();
	String symbols[ ] = pexp.split(",");
	for (String token : symbols) 
	{
		if("+-/*".contains(token))
		{
			int y = res.removeFirst();
			int x = res.removeFirst();
			switch (token.charAt(0))
			{
				case '+': res.addFirst(x + y); break ;	
				case '-': res.addFirst(x - y); break ;
				case '*': res.addFirst(x * y); break ;
				case '/': res.addFirst(x / y); break ;
			}
		} 
		else 
		{ 
			res.addFirst(Integer.parseInt(token));
		}
	}
	return res.removeFirst();
  }
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Postfix Expression:");
	String st=sc.nextLine();
	System.out.println("The result of evaluated postfix expression is:"+ evaluate(st));
  }
}