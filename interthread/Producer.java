package unit4;

public class Producer extends Thread{
	Bucket b;
	Producer(Bucket b)
	{
		this.b = b;
	}
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			b.put(i);
		}
	}
}
