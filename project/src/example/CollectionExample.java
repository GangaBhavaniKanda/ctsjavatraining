//sorting the student objects based on age
package example;
import java.util.*;

public class CollectionExample {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<Student>();
		Student s1=new Student("ganga",20,"hyd");
		Student s2=new Student("bhavani",21,"kkd");
		Student s3=new Student("satish",22,"hyd");
		Student s4=new Student("anitha",18,"hyd");
		Student s5=new Student("mani",9,"hyd");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Collections.sort(list);
		list.forEach(System.out::println);
		
		
	}

}
