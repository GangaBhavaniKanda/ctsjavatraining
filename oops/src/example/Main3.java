// finding nature of quadratic equation
package example;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter x^2 value");
		a=s.nextInt();
		System.out.println("Enter x value");
		b=s.nextInt();
		System.out.println("Enter constant value");
		c=s.nextInt();
		System.out.println(UserMain3.findRoots(a, b, c));
		s.close();

	}

}
