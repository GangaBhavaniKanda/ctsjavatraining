//7.write a program to read an interger and find the sum of all odd numbers up to given number
package java_assignment;
import java.util.Scanner;
class OddElements{
	static int sum(int n) {
		int sum=0,i;
		for(i=1;i<=n;i++) {
			if(i%2!=0)
				sum=sum+i;
		}
		return sum;
		
		
	}
}

public class SumofOdds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("sum od all odd numbers up to given number:"+OddElements.sum(num));
		

	}

}
