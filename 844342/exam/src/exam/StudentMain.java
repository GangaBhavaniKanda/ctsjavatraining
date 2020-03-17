package exam;

import java.util.Iterator;
import java.util.List;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentDao dao=(StudentDao)ctx.getBean("dao");
		
		//display all records
		List<Student> list=dao.diplayAllRecords();
		Iterator itr=list.iterator();
		System.out.println("Id             Name         Age");
		while(itr.hasNext()) {
			Student s=(Student)itr.next();
			System.out.println(s.getId()+"        "+s.getName()+"         "+s.getAge());
		}
		System.out.println("================================================");
		
		// insert record if it is not exists in the table
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details of students");
		Student st=new Student();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name:");
		String name=sc.next();
		System.out.println("enter age:");
		int age=sc.nextInt();
		st.setId(id);
		st.setName(name);
		st.setAge(age);
		int res=dao.addRecord(st);
		if(res==0) {
			System.out.println("Record alredy exist with this id  do you want to update the values");
			System.out.println("Yes or  No");
			System.out.println("Enter your choice:");
			String ch=sc.next();
			ch=ch.toLowerCase();
			switch(ch) {
				case "yes":
							int update_res=dao.updateRecord(st);
							if(update_res==1)
								System.out.println("Record Updated...");
							else
								System.out.println("Record not Updated...");
							break;
				case "no":
							System.out.println("Enter new id");
							int new_id=sc.nextInt();
							st.setId(new_id);
							int insert_res=dao.addRecord(st);
							if(insert_res==1)
								System.out.println("Record inserted...");
							else
								System.out.println("Record not inserted...");
							break;
				default:
					System.out.println("wrong choice");
			}
		}
		else
			System.out.println("record inserted...");
		
		System.out.println("=========================================================");
		System.out.println("Display records based on criteria");
		System.out.println("Enter the column name on which you want apply condition");
		String col=sc.next();
		System.out.println("Enter condition");
		String condition=sc.nextLine();
		
	}
	
	
	
}
