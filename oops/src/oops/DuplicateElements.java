/*
 8.write a program to read a integer array .remove the duplicate elements and
  display sum of even numbers in the output.if input array contains only odd numbers ten 
  return -1
 */
package oops;
import java.util.Scanner;
class Duplicate{
	static int sum(int arr[]){
		int i,j,n,sum=0,oddcount=0;
		n=arr.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					for(int k=j;k<n-1;k++) {
						arr[k]=arr[k+1];
					}
					n--;
				}
				else
					continue;
				
			}
		
	  }
		for(i=0;i<n;i++)
		{
			if(arr[i]%2!=0) {
			  oddcount++;
			}
			else {
				sum=sum+arr[i];
			}
		}
		if(oddcount==n)
			return -1;
		else
			return sum;
}
}
public class DuplicateElements {

	public static void main(String[] args) {
		int n,i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of the array:");
		n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("enter array elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Duplicate.sum(arr));

	}

}
