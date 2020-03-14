//4.write a program to read a non-negative integer N,compare sum of its digits.if sum is greater than 9 then repeat the process and calculate sum once again until final sum comes to single digits.and return single digit
package java_assignment;
import java.util.Scanner;
class Question4{
	static int sumOfDigitsUptoSingleDigit(int num) {
		int sum=0,rem;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(sum>9)
		{
			sum=Question4.sumOfDigitsUptoSingleDigit(sum);
		}
		
			

return sum;
		
	}
}
public class SumOfDigits {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
			System.out.println(Question4.sumOfDigitsUptoSingleDigit(num));
		else
			System.out.println("enter non-negative integer");
		
			
	}

}
