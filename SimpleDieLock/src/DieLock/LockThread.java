package DieLock;

public class LockThread extends Thread {

	private boolean flag;

	public LockThread(boolean flag) {
		this.flag = flag;
	}

	public void run() {
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("if objA");
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("else objB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
				}
			}
		}
	}
}
