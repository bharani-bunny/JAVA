package unit4;

public class Bucket 
{
	int x;
	boolean full = false;
	synchronized void get()
	{
		if(full == false)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Consumed: "+x);
		full = false;
		notify();
	}
	synchronized void put(int n)
	{
		if(full == true)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		x = n;
		System.out.println("Produced: "+x);
		full = true;
		notify();
	}	
}
