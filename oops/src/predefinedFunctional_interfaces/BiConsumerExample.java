package predefinedFunctional_interfaces;
import java.util.ArrayList;
import java.util.function.BiConsumer;

class TempEmp{
	String name;
	double sal;
	TempEmp(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
}

public class BiConsumerExample {

	public static void main(String[] args) {
		ArrayList<TempEmp>list=new ArrayList<TempEmp>();
		list.add(new TempEmp("ganga",25600));
		list.add(new TempEmp("bhavani",10000));
		list.add(new TempEmp("satish",233900));
		list.add(new TempEmp("anitha",67455));
		list.add(new TempEmp("mani",27600));
		
		BiConsumer<TempEmp,Double>c=(e,d)->e.sal=e.sal+d;
		for(TempEmp e:list) {
			c.accept(e, 500.0);
		}
		for(TempEmp e:list) {
			System.out.println("emp name:"+e.name);
			System.out.println("emp sal:"+e.sal);
			System.out.println();
		}
	}

}
