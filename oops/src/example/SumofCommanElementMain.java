package example;
import java.util.Scanner;
public class SumofCommanElementMain {

	public static void main(String[] args) {
		int n,m,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first array size:");
		n=s.nextInt();
		System.out.println("enter second array size:");
		m=s.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[m];
		System.out.println("enter first array elements:");
		for(i=0;i<n;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("enter second array elements:");
		for(i=0;i<m;i++)
		{
			arr2[i]=s.nextInt();
		}
		s.close();
	System.out.println("sum of comman elements in array is:"+SumofCommanElement.sum(arr1, arr2));
	}

}
