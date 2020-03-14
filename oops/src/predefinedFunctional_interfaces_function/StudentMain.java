package predefinedFunctional_interfaces_function;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}

}

public class StudentMain {

	public static void main(String[] args) {

		Student s1=new Student("ganga",100);
		Student s2=new Student("bhavani",85);
		Student s3=new Student("satish",95);
		Student s4=new Student("xyz",50);
		Student s5=new Student("anitha",70);
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Predicate<Student>p=v->v.marks>=60;
		
		Function<Student,String>f=s->{
			String str="null";
			int marks=s.marks;
			if(marks>80)
				str="A[Distinction]";
			else if(marks>70)
				str="B[first cass]";
			else if(marks>60)
				str="c[second cass]";
			else if(marks>50)
				str="D[third cass]";
			else
				str="E[Fail]";
		return str;
		
		};
		
		Consumer<Student>c=val->{
			System.out.println(val.name);
			System.out.println(val.marks);
			System.out.println(f.apply(val));
			
		};
		for(Student x:list)
		{
			if(p.test(x))
				c.accept(x);
				
		}
		
	}

}
