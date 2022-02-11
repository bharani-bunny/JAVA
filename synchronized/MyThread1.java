package unit4;

public class MyThread1 extends Thread{
	MulTable mt;
	MyThread1(MulTable obj)
	{
		mt = obj;
	}
	public void run()
	{
		mt.displayTable(5);
	}
}
