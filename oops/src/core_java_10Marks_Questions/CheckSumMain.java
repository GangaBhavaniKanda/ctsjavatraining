/*1.	Check Sum of Odd Digits
Write a program to read a number , calculate the sum of odd digits (values) present in the given number.

Include a class UserMainCode with a static method checkSum which accepts a positive integer . The return type should be 1 if the sum is odd . In case the sum is even return -1 as output.

Create a class Main which would get the input as a positive integer and call the static method checkSum present in the UserMainCode.

Input and Output Format: 
Input consists of a positive integer n.
Refer sample output for formatting specifications
Sample Input 1:
56895
Sample Output 1:
Sum of odd digits is odd.
 
Sample Input 2:
84228
Sample Output 2:
Sum of odd digits is even.
*/
package core_java_10Marks_Questions;
import java.util.Scanner;
public class CheckSumMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(CheckSumMain.checkSum(num)==1)
			System.out.println("Sum of odd digits is odd.");
		else
			System.out.println("Sum of odd digits is even.");
		sc.close();
	}
	static int checkSum(int num) {
		int sum=0,rem=0,result=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem/2!=0)
				sum=sum+rem;
			num=num/10;
		}
		if(sum%2==0)
			result=-1;
		else
			result=1;
	return result;
	}
}
