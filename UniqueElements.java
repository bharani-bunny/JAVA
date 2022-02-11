import java.io.*;
import java.util.*;

class UniqueElements
{
  public static void main(String args[ ])throws IOException
  {
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 int n= Integer.parseInt(br.readLine());
	 String s[ ]= br.readLine().split(",");
         int n1=s.length;
	 HashSet<Integer> hs= new HashSet<Integer>(); 
	 for(int i=0; i<n1; i++)
		 hs.add(Integer.parseInt(s[i]));
	 System.out.println(hs.size()-n);
  }
}