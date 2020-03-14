//sorting the student objects based on age
package example;

class Student implements Comparable<Student> {
	String name;
	Integer age;
	String city;
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", city=" + city ;
	}
	public Student(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	@Override
	public int compareTo(Student s) {
		if(age.compareTo(s.age)>0)
			return -1;
		else if(age.compareTo(s.age)<0)
			return 1;
		else
			return 0;
		
		
	}
}