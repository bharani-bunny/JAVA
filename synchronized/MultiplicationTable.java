package unit4;

public class MultiplicationTable {

	public static void main(String[] args) {
		MulTable ob = new MulTable();
		MyThread1 th1 = new MyThread1(ob);
		MyThread2 th2 = new MyThread2(ob);
		th1.start();
		th2.start();
	}

}
