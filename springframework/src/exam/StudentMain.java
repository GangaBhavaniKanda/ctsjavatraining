package exam;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("student-applicationcontext.xml");
		StudentDao sdao=(StudentDao)ctx.getBean("dao");
		List<Student>list=sdao.getStudents();
		System.out.println("id      "+"   name       "+" age           ");
		for(Student ele:list)
			System.out.println(ele.getId()+"    "+ele.getName()+"        "+ele.getAge());
	}

}
