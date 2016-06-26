package DieLock;

public class DieLockDemo {

	public static void main(String[] args) {
		LockThread lt1 = new LockThread(true);
		LockThread lt2 = new LockThread(false);

		lt1.start();
		lt2.start();
	}

}
