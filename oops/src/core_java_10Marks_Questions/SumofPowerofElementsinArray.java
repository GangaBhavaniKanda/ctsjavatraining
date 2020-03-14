package core_java_10Marks_Questions;
import java.util.Scanner;
class SumOfPower{
 public static int getSumogPower(int arr[]) {
	 int sum=0;
	 for(int i=0;i<arr.length;i++) {
		 sum= sum+(int)Math.pow(arr[i], i);
		 
	 }
	 return sum;
 }
}

public class SumofPowerofElementsinArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(SumOfPower.getSumogPower(arr));
	}

}
