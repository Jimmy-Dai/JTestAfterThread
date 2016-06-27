package SetGetStudent;

public class Student {

	private String name;
	private int age;
	private boolean flag;

	public synchronized void setName(String name, int age) {
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		this.age = age;

		this.flag = true;
		this.notify();
	}

	public synchronized void getName() {
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + ":" + age);

			this.flag = false;
			this.notify();
		}
	}
}
