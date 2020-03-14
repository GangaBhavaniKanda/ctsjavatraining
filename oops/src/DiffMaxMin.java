//7
import java.util.Scanner;
class Diference{
	public static int diferenceMaxMin(int arr[]) {
		int i,max=0,min=123;
		if(arr.length>1) {
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min)
				min=arr[i];
		}
		return max-min;
	}
		else
			return arr[0];
	}
	
}
public class DiffMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of the array");
		int size=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the diiference between max and min number in the array is "+Diference.diferenceMaxMin(arr));

	}

}
