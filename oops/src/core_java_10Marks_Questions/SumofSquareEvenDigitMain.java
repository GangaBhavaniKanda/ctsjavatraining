/*3.Sum of Squares of Even Digits
 
Write a program to read a number , calculate the sum of squares of even digits (values) present in the given number.
 
Include a class UserMainCode with a static method sumOfSquaresOfEvenDigits which accepts a positive integer . The return type (integer) should be the sum of squares of the even digits.
 
Create a class Main which would get the input as a positive integer and call the static method sumOfSquaresOfEvenDigits present in the UserMainCode.
 
Input and Output Format:
Input consists of a positive integer n.
Output is a single integer .
Refer sample output for formatting specifications.
Sample Input 1:
56895
Sample Output 1:
100
*/
package core_java_10Marks_Questions;
import java.util.Scanner;
public class SumofSquareEvenDigitMain {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int res=sumOfsquareofEvenDigits(num);
		System.out.println(res);
		sc.close();

	}
	public static int sumOfsquareofEvenDigits(int num)
	{
		int sum=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem%2==0)
				sum=sum+(rem*rem);
			num=num/10;
		}
		
		return sum;
	}

}
