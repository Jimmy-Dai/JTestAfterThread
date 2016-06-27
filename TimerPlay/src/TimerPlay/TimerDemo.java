package TimerPlay;

import java.util.Timer;

public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new MyTask(t), 3000);
	}
}
