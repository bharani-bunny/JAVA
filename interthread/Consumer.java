package unit4;

public class Consumer extends Thread{
	Bucket b;
	Consumer(Bucket b)
	{
		this.b=b;
	}
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			b.get();
		}
	}
}
