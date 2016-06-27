package SetGetStudent;

public class SetThread implements Runnable {
	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (x % 2 == 0) {
					s.setName("wonderful", 20);
				} else {
					s.setName("best", 18);
				}
				x++;
				s.flag = true;
				s.notify();
			}
		}
	}
}
