package example;
import java.util.Scanner;
public class UseMainLinear {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of the array:");
		n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter element you want to search:");
		int searchElement=s.nextInt();
		System.out.println(SearchElement.findElement(arr,searchElement));
		s.close();
	}

}
