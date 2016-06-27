package TimerPlay;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private Timer t;
	public MyTask(){}
	public MyTask(Timer t){
		this.t=t;
	}
	@Override
	public void run() {
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("calc");
			t.cancel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
