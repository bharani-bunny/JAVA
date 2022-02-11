package unit3;
import java.io.*;
public class StringHandling {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter the given statement : ");
		String s,s1,s2,s3,fn,ln,Fn;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		System.out.println("The given statement is : \n"+s+"\n");
		s1 = s.toLowerCase();
		System.out.println("After converting to lowercase letters : \n"+s1);
		s2 = s.toUpperCase();
		System.out.println("After converting to uppercase letters : \n"+s2+"\n");
		System.out.println("Length of the string is : "+s.length()+"\n");
		int si = s.indexOf("Java");
		System.out.println("Index of the word Java is : "+si+"\n");
		s3 = s.replace("CS208","CSE208");
		System.out.println("Statement after replacing CS208 with CSE208 is : \n"+s3+"\n");
		int sum = 0;
		for(int i=0;i<s.length();i+=2)
			sum+=s.charAt(i);
		System.out.println("Enter your name : ");
		String name = br.readLine();
		int spi = name.indexOf(" ");
		int len = name.length();
		fn = name.substring(0,spi);
		ln = name.substring(spi+1,len);
		Fn = ln+","+fn.substring(0,1)+".";
		System.out.println("Your name is : "+Fn);
	}

}
