package unit4;

public class MyThread2 extends Thread{
	MulTable mt;
	MyThread2(MulTable obj)
	{
		mt = obj;
	}
	public void run()
	{
		mt.displayTable(7);
	}
}
