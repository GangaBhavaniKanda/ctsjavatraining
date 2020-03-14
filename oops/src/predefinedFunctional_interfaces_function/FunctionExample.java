package predefinedFunctional_interfaces_function;

import java.util.function.Function;


class User1{
	int uid;
	String pswd;
	User1(int uid,String str){
		this.uid=uid;
		this.pswd=str;
	}
}

public class FunctionExample {

	public static void main(String[] args) {
		
		//length of given string
		Function<String,Integer>f=s->s.length();
		System.out.println("length of string is:"+f.apply("ganga"));
		
		//square of the number
		Function<Integer,Integer>f1=s->s*s;
		System.out.println("square is :"+f1.apply(5));
		
		//finding factorial of the number
		Function<Integer,Integer>f2=num->{
			int fact=1;
			for(int i=1;i<=num;i++)
				fact=fact*i;
		return fact;
		};
		System.out.println("factorial:"+f2.apply(5));
		
		//counting no.of vowels in string
		Function<String,Integer>f3=s->{
			int c=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
					c++;
			}
			return c;
		};
		System.out.println("no of vowels:"+f3.apply("bhavani"));
		
		//total no.of character exculding blank spaces
		Function<String,Integer>f4=s->{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
					continue;
				else
					count++;
					
			}
			return count;
			
		};
		System.out.println("no.of chars:"+f4.apply("ganga bhavnai"));
		
		//Authentication 
		User1 u1=new User1(12343,"ganga");
		User1 u2=new User1(1234,"admin");
		Function<User1,Boolean>f5=s->s.uid==1234 && s.pswd.equals("admin");
		if(f5.apply(u2))
			System.out.println("authentication successfull");
		else
			System.out.println("invalid authentication ");
			
			
		

	}
	

}
