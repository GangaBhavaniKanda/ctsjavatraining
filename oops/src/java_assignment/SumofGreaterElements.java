//5.Given an int array and number as input,write a program to add all the elements in the array greater than given number.finally reverse the digits of obtained sum and print it.
package java_assignment;
import java.util.Scanner;
class Sum{
	static int maxElementSumReverse(int []arr,int num) {
		int i,sum=0,rev=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>num)
				sum=sum+arr[i];
			else
				continue;
		}
		
		while(sum!=0)
		{
			int rem=sum%10;
			rev=rev*10+rem;
			sum=sum/10;
			
		}
		return rev;
		
	}
}
public class SumofGreaterElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,size;
		System.out.println("enter array size:");
		size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("enter array elements:");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter input number");
		num=sc.nextInt();
		System.out.println("reverse of sum of elements greater than given number "+Sum.maxElementSumReverse(arr, num));
	

	}

}
