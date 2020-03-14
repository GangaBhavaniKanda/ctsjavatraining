/*2.write a program to read three integers values(a,b,c) and returns their sum
 however,if one of the value is 13 then it doesn't count towards sum and the next number
 number also doesn't count,so for example if b=13 then both b and c don't count.
 */
package oops;
import java.util.Scanner;
class Question2{
	static int sum(int a,int b,int c) {
		int s=0;
		if(a!=13 && b!=13 &&c!=13)
			s=a+b+c;
		else if(a!=13 && b!=13)
			s=a+b;
		else if(a!=13)
			s=a;
return s;
		
	}
}
public class SumOfThreeValues {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("sum of values:"+ Question2.sum(a, b, c));
		

	}

}
