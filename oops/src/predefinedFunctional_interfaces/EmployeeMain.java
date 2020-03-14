package predefinedFunctional_interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee("bhavani",55000f,"Pat","hyd");
		Employee e2=new Employee("ganga",25000f,"Pat","hyd");
		Employee e3=new Employee("satish",200000f,"fullstack","banglore");
		Employee e4=new Employee("anitha",25000f,"Pat","KKD");
		Employee e5=new Employee("mani",25000f,"manager","KKD");
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Predicate<Employee> p1=e->e.desg.equals("Pat");
		display(p1,list);
		Predicate<Employee> p2=e->e.city.equals("hyd");
		display(p2,list);
		Predicate<Employee> p3=e->e.salary>20000f;
		display(p3,list);
		//Predicate<Employee>p4=e->e.city.equals("hyd") && e.desg.equals("pat");
		display(p1.and(p2),list);
		//System.out.println(e1);	
		

	}
	public static void display(Predicate<Employee>p,ArrayList<Employee> list){
		for(Employee emp:list) {
			if(p.test(emp))
				System.out.println(emp);
		}
		}

}
