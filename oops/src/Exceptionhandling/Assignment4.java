/*Assignment-4
------------

Write a Program with a division method who receives two integer numbers and performs the 
division operation. The method should declare that it throws ArithmeticException. 
This exception should be handled in the main method.
 * */
package Exceptionhandling;
import java.util.Scanner;
class Division extends Exception {
	public void division(int a,int b)throws ArithmeticException{
		int c=a/b;
		System.out.println("c value "+c);
	}
	

}
class Assignment4{
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Division d=new Division();
		try {
			d.division(a, b);
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled in main method");
		}
		
	}
	
}
