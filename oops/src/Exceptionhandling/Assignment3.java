package Exceptionhandling;
/*Assignment-3
-------------
Write a class MathOperation which accepts integers from command line. 
Create an array using these parameters. Loop through the array and obtain the sum and 
average of all the elements. 
Display the result. 
Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
For example: The class would be invoked as follows: 
C:>java MathOperation 1900, 4560, 0, 32500
*/
public class Assignment3 {

	public static void main(String[] args) {
		int sum=0;
		float avg;
		try {
		int arr[]=new int[args.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero not possible");
	    }
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException occur");
	    }
	

	}

}

