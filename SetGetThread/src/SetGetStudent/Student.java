package SetGetStudent;

public class Student {

	private String name;
	private int age;
	public boolean flag;

	public void setName(String name, int age) {
		
		this.name = name;
		this.age = age;

	}

	public synchronized void getName() {
		
			System.out.println(name + ":" + age);
			
		}
	}

