package Reflect;

public class Person {
	private String name;
	int age;
	public String address;

	public Person() {
	}

	private Person(String name) {
		this.name = name;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private void show() {
		System.out.println("its private show");
	}

	public void method(String name) {
		this.name = name;
		System.out.println(name + ":" + age + ":" + address);
	}

	@Override
	public String toString() {
		return name + "---" + age + "---" + address;
	}
}
