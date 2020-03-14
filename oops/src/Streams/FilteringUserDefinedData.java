package Streams;
import java.util.*;
import java.util.stream.Collectors;
class Product{
	int id;
	String name;
	double price;
	Product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class FilteringUserDefinedData {

	public static void main(String[] args) {
		Product p1=new Product(1001,"samsung",50000);
		Product p2=new Product(1002,"sony",40000);
		Product p3=new Product(1003,"apple",70000);
		Product p4=new Product(1004,"voltos",20000);
		Product p5=new Product(1005,"samsung",55000);
		Product p6=new Product(1006,"sony",44000);
		Product p7=new Product(1006,"apple",150000);
		Product p8=new Product(1008,"voltos",220000);
		ArrayList<Product>list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
			List<Product>l=	list.stream().filter(x->x.price>=25000).map(x->x).collect(Collectors.toList());
			l.forEach(System.out::println);
			//counting satisfying values
			long c=list.stream().filter(x->x.price>=25000).map(x->x).count();
			System.out.println("count :"+c);
			
			//sorting user defined objects data based on name
			list.stream().sorted((a,b)->a.name.compareTo(b.name)).forEach(System.out::println);
			
			//max value and min value
			Product p= list.stream().max((a,b)->a.price<b.price?-1:1).get();
			System.out.println("max value:"+p);
			
			Product pmin= list.stream().min((a,b)->a.price<b.price?-1:1).get();
			System.out.println("min value:"+pmin);
			
			//max value of out of apple products
			 Product pmax=list.stream().filter(x->x.name.equals("apple")).max((a,b)->a.price<b.price?-1:1).get();
			 System.out.println("maximum price in apple products is:"+pmax);
			 
			 List<Product> l1= list.stream().filter(x->x.name.equals("apple")).sorted((a,b)->Double.compare(a.price, b.price)).collect(Collectors.toList());
			System.out.println(l1);
			
			//find minimum of average of any two given products
			Double d=list.stream().filter(x->x.name.equals("apple")).collect(Collectors.averagingDouble(x->x.price));
			
			Double d1=list.stream().filter(x->x.name.equals("voltos")).collect(Collectors.averagingDouble(x->x.price));
			if(d<d1) {
				System.out.println(d);
			}

			else
				System.out.println(d1);
	}


}
