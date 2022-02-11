package unit4;

public class ITC {

	public static void main(String[] args) {
		Bucket b = new Bucket();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		c.start();
		p.start();

	}

}
