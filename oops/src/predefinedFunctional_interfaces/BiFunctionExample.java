package predefinedFunctional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
class Stude{
	String name;
	String holl_no;
	Stude(String name,String holl_no){
		this.name=name;
		this.holl_no=holl_no;
	}
	@Override
	public String toString() {
		return "Stude [name=" + name + ", holl_no=" + holl_no + "]";
	}
}

public class BiFunctionExample {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>add=(a,b)->(a+b);
		BiFunction<Integer,Integer,Integer>sub=(a,b)->(a-b);
		BiFunction<Integer,Integer,Integer>prod=(a,b)->(a*b);
		System.out.println("addition of two numbers:"+add.apply(10, 20));
		System.out.println("sub of two numbers:"+sub.apply(10, 20));
		System.out.println("product of two numbers:"+prod.apply(10, 20));
		System.out.println();

		//bifunction with use defined objects
		BiFunction<String,String,Stude>bf=(s1,s2)->(new Stude(s1,s2));
		Stude ss=bf.apply("bhavani","n130963");
		System.out.println(ss);
		
		
		//biconsumer
		BiConsumer<String,String>bic=(s1,s2)->System.out.println(s1.concat(s2));
		bic.accept("ganga", "bhavani");

	}

}
