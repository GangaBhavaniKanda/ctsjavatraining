package example;
import java.util.Scanner;
public class MainBinarySearch {

	public static void main(String[] args) {
		int n,searchElement;
		System.out.println("enter size of the array:");
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    int[] arr=new int[n];
	    System.out.println("enter array elements:");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    System.out.println("enter element you want to search:");
	    searchElement=s.nextInt();
	    System.out.println(BinarySearch.searchEle(arr, searchElement));
	    s.close();
	}

}
