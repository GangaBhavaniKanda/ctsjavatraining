package exam;

public class Person {
	private String name;
	private int age;
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
	public void showData() {
		System.out.println("name "+getName()+"  age "+getAge());
}
	public void start() {
		System.out.println("person bean is initialized");
	}
	public void stop() {
		System.out.println("person bean is destroyed");
	}
}