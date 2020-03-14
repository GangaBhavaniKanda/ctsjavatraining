//checking given number is prime or not
package example;
import java.util.Scanner;
public class PrimeMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int number=s.nextInt();
		System.out.println(Prime.isPrime(number));
		s.close();

	}

}
